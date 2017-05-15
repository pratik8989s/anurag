package com.techm.inheritance;

public class Employee {

	private int empId;
	private String ename;
	private int sal; 
	
	public Employee(int empId, String ename, int sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}

	public Employee() {
		super();
		
	}

	
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	
	
}
