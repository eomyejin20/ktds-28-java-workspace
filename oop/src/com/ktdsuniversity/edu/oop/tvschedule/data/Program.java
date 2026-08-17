package com.ktdsuniversity.edu.oop.tvschedule.data;

import java.time.LocalTime;

/**
 * 편성표 프로그램 정보
 */
public class Program {

	private String name;
	private LocalTime fromTime;
	private LocalTime toTime;
	
	public Program(String name, LocalTime fromTime, LocalTime toTime) {
		this.name = name;
		this.fromTime = fromTime;
		this.toTime = toTime;
	}
	
	public String getName() {
		return this.name;
	}
	
	public LocalTime getFromTime() {
		return this.fromTime;
	}
	
	public LocalTime getToTime() {
		return this.toTime;
	}
	
}
