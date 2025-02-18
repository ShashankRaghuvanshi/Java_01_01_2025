package practise_18_Feb_2025;

import java.util.Scanner;

public class Half_Diamond_Pattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		System.out.println("*");
		for(int i=0; i<n; i++) {
			System.out.print("*");
			for(int j=0; j<=i; j++) {
				System.out.print(j+1);
			}
			for(int j=0; j<i; j++) {
				System.out.print(i-j);
			}
			System.out.println("*");
		}
		for(int i=0; i<n-1; i++) {
			System.out.print("*");
			for(int j=0; j<n-1-i; j++) {
				System.out.print(j+1);
			}
			for(int j=0; j<n-2-i; j++) {
				System.out.print(n-2-j-i);
			}
			System.out.println("*");
		}
		System.out.println("*");

	}

}
