package com.demo;

public class Demo11 {

	protected int a;
	protected String b;
	public int temp;
	
	
	
	
	public Demo11(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	
	
	@Override
	public String toString() {
		return "Demo11 [a=" + a + ", b=" + b + "]";
	}
	
public void calc() {
	// TODO Auto-generated method stub
temp=a;
System.out.println(temp);
}
	
	
}
