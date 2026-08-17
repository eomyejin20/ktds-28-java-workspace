package com.ktdsuniversity.edu.oop.tvschedule;

import com.ktdsuniversity.edu.oop.tvschedule.service.TvSchedule;
import com.ktdsuniversity.edu.oop.tvschedule.service.TvScheduleImpl;
import com.ktdsuniversity.edu.oop.tvschedule.util.ScannerUtil;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("편성표 어플리케이션입니다.");
		
		TvSchedule searchProgram = new TvScheduleImpl();
		// 예외가 발생해도 finally 실행
		try {
			searchProgram.search();
		} finally {
			ScannerUtil.close();
		}
	}

}
