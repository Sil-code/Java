package com.java1234.util;
/**
 * ÅĞ¶ÏÃÜÂë
 * @author XIAOMI-PC
 *
 */
public class StringUtil {
	/**
	 * ÅĞ¶ÏÃÜÂëÊÇ·ñÎª¿Õ
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		if(str==null || "".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean isNotEmpty(String str) {
		if(str!=null && !"".equals(str.trim())) {
			return true;
		}else {
			return false;
		}
	}
}
