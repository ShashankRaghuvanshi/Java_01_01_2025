package practise_18_Feb_2025;

import java.util.Scanner;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=0; i<n ; i++) {
			for(int j=0; j<=i ; j++) {
				System.out.print(i+1-j);
			}
			System.out.println();
		}
		scanner.close();
	}

}
