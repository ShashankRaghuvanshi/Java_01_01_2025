package practise_18_Feb_2025;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double basic = scanner.nextDouble();
		char grade = scanner.next().charAt(0);
		
		double hra = 0.20 * basic;
		double da = 0.50 * basic;
		double pf = 0.11 * basic;
		
		double allow;
		
		switch (grade) {
		case 'A': {
			allow = 1700;
		}case 'B': {
			allow = 1500;
		}
		default:
			allow = 1300;
		}
		
		int totalSalary = (int) (basic + hra + da + allow - pf);
		System.out.println(totalSalary);
		scanner.close();
	}

}
