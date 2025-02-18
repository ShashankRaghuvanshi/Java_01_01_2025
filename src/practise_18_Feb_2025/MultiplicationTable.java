package practise_18_Feb_2025;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int initial = 1;
		int last = 10;
		
		while(initial <= last) {
			System.out.println(initial * number);
			initial++;
		}
		scanner.close();
	}

}
