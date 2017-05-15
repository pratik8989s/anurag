package com.techm.inheritance;

public class Base {

	private int x;

	public Base(int z) {
		this.x = z;
	System.out.println("base class parameterized");
	}

	public Base() {
		x=0;		
	System.out.println("base class default const");
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	
	
	
	
	
	
	
	
	
}
