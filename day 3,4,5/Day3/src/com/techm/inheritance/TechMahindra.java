package com.techm.inheritance;

public class TechMahindra extends Employee
{
	String location;

	
	
	public TechMahindra() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public TechMahindra(int empId, String ename, int sal, String location) {
		super(empId, ename, sal);
		this.location = location;
	}



	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
}
