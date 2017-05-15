package com.techm.pratik;

public class SavingAccount extends Account
{

	private String branch;
	 
	
	public SavingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SavingAccount(int accId, String accName, int balance,String branch) {
		super(accId, accName, balance);
		this.branch = branch; 
	}

	

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	
	
	@Override
	void withDraw(int amount) {
		this.balance=this.balance-amount;
		
	}
	@Override
	void deposit(int amount) {
		this.balance=this.balance+amount;
	// 20000 + 5000 =25000
	}
	
	public void calc() {
		// TODO Auto-generated method stub

	}

	
	
}
