package com.techm.bank;

public class Account {

	protected int accId;
	private String accname;
	private int amount;
	
	
	
	public Account(String accname, int amount) {
		super();
		this.accname = accname;
		this.amount = amount;
		
		
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
