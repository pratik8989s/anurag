package com.techm.bank;

public class CurrentAccount extends Account
{

	private String specialFacility;

	static int count1=20001;
	
	
	
	
	
	public CurrentAccount(String accname, int amount,
			String specialFacility) {
		super(accname, amount);
		accId=count1;
		this.specialFacility = specialFacility;
		count1++;
	}
	
	
	
	public String getSpecialFacility() {
		return specialFacility;
	}
	public void setSpecialFacility(String specialFacility) {
		this.specialFacility = specialFacility;
	}
	
	
}
