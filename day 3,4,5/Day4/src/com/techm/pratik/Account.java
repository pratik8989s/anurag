package com.techm.pratik;

public abstract class Account {

	private int accId;
	private String accName;
	protected int balance;
		

	
	abstract void withDraw(int amount);
	abstract void deposit(int amount);
	
	
	
	public Account(int accId, String accName, int balance) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.balance = balance;
	}
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
}
