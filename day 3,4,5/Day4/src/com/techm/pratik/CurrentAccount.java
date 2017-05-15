package com.techm.pratik;

public class CurrentAccount extends Account {

	public static int INTERESTRATE=10;
	
	private String specialFacility;
	
	
	public CurrentAccount(int accId, String accName, int balance,
			String specialFacility) {
		super(accId, accName, balance);
		this.specialFacility = specialFacility;
	}

	
	
	





	







	public CurrentAccount() {
		// TODO Auto-generated constructor stub
	}

















	public String getSpecialFacility() {
		return specialFacility;
	}




	public void setSpecialFacility(String specialFacility) {
		this.specialFacility = specialFacility;
	}



	@Override
	final void withDraw(int amount) {
		this.balance=this.balance-amount;
		
	}
	@Override
	void deposit(int amount) {
		this.balance=this.balance+amount;
		
	}
	
	
	
	
}
