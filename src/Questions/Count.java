package Questions;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		System.out.println("Enter the word to be counted");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		
		System.out.println("The Count of given input is - "+s.length());

	}

}
