package com.ktdsuniversity.edu.oop.broadcast.data;

import java.time.LocalTime;

/**
 * 방영 프로그램 data
 */
public class Program {

	private Programs program;
	private LocalTime fromTime;
	private LocalTime toTime;
	
	public Program(Programs program, LocalTime fromTime, LocalTime toTime) {
		super();
		this.program = program;
		this.fromTime = fromTime;
		this.toTime = toTime;
	}

	public Programs getProgram() {
		return program;
	}

	public LocalTime getFromTime() {
		return fromTime;
	}

	public LocalTime getToTime() {
		return toTime;
	}

}
