package Questions;

public class Count_Even {
public static void main(String[] args) {
	int n= 50;
	int count = 0 ;
	System.out.println("Count of Even numbers ");
	for (int i = 1; i <=n; i++) {
		if (i%2 == 0) {
		System.out.println(i);
		count = count+1;
	} 
	}
	System.out.println("count of even numbers"+count);
}
}
