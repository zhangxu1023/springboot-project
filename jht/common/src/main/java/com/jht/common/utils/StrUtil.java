package com.jht.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrUtil {
	private static Pattern linePattern = Pattern.compile("_(\\w)");

	/**
	 * 下划线转驼峰
	 * 
	 * @param str
	 * @return
	 */
	public static String lineToHump(String str) {
		str = str.toLowerCase();
		Matcher matcher = linePattern.matcher(str);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
		}
		matcher.appendTail(sb);
		return sb.toString();
	}

	private static Pattern humpPattern = Pattern.compile("[A-Z]");

	/**
	 * 驼峰转下划线
	 * 
	 * @param str
	 * @return
	 */
	public static String humpToLine(String str) {
		Matcher matcher = humpPattern.matcher(str);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
		}
		matcher.appendTail(sb);
		return sb.toString();
	}

	/**
	 * 判断输入的字符串是否为空（Empty Or Null）
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmptyOrNull(String str) {
		if (str == null) {
			return true;
		} else if (str.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 截取字符串
	 * 
	 * @param str
	 * @return
	 */
	public static String subs(String str) {
		if (str == null || "".equals(str)) {
			return "";
		}
		int index = str.lastIndexOf("-");
		if (index > -1) {
			String s = str.substring(0, index);
			return s;
		}
		return str;

	}

	/**
	 * 截取字符串
	 * 
	 * @param str
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 */
	public static String subString(String str, int beginIndex, int endIndex) {
		if (str == null || "".equals(str)) {
			return "";
		} else {
			return str.substring(beginIndex, endIndex);
		}
	}

	/**
	 * 属性串拆分
	 * 
	 * @param param
	 *            待拆分字符串
	 * @param splitOperator
	 *            字段间分隔符
	 * @return 拆分后字段List
	 */
	public static List<String> splitProperties(String param, String splitOperator) {
		// 返回值初始化
		List<String> resultList = new ArrayList<String>();
		// 当被拆分字符串或分割符为空时，返回
		if (StringUtils.isBlank(param) || StringUtils.isBlank(splitOperator)) {
			return resultList;
		}
		String[] array = param.split(splitOperator);
		resultList = Arrays.asList(array);

		return resultList;

	}

	// /**
	// * 替换商品描述字符串中的部分内容
	// * @param orginalString 原始字符串
	// * 构成：关键属性_销售属性_物流属性_地理属性_仓库属性_交易属性_可扩展。除了可扩展部，其余属性为空时用empty占位
	// * 例：品牌:金湖强丰;级别:无氧铜_直径:1.13mm_物流方式:送货_交货地:安徽省-滁州市-天长市_empty_报价方式:一口价
	// * @param replaceString 用于替换的字符串
	// * @param index 被替换字符串所在位置（原始字符串按照"_"拆分后的数组中所在的索引号，从0开始）
	// * @return 替换后的字符串
	// */
	// public static String getNewDescString(String orginalString, String
	// replaceString, int index) {
	// String result = StringUtils.EMPTY;
	// String replaceStringWithoutSemicolon = StringUtils.EMPTY;
	// String replaceStringFinal = StringUtils.EMPTY;
	// if(StringUtils.isNotBlank(orginalString)) {
	// // 处理入参替换串
	// if(StringUtils.isNotBlank(replaceString)) {
	// // 去掉字符串结尾的分号（各部分属性字符串有且仅在结尾有分号，故不用考虑替换第几个分号）
	// replaceStringWithoutSemicolon = replaceString.replace(";", "");
	// // 给替换原串用的字符串临时赋值
	// replaceStringFinal = replaceStringWithoutSemicolon;
	// // 被替换的部分是地理属性或仓库属性的场合，去掉结尾的"-不限"
	// if(index == 3 || index == 4) {
	// if(replaceStringWithoutSemicolon.contains("-不限")) {
	// replaceStringFinal= replaceStringWithoutSemicolon.replace("-不限", "");
	// } else {
	// replaceStringFinal = replaceStringWithoutSemicolon;
	// }
	// }
	// }
	//
	// // 当用于替换的字符串为空，且被替换部分不是仓库属性时，直接返回原始串
	// if(StringUtils.isBlank(replaceString) && index !=4) {
	// return orginalString;
	// }
	//
	// // 替换部分时仓库属性，且用于替换的字符串为空，被替换部分使用empty占位
	// if(index == 4 && StringUtils.isBlank(replaceString)) {
	// replaceStringFinal = "empty";
	// }
	// // 拆分被替换的字符串
	// String[] orginal = orginalString.split("_");
	// orginal[index] = replaceStringFinal;
	// // 组装返回结果
	// result = StringUtils.join(orginal, "_");
	// }
	//
	// return result;
	// }

	/**
	 * 替换商品描述字符串中的部分内容
	 * 
	 * @param orginalString
	 *            原始字符串 构成：关键属性_销售属性_物流属性_地理属性_仓库属性_交易属性_可扩展。除了可扩展部，其余属性为空时用empty占位
	 *            例：品牌:金湖强丰;级别:无氧铜_直径:1.13mm_物流方式:送货_交货地:安徽省-滁州市-天长市_empty_报价方式:一口价
	 * @param replaceStrings
	 *            用于替换的字符串列，其中第0项为物流属性，第1项为地理属性,第2项为仓库属性，所有项目均必填
	 * @return 替换后的字符串
	 */
	public static String getNewDescString(String orginalString, List<String> replaceStrings) {
		String result = StringUtils.EMPTY;

		if (replaceStrings != null && replaceStrings.size() != 0) {
			String[] descList = orginalString.split("_");
			// 对desc串中原有的物流属性替换
			List<String> logisticsList = Arrays.asList(replaceStrings.get(0).split(";"));
			List<String> logisticsDescList = Arrays.asList(descList[2].split(";"));
			for (String logistics : logisticsList) {
				for (String logisticsDesc : logisticsDescList) {
					if (logisticsDesc.contains(Arrays.asList(logistics.split(":")).get(0))) {
						descList[2] = descList[2].replace(logisticsDesc, logistics);
						break;
					}
				}
			}

			descList[3] = replaceStrings.get(1).replace(";", "").replace("-不限", "");
			descList[4] = StringUtils.isEmpty(replaceStrings.get(2)) ? "empty" : replaceStrings.get(2).replace(";", "");
			result = StringUtils.join(descList, "_");
		}

		return result;
	}
	
	/**
	 * 将手机号分为3，4，4位一组，中间用空格分隔
	 * 
	 * @param mobileNum
	 *            手机号
	 * @return 替换后的字符串
	 */
	public static String convertMobile(String mobileNum) {
		String newNum = StringUtils.EMPTY;
		if(StringUtils.isNotBlank(mobileNum)) {
			StringBuffer sbNum = new StringBuffer();
			sbNum.append(StringUtils.substring(mobileNum, 0, 3));
			sbNum.append(" ");
			sbNum.append(StringUtils.substring(mobileNum, 3, 7));
			sbNum.append(" ");
			sbNum.append(StringUtils.substring(mobileNum, 7, 11));
			newNum = sbNum.toString();
		}
			
			return newNum;
	}
	
	/**
	 * 将入参字符串转换为全大写
	 * 
	 * @param param
	 *            待转换字符串
	 * @return 转换后的字符串
	 */
	public static String toUpperCase(String param) {
		String result = StringUtils.EMPTY;
		if(StringUtils.isNotBlank(param)) {
			result = param.toUpperCase();
		}
		
		return result;
	}
}
