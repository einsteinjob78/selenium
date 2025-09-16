package com.bank_details;

public class Constructor {
	
	public Constructor () {
		System.out.println("Account Details  are  - ");
		System.out.println("--------------------");
	}
	String Name ;
	int Account_no;
	int Branchcode;
	Float Balance ;
	
	public  Constructor (String name , int   account_no , int branchcode , Float balance ) {
	
		this.Name = name ;
		this.Account_no =  account_no ;
		this.Branchcode = branchcode ;
		this.Balance = balance ;
	}
	public static void main(String[] args) {
		Constructor s1 = new Constructor();
		Constructor s2 = new Constructor("Einstein" , 123456 , 10020 , 460.2f);
		System.out.println("Name" +s2.Name);
		System.out.println("Account No " +s2.Account_no);
		System.out.println("Branch code  " +s2.Branchcode);
		System.out.println("Account Balance -   " +s2.Balance);
	}}
		
	

