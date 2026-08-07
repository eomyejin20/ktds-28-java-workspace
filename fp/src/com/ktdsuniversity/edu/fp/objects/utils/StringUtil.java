package com.ktdsuniversity.edu.fp.objects.utils;

public abstract class StringUtil {

	private StringUtil() {}

	public static int toInt(String str) {
		return toInt(str, 0);
	}
	
	public static int toInt(String str, int defaultVaue) {
		if (str == null) {
			return defaultVaue;
		}

		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return defaultVaue;
		}
	}
	
}