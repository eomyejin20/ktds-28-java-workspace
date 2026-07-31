package com.ktdsuniversity.edu.oop.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/**
 * NewIO java 1.8v 이상 (파이프를 자동으로 끊어줌)
 */
public class NIOReadTest {

	public static void main(String[] args) {
		
		File file = new File("C:/Java Exam", "Java Exam.txt"); // '\\'뒤문자를 표현
		
		// 파일을 읽어서 출력한다.
		if(file.exists() && file.isFile()) {
			// 파일을 읽어서 List에 저장해라
			List<String> lines = null;
			try {
				lines = Files.readAllLines(file.toPath());// file을 path로 바꿔서 넣음
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}			
			
			if (lines != null) {
				for (int i = 0; i < lines.size(); i++) {
					System.out.println(lines.get(i));
				}
			}
		}
		
		
		
		
		
	}
}
