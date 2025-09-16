package Questions;

import java.util.Scanner;

public class Find_Odd_Even {

	public static void main(String[] args) {
		
		System.out.println("To find the number is odd or even");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a % 2 == 0) 
			System.out.println("The given number is Even " +a);
			else 
				System.out.println("The given number is odd" +a);
		}

	}

	
