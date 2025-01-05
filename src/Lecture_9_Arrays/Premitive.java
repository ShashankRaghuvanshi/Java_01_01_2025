package Lecture_9_Arrays;

import java.util.Scanner;

public class Premitive {
	
	public static void increment(int a)
	{
		a++; //11
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  //10
		increment(n);
		System.out.println(n);  //10
	}

	// in premitive case
}
