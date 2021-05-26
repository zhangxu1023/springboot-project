package com.jht.common.utils;

import com.jht.common.constant.BaseConstant;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @Description:校验
 * @author Alvis
 * @date 2018年5月9日 上午9:41:07
 */
public class VerifyUtils {

	/**
	 * @Description 密码正则校验
	 * @return
	 * @author Alvis
	 * @date 2018年5月9日 上午9:42:13
	 */
	public static boolean verifyPassword(String result) {
		if (null == result || result.isEmpty()) {
			return false;
		}

		Pattern pat = Pattern.compile(BaseConstant.REGEXP_PASSWORD);
		Matcher mat = pat.matcher(result);
		return mat.matches();
	}

	/**
	 * @Description 用户名正则校验
	 * @param result
	 * @return
	 * @author Alvis
	 * @date 2018年5月12日 上午9:12:29
	 */
	public static boolean verifyUserName(String result) {
		if (null == result || result.isEmpty() || result.length() < 8 || result.length() > 16) {
			return false;
		}

		Pattern pat = Pattern.compile(BaseConstant.REGEXP_USERNAME);
		Matcher mat = pat.matcher(result);
		return mat.matches();
	}

	public static boolean verifyRealName(String result) {
		if (null == result || result.isEmpty() || result.length() < 2 || result.length() > 20) {
			return false;
		}
		String realName = result.trim();

		if (realName.indexOf("#") != -1) {
			return false;
		}
		if (realName.indexOf("'") != -1) {
			return false;
		}
		if (realName.indexOf("-") != -1) {
			return false;
		}
		if (realName.indexOf(";") != -1) {
			return false;
		}
		if (realName.indexOf("*") != -1) {
			return false;
		}
		if (realName.indexOf("\"") != -1) {
			return false;
		}
		if (realName.indexOf("/") != -1) {
			return false;
		}

		return true;
	}

	/**
	 * @Description 公司名正则校验
	 * @param result
	 * @return
	 * @author Alvis
	 * @date 2018年6月30日 上午9:13:13
	 */
	public static boolean verifyCompanyName(String result) {
		// 3796
		if (StringUtils.isEmpty(result) || result.trim().length() < 4 || result.trim().length() > 40) {
			return false;
		}

		String companyName = result.trim();

		if (companyName.indexOf("#") != -1) {
			return false;
		}
		if (companyName.indexOf("'") != -1) {
			return false;
		}
		// 3796
		/*
		 * if (companyName.indexOf("-")!=-1) { return false; }
		 */
		if (companyName.indexOf(";") != -1) {
			return false;
		}
		if (companyName.indexOf("*") != -1) {
			return false;
		}
		if (companyName.indexOf("\"") != -1) {
			return false;
		}
		if (companyName.indexOf("/") != -1) {
			return false;
		}

		return true;
		/*
		 * Pattern pat = Pattern.compile(BaseConstant.REGEXP_COMPANYNAME); Matcher mat =
		 * pat.matcher(result); return mat.matches() ? false : true;
		 */
	}

	/**
	 * @Description 判断所有的数值均为正整数 或 0，可抛异常，注意捕获
	 * @param list
	 * @return false 校验失败 true 验证通过
	 * @author Alvis
	 * @date 2018年7月2日 下午1:27:21
	 */
	public static boolean verifyBigDecimalNegative(List<BigDecimal> list) {
		boolean flag = false;
		if (null == list || list.size() == 0) {
			return flag;
		}

		for (BigDecimal result : list) {
			if (null == result || result.signum() == -1) {
				return flag;
			}
		}

		return true;
	}

	/**
	 * @Description 手机号正则校验
	 * @param mobileNumber
	 * @return
	 * @author Alvis
	 * @date 2018年5月12日 上午9:12:29
	 */
	public static boolean verifyMobileNumber(String mobileNumber) {
		if (null == mobileNumber || mobileNumber.isEmpty()) {
			return false;
		}

		Pattern mobilePattern = Pattern.compile(BaseConstant.REGEXP_MOBILE);
		Matcher mobileMatcher = mobilePattern.matcher(mobileNumber);

		Pattern telephonePattern = Pattern.compile(BaseConstant.REGEXP_TELEPHONE);
		Matcher telephoneMatcher = telephonePattern.matcher(mobileNumber);
		return mobileMatcher.matches() || telephoneMatcher.matches();
	}

	/**
	 * @Description 数字正则校验
	 * @param mobileNumber
	 * @return
	 * @author zhangxu
	 * @date 2018年5月12日 上午9:12:29
	 */
	public static boolean verifyNumber(String number) {
		if (null == number || number.isEmpty()) {
			return false;
		}

		Pattern numberPattern = Pattern.compile(BaseConstant.REGEXP_NUMBER);
		Matcher numberMatcher = numberPattern.matcher(number);

		return numberMatcher.matches();
	}

	// APP V3.4 --开始
	/**
	 * @Description 根据头信息判断是否为APP登录
	 * @param deviceFlag
	 * @return
	 * @author zhangxu
	 * @date 2019年12月25日 上午10:19:00
	 */
	public static Boolean isLoginByApp(String deviceFlag) {
		// 返回值初始化
		Boolean resultFlag = Boolean.FALSE;
		// 入参为空串或null的场合
		if (StringUtils.isBlank(deviceFlag)) {
			return resultFlag;
		}
		if (com.jht.common.utils.StrUtil.toUpperCase(deviceFlag).contains(com.jht.common.utils.StrUtil.toUpperCase("ios"))
				|| com.jht.common.utils.StrUtil.toUpperCase(deviceFlag).contains(com.jht.common.utils.StrUtil.toUpperCase("Android"))
				|| com.jht.common.utils.StrUtil.toUpperCase(deviceFlag).contains(com.jht.common.utils.StrUtil.toUpperCase("iPhone"))
				|| com.jht.common.utils.StrUtil.toUpperCase(deviceFlag).contains(com.jht.common.utils.StrUtil.toUpperCase("iPod"))
				|| com.jht.common.utils.StrUtil.toUpperCase(deviceFlag).contains(com.jht.common.utils.StrUtil.toUpperCase("iPad"))) {
			resultFlag = Boolean.TRUE;
		}

		return resultFlag;
	}

	// APP V3.4 --结束
}
