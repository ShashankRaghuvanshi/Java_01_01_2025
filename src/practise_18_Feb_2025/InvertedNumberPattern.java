package practise_18_Feb_2025;

import java.util.Scanner;

public class InvertedNumberPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=0; i<n ; i++) {
			for(int j=0; j<n-i; j++) {
				System.out.print(n-i);
			}
			System.out.println();
		}
		scanner.close();
	}

}
