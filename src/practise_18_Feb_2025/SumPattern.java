package practise_18_Feb_2025;

import java.util.Scanner;

public class SumPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=1; i<=n ; i++) {
			for(int j=1; j<=i; j++) {
				if(j==i) {
					System.out.print(j+"=");
				} else {
					System.out.print(j+"+");
				}
			}
			int sum=0;
			for(int j=1; j<=i; j++) {
				sum += j;
			}
			System.out.println(sum);
		}
		scanner.close();
	}

}
