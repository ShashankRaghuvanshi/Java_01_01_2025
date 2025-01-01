package Lecture_2;

import java.util.Scanner;

public class Taking_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		int k = i + j;
		
		System.out.println(k);
		
		long l = sc.nextLong();
		
		double d = sc.nextDouble();
		
		String str = sc.nextLine();
		
		String str1 = sc.next();
		
		char ch = str.charAt(0);
		
		char ch1 = sc.next().charAt(0);
		
		sc.close();

	}

}
