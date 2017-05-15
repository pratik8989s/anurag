package com.emp;

import java.util.HashMap;

public class ExamDetails {

 public HashMap<String, Integer> hm = new HashMap<String, Integer>();
	 
	public void init()
	{
		hm.put("1Z0-148", 10000);
		hm.put("1Z0-061", 9000);
		hm.put("1Z0-803", 11000);
		hm.put("1Z0-899", 12000);
	}

	public ExamDetails() {
		init();
	}
	
	
}
