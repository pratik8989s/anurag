package com.overide;

public class Parent {

	
	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Parent(int x) {
		super();
		this.x = x;
	}

	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void show()
	{
		System.out.println("I'm inside parent class");
	}

}
