package com.techm.bank;

public class SavingAccount extends Account
{
	private String branch;
	static int count=10001;
	

	public SavingAccount(String accname, int amount, String branch) {
		super(accname, amount);
		accId=count;
		this.branch = branch;
		count++;
	}




	public SavingAccount(String branch) {
	
		this.branch = branch;
	}
	
	
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
	
}
