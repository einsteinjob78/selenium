package Looping;

import java.util.Scanner;

public class Else_if {

	public static void main(String[] args) {
		System.out.println("Enter your batch name to know more details ");
			Scanner sc = new Scanner(System.in);
			int batch = sc.nextInt();
			System.out.println("Your batch is " +batch);
			if (batch >= 1) {
				System.out.println("you are 1st batch ");
			}
			else if (batch >2 ){
				
				System.out.println("you are 2nd batch");
			}
				else if (batch >3 ){
					
					System.out.println("you are 3rd batch");
			
      }
}
}