package com.techm.pratik;

public class DriverMain {

	public static void main(String[] args) {

	//	Account accObj=new Account(1001,"Sanjay",100);
		
		SavingAccount saAccount = new SavingAccount(1001,"Vijay",20000,"Pune");
		System.out.println(saAccount.getAccName()+" "+saAccount.getBranch()+" starting"+saAccount.getBalance());
		saAccount.deposit(5000);
		
		System.out.println(saAccount.getAccName()+" "+saAccount.getBranch()+" after deposit"+saAccount.getBalance());
		
		saAccount.withDraw(12000);
		System.out.println(saAccount.getAccName()+" "+saAccount.getBranch()+" after withdraw"+saAccount.getBalance());
		
		Account handle;
		handle=saAccount;
		
		Account bandle1 = new SavingAccount();
		Account bandle2= new CurrentAccount();
		
		if (handle instanceof SavingAccount) 
		{
		handle.deposit(1000);
		System.out.println(saAccount.getAccName()+" "+saAccount.getBranch()+" new bal"+saAccount.getBalance());
		}
		CurrentAccount caAccount=new CurrentAccount(1002, "Omkar", 30000, "specialFacility");
		handle= caAccount;
		if (handle instanceof CurrentAccount)
		{
		handle.deposit(2000);
		System.out.println(caAccount.getAccName()+" "+caAccount.getBalance());
		}
		
		
	/*	CurrentAccount caAccount = new CurrentAccount(1002, "Sanjay", 40000, "money");
		System.out.println(caAccount.getAccName()+" "+caAccount.getSpecialFacility());*/
	}

}
