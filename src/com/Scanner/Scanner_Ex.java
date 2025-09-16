package com.Scanner;

import java.util.Scanner;

public class Scanner_Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details");
		
		String a = sc.next();
		System.out.println("Please enter the full name - " +a);
		
		sc.nextLine();
		String b = sc.nextLine();
		System.out.println("Please enter the account no -  " +b);
		
		int e = sc.nextInt();
		System.out.println("Please enter the account no -  " +e);
		
		float c = sc.nextFloat ();
		System.out.println("Please enter the balance " +c);
		
		
		
	}

	

}
