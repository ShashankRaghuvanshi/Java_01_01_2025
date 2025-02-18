package practise_18_Feb_2025;

import java.util.Scanner;

public class FindCharacterCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char character = scanner.next().charAt(0);
		
		if(character >= 'A' && character <= 'Z') {
			System.out.println("1");
		} else if(character >= 'a' && character <= 'z') {
			System.out.println("0");
		} else {
			System.out.println("-1");
		}
		scanner.close();
	}

}
