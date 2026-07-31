package com.ktdsuniversity.edu.oop.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTest {

	public static void main(String[] args) {
		
		// 내가 읽고 싶은 파일을 지정한다.
		// java.io.File;
		File textFile = new File("C:\\Java Exam", "Java Exam.txt");
		
		// Java Exam.txt라는 파일이 존재하는지 확인하고
		// 그것이 파일 형태인지 확인한다.
		if (textFile.exists() && textFile.isFile()) {
			
			// 파일을 읽어주는 객체를 선언한다.
			// java.io.FileReader;
			FileReader reader = null;
			// 파일을 청킹해주는 객체를 선언한다.
			// java.io.BufferedReader;
			BufferedReader bufferedReader = null; // IOException -> try-catch 필요
			
			// 파일을 읽어주는 FileReader 인스턴스를 생성한다.
			try {
				// 파일을 읽어주는 FilReader 인스턴스를 생성한다.
				reader = new FileReader(textFile);
				
				// 파일을 청킹해주는 BufferedReader 인스턴스를 생성한다.
				bufferedReader = new BufferedReader(reader);
				
				//파일을 한 줄씩 읽어와 출력한다
				String line = null;
				// 파일의 마지막 => EndOfFile = null 체크
				while ( (line = bufferedReader.readLine() ) != null) {
					System.out.println(line);
				}
			
			} catch (FileNotFoundException fnfe) {
				// java.io.FileNotFoundException
				System.out.println(fnfe.getMessage());
				fnfe.printStackTrace();
			} catch(IOException ioe){
				System.out.println(ioe.getMessage());
				ioe.printStackTrace();
			} finally {
				// 파이프 닫으면 예외발생 -> 핸들링 못함X -> 그냥 두기
				try {
					bufferedReader.close();
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
				
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
