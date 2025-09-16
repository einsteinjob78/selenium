package com.laptop;

public class Overloading {
	public void Details (String lapname , int year ) {
		System.out.println("lapname is " +lapname+ " and manufacuring year is " +year);
	}
	public void Details (int RAM , int Bit ) {
		System.out.println("RAM - "+RAM+" Bit is - " +Bit);
	} 
		public void Details (String OSname , float version ) {
			System.out.println("OSname is - " +OSname+ " and Version is " +version);
		}		
public static void main(String[] args) {
	Overloading e = new Overloading();
	e.Details("Hawlet Packered" , 2014);
	e.Details(8, 64);
	e.Details("windows", 10.1f);
	
}	
	}
	


