package com.ktdsuniversity.edu.oop.tvschedule.util;

import java.util.Scanner;

/**
 * Scanner 하나만 생성
 */
public class ScannerUtil {

	private static final Scanner SCANNER = new Scanner(System.in);
	
	public static String nextLine(String message) {
		System.out.print(message);
		return SCANNER.nextLine();
	}
	
	public static void close() {
		SCANNER.close();
	}
}
