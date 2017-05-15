package com.overide;

public class DriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Child obj =new Child();
		obj.show();
	*/
		Parent ref; 	 //refernce variable or handle
		ref=new Child(); //parent class handle or variable is holding child class object
		ref.show();
		
		ref=new MyChild();
		ref.show();
		
	}

}

