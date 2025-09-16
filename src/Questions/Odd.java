package Questions;

public class Odd {

	public static void main(String[] args) {
		int sum = 0 ;
		System.out.println("Odd numbers are");
		for (int i = 0; i <=100; i++) {
			
			if (i%2 != 0) {
				sum = sum + i ;
				System.out.println("Odd numbers are " +sum);
			}
			
			
		}
	}

}
