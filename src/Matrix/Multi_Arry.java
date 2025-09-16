package Matrix;

public class Multi_Arry {
	public static void main(String[] args) {
		int b[][] = new int [3][3] ;
			
			b[0][0] = 10  ;
			b[0][1] = 20;	
			b[0][2] = 30;
			b[1][0] = 40 ;
			b[1][1] = 50 ;
			b[1][2]	= 30 ;	
			b[2][0]	= 30 ;
			b[2][1]	= 30 ;
			b[2][2]	= 30 ;
				

			for (int row  = 0; row <b.length;row++ ) {
				for (int col = 0 ;col <b.length;col++ ) {
			
				System.out.print(b[row][col] +" " ) ;
}
			System.out.println();
}}}