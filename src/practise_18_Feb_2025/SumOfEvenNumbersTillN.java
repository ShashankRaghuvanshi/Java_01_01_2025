package practise_18_Feb_2025;

import java.util.Scanner;

public class SumOfEvenNumbersTillN {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int initialNumber = 1;
		int sum = 0;
		while(initialNumber <= number) {
			if(initialNumber % 2 == 0) {
				sum += initialNumber;
			}
			initialNumber++;
		}
		System.out.println(sum);
		scanner.close();
	}

}
