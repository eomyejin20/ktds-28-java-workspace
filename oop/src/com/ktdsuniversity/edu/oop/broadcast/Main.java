package com.ktdsuniversity.edu.oop.broadcast;

import com.ktdsuniversity.edu.oop.broadcast.service.BroadCastSchedule;
import com.ktdsuniversity.edu.oop.broadcast.service.BroadCastScheduleImpl;
import com.ktdsuniversity.edu.oop.tvschedule.util.ScannerUtil;

public class Main {
	
	public static void main(String[] args) {
		BroadCastSchedule program = new BroadCastScheduleImpl();
		program.programOfBroadCast();
	}

}
