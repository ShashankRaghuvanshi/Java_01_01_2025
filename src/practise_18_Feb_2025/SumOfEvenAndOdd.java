package practise_18_Feb_2025;

import java.util.Scanner;

public class SumOfEvenAndOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int sumOdd = 0;
		int sumEven = 0;
		
		while(0 < number) {
			int digit = number % 10;
			if(digit % 2 == 0) {
				sumEven += digit;
			} else {
				sumOdd += digit;
			}
			number /= 10;
		}
		System.out.println(sumEven+" "+ sumOdd);
		scanner.close();
	}

}
