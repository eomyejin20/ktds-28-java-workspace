package com.ktdsuniversity.edu.oop.broadcast.data;

/**
 * 방송사 data
 */
public class Company {
	
	private Companys company;
	private Program program;
	
	public Company(Companys company, Program program) {
		super();
		this.company = company;
		this.program = program;
	}

	public Companys getCompany() {
		return this.company;
	}

	public Program getProgram() {
		return this.program;
	}

}
