package com.ktdsuniversity.edu.oop.tvschedule.service;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.ktdsuniversity.edu.oop.tvschedule.constant.ScheduleConstants;
import com.ktdsuniversity.edu.oop.tvschedule.data.Program;
import com.ktdsuniversity.edu.oop.tvschedule.exception.NotFoundProgramException;
import com.ktdsuniversity.edu.oop.tvschedule.exception.TvException;
import com.ktdsuniversity.edu.oop.tvschedule.util.ScannerUtil;

/**
 * 편성표 구현 클래스
 */
public class TvScheduleImpl implements TvSchedule {

	/** 방영중인 프로그램 찾기 */
	@Override
	public void search() {
		String time = ScannerUtil.nextLine("조회할 시간대를 00:00으로 입력하세요.").trim();
		if (time == null || time.isBlank()) {
			throw new TvException("시간대는 필수로 입력해야합니다.");
		}
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime searchTime = LocalTime.parse(time, format);

		Program program = null;
		boolean isFound = false;
		for (int i = 0; i < ScheduleConstants.TV_SCHEDULE.size(); i++) {
			program = ScheduleConstants.TV_SCHEDULE.get(i);
			
			// fromTime <= searchTime <= toTime
			if (!searchTime.isBefore(program.getFromTime()) &&
				searchTime.isAfter(program.getToTime())) {
				isFound = true;
				break;
			}
			
		}
		
		if (!isFound) {
			throw new NotFoundProgramException();
		}
		
		System.out.println(program.getName());
	}
	

}
