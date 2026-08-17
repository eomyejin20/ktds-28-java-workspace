package com.ktdsuniversity.edu.oop.library.util;

import java.util.Scanner;

public class ScannerUtil {

private static final Scanner SCANNER = new Scanner(System.in);
	
	public static String nextLine(String message) {
		System.out.print(message);
		return SCANNER.nextLine();
	}
	
	public static int nextInt(String message) {
		while (true) {
			String input = nextLine(message);
			try {
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해 주세요.");
			}
		}
	}
	
	public static long nextLong(String message) {
		while (true) {
			String input = nextLine(message);
			try {
				return Long.parseLong(input);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해 주세요.");
			}
		}
	}
	
	public static void close() {
		SCANNER.close();
	}
}
