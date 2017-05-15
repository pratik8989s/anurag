package com.demo;

import java.awt.geom.Area;

public class Demo22 extends Demo11 {
	
	private int c;
	private String d;
	
	
	
	
//Demo11 de = new Demo11(12, "wee");
	
	
	
	
	
	
	public Demo22(int a, String b, int c, String d) {
		super(a, b);
		this.c = c;
		this.d = d;
		Demo11 de = new Demo11(12, "wee");
		System.out.println(de);
	}

//	int temp1;
	
@Override
public void calc() {
	// TODO Auto-generated method stub
//	super.calc();
	temp=c;
	System.out.println(temp);
}


	@Override
	public String toString() {
		return "Demo22 [c=" + c + ", d=" + d + "]";
	}

public void aream() {
	System.out.println("w/o ");
	
}
public void aream(int a, String b) {
	// TODO Auto-generated method stub
	System.out.println("int str");
	
}
public void aream(String d,int a) {
	// TODO Auto-generated method stub
	System.out.println("str int ");
}
	

		
		
		
		
	}










