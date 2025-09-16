package Questions;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		 System.out.print("Enter the number - ");
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		int  r = n  ;
		 int  sum = 0 ;
		 int temp ;
		
		 
		while (n>0) {
		 temp = n%10 ;
		 sum = sum + temp*temp*temp ;
		 n  = n/10 ;
		}
		 
if (r == sum)
{
	System.out.println("It is an Armstrong number" );
} else
	System.out.println("Not an Armstrong number");
	}

}
