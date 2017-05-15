package com.techm.bank;

public class DriverMain {

	public static void main(String[] args) {

		
		
		SavingAccount sa=new SavingAccount("sanjay",10000,"Pune");
		SavingAccount s=new SavingAccount("say",10000,"Pune");
		SavingAccount a=new SavingAccount("jay",10000,"Pune");
		
	System.out.println(sa.getAccId()+" "+sa.getAccname()+" "+sa.getBranch());
	System.out.println(s.getAccId()+" "+s.getAccname()+" "+s.getBranch());
	System.out.println(a.getAccId()+" "+a.getAccname()+" "+a.getBranch());
	
	
	
	CurrentAccount ca=new CurrentAccount("Vijay",18764,"Draft facility");
	CurrentAccount ca1=new CurrentAccount("jay",18764,"Draft facility");
	CurrentAccount ca2=new CurrentAccount("Vay",18764,"Draft facility");
	
	System.out.println(ca.getAccId()+" "+ca.getSpecialFacility());
	System.out.println(ca1.getAccId()+" "+ca1.getSpecialFacility());
	System.out.println(ca2.getAccId()+" "+ca2.getSpecialFacility());
	
	
	
	
	}

}
