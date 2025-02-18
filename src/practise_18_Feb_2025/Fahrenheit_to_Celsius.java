package practise_18_Feb_2025;

import java.util.Scanner;

public class Fahrenheit_to_Celsius {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startFahValue = scanner.nextInt();
		int endFahValue = scanner.nextInt();
		int stepSize = scanner.nextInt();
		
		int celsius;
		
		while(startFahValue <= endFahValue) {
			celsius = 5*(startFahValue - 32)/9;
			System.out.println(startFahValue+" "+celsius);
			startFahValue += stepSize;
		}
		scanner.close();
	}

}
