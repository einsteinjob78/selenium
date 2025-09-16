package Questions;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a=0;
		 int b= 1 ;
		 int c ;
		System.out.println("Enter the Fibonacci number");
		 Scanner sc = new Scanner(System.in);
		 int length = sc.nextInt();
		 System.out.println("The Factorial is - " +length);
		 
		 for (int i = 0;i<length ;i++) {
			 System.out.print(" "+a);
		 c = a+b ;
		 a=b ;
		 b=c ;
		 }
	
		}

	

}
