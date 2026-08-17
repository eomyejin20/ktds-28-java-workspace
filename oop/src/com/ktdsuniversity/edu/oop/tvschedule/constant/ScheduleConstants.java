package com.ktdsuniversity.edu.oop.tvschedule.constant;

import java.time.LocalTime;
import java.util.List;

import com.ktdsuniversity.edu.oop.tvschedule.data.Program;

/**
 * 편성표 시간대별 방영 프로그램 상수(리스트)
 */
public class ScheduleConstants {
	
	public static final List<Program> TV_SCHEDULE = List.of(
			new Program("프로그램 1",  LocalTime.of(3, 0),  LocalTime.of(5, 0)),
			new Program("프로그램 2",  LocalTime.of(5, 1),  LocalTime.of(6, 30)),
			new Program("프로그램 3",  LocalTime.of(6, 31), LocalTime.of(8, 0)),
			new Program("프로그램 4",  LocalTime.of(8, 1),  LocalTime.of(9, 0)),
			new Program("프로그램 5",  LocalTime.of(9, 1),  LocalTime.of(10, 0)),
			new Program("프로그램 6",  LocalTime.of(10, 1), LocalTime.of(12, 0)),
			new Program("프로그램 7",  LocalTime.of(12, 1), LocalTime.of(13, 30)),
			new Program("프로그램 8",  LocalTime.of(13, 31),LocalTime.of(15, 0)),
			new Program("프로그램 9",  LocalTime.of(15, 1), LocalTime.of(17, 0)),
			new Program("프로그램 10", LocalTime.of(17, 1), LocalTime.of(18, 0)),
			new Program("프로그램 11", LocalTime.of(18, 1), LocalTime.of(21, 0)),
			new Program("프로그램 12", LocalTime.of(21, 1), LocalTime.of(23, 0)),
			new Program("프로그램 13", LocalTime.of(23, 1), LocalTime.of(23, 59))
			);
			
}
