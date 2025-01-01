package Lecture_2;

import java.util.Scanner;

public class Average_Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int avg = (a+b+c)/3;
		
		System.out.println(ch);
		System.out.println(avg);
		
		sc.close();

	}

}
