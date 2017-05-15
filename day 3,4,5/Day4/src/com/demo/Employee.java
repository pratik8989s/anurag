package com.demo;

public class Employee {

	private int eid;
	private String ename;
	protected int totsal;
	
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	private void calc() {
	
		totsal=this.eid*this.eid;
		System.out.println("I'm in Employee class");
	}
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	
}
