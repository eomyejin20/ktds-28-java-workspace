package com.ktdsuniversity.edu.oop.broadcast.service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.ktdsuniversity.edu.oop.broadcast.constant.BroadCastConstants;
import com.ktdsuniversity.edu.oop.broadcast.data.Company;
import com.ktdsuniversity.edu.oop.broadcast.data.Companys;
import com.ktdsuniversity.edu.oop.broadcast.exception.TVException;

/**
 * 방송사별 방영 프로그램 구현 클래스
 */
public class BroadCastScheduleImpl implements BroadCastSchedule{

	/** 방송사별 방영 프로그램 기능 */
	@Override
	public void programOfBroadCast() {
		// 예시대로 09:00로 설정
		String nineOclock = "09:00";
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
//		LocalTime now = LocalTime.now();
//		now = now.format(format);
		LocalTime now  = LocalTime.parse(nineOclock, format);
		System.out.printf("현재 시간: %s\n", now);
		
		List<Company> validSchedule = new ArrayList<>();
		Company company = null;
		boolean isFound = false;
		
		if (BroadCastConstants.BROADCAST_SCHEDULE.size() == 0) {
			throw new TVException("편성표 목록이 존재하지 않습니다.");
		}
		
		for (int i = 0; i < BroadCastConstants.BROADCAST_SCHEDULE.size(); i++) {
			company = BroadCastConstants.BROADCAST_SCHEDULE.get(i);
			if (!now.isBefore(company.getProgram().getFromTime()) &&
			    !now.isAfter(company.getProgram().getToTime())) {
				isFound = true;
				validSchedule.add(company);
			}
		}
		
		if (!isFound) {
			throw new TVException("현재 방영중인 시간이 아닙니다.");
		}
		
		for (Companys companys: Companys.values()) {
			// 기존값 초기화
			company = null;
			for ( Company validCompany : validSchedule) {
				if (validCompany.getCompany() == companys) {
					company = validCompany;
					break;
				} 
			}
			if ( company != null) {
				System.out.println(company.getCompany() + " \"" + company.getProgram().getProgram() +
						"\" 이(가) 방영중입니다.");
			} else {
				System.out.println(companys + " 방영중인 시간이 아닙니다.");
			}
		}
		
	}

}
