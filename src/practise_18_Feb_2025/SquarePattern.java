package practise_18_Feb_2025;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//number of rows
		int n = scanner.nextInt();
		
		//row-wise
		for(int i=0; i<n; i++) {
			//column-wise
			for(int j=0; j<n; j++) {
				System.out.print(n);
			}
			System.out.println();
		}
		scanner.close();
	}

}
