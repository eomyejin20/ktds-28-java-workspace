package com.ktdsuniversity.edu.oop.broadcast.constant;

import java.time.LocalTime;
import java.util.List;

import com.ktdsuniversity.edu.oop.broadcast.data.Company;
import com.ktdsuniversity.edu.oop.broadcast.data.Companys;
import com.ktdsuniversity.edu.oop.broadcast.data.Program;
import com.ktdsuniversity.edu.oop.broadcast.data.Programs;

/**
 * 방송사별 편성표 예시
 */
public class BroadCastConstants {

	public static final List<Company> BROADCAST_SCHEDULE = List.of(
			new Company(Companys.SBS, new Program(Programs.좋은아침, LocalTime.of(9, 0), LocalTime.of(10,0))),
			new Company(Companys.KBS1, new Program(Programs.아침마당, LocalTime.of(9, 0), LocalTime.of(10,0))),
			new Company(Companys.KBS2, new Program(Programs.생생정보, LocalTime.of(9, 0), LocalTime.of(10,0))),
			new Company(Companys.MBC, new Program(Programs.드라마, LocalTime.of(9, 0), LocalTime.of(10,0))),
			new Company(Companys.EBS, new Program(Programs.애니메이션, LocalTime.of(9, 0), LocalTime.of(10,0)))
			);
}
