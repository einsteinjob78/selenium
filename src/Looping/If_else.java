package Looping;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
	System.out.println("Enter your age ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Your age is " +age);
		if (age >= 18) {
			System.out.println("Eligible for Voat");
		}
		else {
			
		  
			System.out.println("Not Eligible");
		
		}
	}
		

