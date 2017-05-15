package com.techm.inheritance;

public class DriverMain {

	public static void main(String[] args) {

	//	Derived object1=new Derived();
	//	Derived object2=new Derived(10);
		
		
		TechMahindra tm=new TechMahindra(1001,"sanjay",20000,"Pune");
		System.out.println(tm.getEmpId()+tm.getLocation());
		
	}

}
