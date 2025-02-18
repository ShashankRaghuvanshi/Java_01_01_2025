package practise_18_Feb_2025;

import java.util.Scanner;

public class FindPowerOfANumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int powerOf = scanner.nextInt();
		
		int start = 1;
		int end = powerOf;
		
		int totalPower = 1;
		
		while(start <= end) {
			totalPower *= number;
			start++;
		}
		
		System.out.println(totalPower);
		scanner.close();
	}

}
