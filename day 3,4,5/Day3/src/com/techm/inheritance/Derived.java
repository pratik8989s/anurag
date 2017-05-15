package com.techm.inheritance;

public class Derived extends Base

{

	public Derived() {
		super();
		System.out.println("I'm a derived class default constr");
	}

//Parameterized Constructor
	public Derived(int y) {
		super(y);
		System.out.println("I'm a derived class parameterized constr");
	}

	
	
}
