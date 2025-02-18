package practise_18_Feb_2025;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		int start = 2;
		int end = number/2;
		int count = 0;
		
		while(start <= end) {
			if(number % start == 0) {
				System.out.print(start+" ");
				count++;
			}
			start++;
		}
		
		if(count == 0) {
			System.out.println("-1");
		}
		scanner.close();
	}

}
