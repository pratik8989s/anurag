package com.demo;

public class WageEmployee extends Employee
{

	private int weid;
	private String wename;
	
	
	public WageEmployee(int weid, String wename) {
		super();
		this.weid = weid;
		this.wename = wename;
	}
	
	
	
	
	public WageEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public int getWeid() {
		return weid;
	}
	public void setWeid(int weid) {
		this.weid = weid;
	}
	public String getWename() {
		return wename;
	}
	public void setWename(String wename) {
		this.wename = wename;
	}
	
	
		
//	System.out.println(Employee.ename);
	
	}
