package practise_18_Feb_2025;

import java.util.Scanner;

public class BasicPatternPrint {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//number of rows
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		scanner.close();
	}

}
