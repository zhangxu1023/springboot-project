package com.jht.common.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.jht.common.constant.BaseConstant;
import com.jht.common.redis.RedisUtil;
import com.jht.common.web.HttpStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;


/**
 * @Description: 日志临时拦截器
 * @author Alvis
 * @date 2017年11月27日 下午4:39:17
 */
@Slf4j
public class LogInterceptor implements HandlerInterceptor {

	@Autowired
	private RedisUtil redisUtil;

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// System.out.println("controller result final end");
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// System.out.println("controller result");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object obj) throws Exception {
		String json = HttpHelper.getBodyString(request);
		log.info(obj.toString());

		// 打印head头中的device-flag
		String deviceFlag = request.getHeader(BaseConstant.DEVICE_FLAG);
		if (StringUtils.isNotBlank(deviceFlag)) {
			log.info("head中设备标识为：" + deviceFlag);
		}
		// 打印head头中的user-agent
		String userAgent = request.getHeader("user-agent");
		if (StringUtils.isNotBlank(userAgent)) {
			log.info("head中user-agent为：" + userAgent);
		}
		String apiMethodName = obj.toString();
		// 控制台输出log，提取到私有方法，便于后续添加接口
		this.writeLogOnConsole(apiMethodName, json);
		String flag = request.getHeader("is_check_user_status");

		// 初始化验证token参数，因为下方有两处地方有可能会调用验证token方法，由于两处各自独立，为了避免重复调用，设置该参数
		Boolean verifyTokenRedis = null;
		// 判断如果请求是51有色网站，校验token是否失效，如果失效，将返回response的head头中isExpire置为true（网站V3.3）
		if (Objects.equals(deviceFlag, BaseConstant.DEVICE_FLAG_51WEB)) {
			String token = request.getHeader("Authorization");
			if (StringUtils.isNotBlank(token)) {
				verifyTokenRedis = redisUtil.verifyTokenRedis(token, request);
				if (!verifyTokenRedis) {
					response.setHeader("isExpire", "true");
				}
			}
		}

		if (Objects.equals(flag, "true")) {
			String token = request.getHeader("Authorization");
			if (verifyTokenRedis == null) {
				verifyTokenRedis = redisUtil.verifyTokenRedis(token, request);
			}
			if (verifyTokenRedis) {
				return true;
			} else {
				JsonResponse.jsonWrite(response, Integer.toString(HttpStatusEnum.UNAUTHORIZED.value()),
						BaseConstant.MESSAGE_ERROR_TOKEN_MISSING);
				return false;
			}
		}
		return true;
	}

	private void writeLogOnConsole(String apiMethodName, String json) {
		if (isJsonArray(json)) {
			log.info(json);
			return;
		}
		JSONObject jsonObjectForLog = JSON.parseObject(json);
		// 上传合同附件接口，log不输出文件的base64值
		if (apiMethodName.contains(BaseConstant.ECONTRACT_ATTACHMENT_UPLOAD)) {
			jsonObjectForLog.put("contractFile", null);
			log.info(jsonObjectForLog.toJSONString());
			// 无需输出log
		} else if (apiMethodName.contains(BaseConstant.OPENAPI_ECONTRACT_CONTRACTUPLOAD)
				|| apiMethodName.contains(BaseConstant.OPENAPI_ECONTRACT_COMPANYAUTHORATIONVERIFICATION)
				|| apiMethodName.contains(BaseConstant.OPENAPI_ECONTRACT_CONTRACTGETSIGNERSTATUS)
				|| apiMethodName.contains(BaseConstant.OPENAPI_ECONTRACT_CONTRACTSENDMANUAL)
				|| apiMethodName.contains(BaseConstant.OPENAPI_ECONTRACT_CONTRACTLOCK)
				|| apiMethodName.contains(BaseConstant.OPENAPI_ECONTRACT_CONTRACTDOWNLOAD)
				|| apiMethodName.contains(BaseConstant.COMMON_UPLOAD)) {
		} else if (apiMethodName.contains(BaseConstant.SUBMIT_COMPANY_REVIEW)
				|| apiMethodName.contains(BaseConstant.COMPANY_UPDATE)) {
			// 企业认证审核提交
			jsonObjectForLog.put("linessImageBase64Code", null);
			jsonObjectForLog.put("linessImage2Base64Code", null);
			jsonObjectForLog.put("linessImage3Base64Code", null);
			jsonObjectForLog.put("unifiedImgBase64Code", null);
			jsonObjectForLog.put("authorizationBase64Code", null);
			log.info(jsonObjectForLog.toJSONString());
		} else if(apiMethodName.contains(BaseConstant.ADD_FRAME_CONTRACT)){
			if(jsonObjectForLog.containsKey("contractFile")) {
				jsonObjectForLog.put("contractFile", null);
			}
			if(jsonObjectForLog.containsKey("contractFileBase64Code")) {
				jsonObjectForLog.put("contractFileBase64Code", null);
			}
			log.info(jsonObjectForLog.toJSONString());
		} else {
			// 其它接口，按现行规则输出log
			log.info(json);
		}
	}

	/**
	 * 判断字符串是否可以转化为JSON数组
	 * @param content
	 * @return
	 */
	public static boolean isJsonArray(String content) {
		if(StringUtils.isBlank(content))
			return false;
		StringUtils.isEmpty(content);
		try {
			JSONArray jsonStr = JSONArray.parseArray(content);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
