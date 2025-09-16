package Questions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the chartacter to find palindrome - ");
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		String reverse = "" ;
		
		for (int i = S.length() - 1 ; i >= 0 ; i--)
		{
			reverse = reverse + S.charAt(i);
		}
if (S.equalsIgnoreCase(reverse))
{
	System.out.println("It is a palindrome");
}
else 
{
	System.out.println("It is not a Palindrome");
}
	}
	

}
