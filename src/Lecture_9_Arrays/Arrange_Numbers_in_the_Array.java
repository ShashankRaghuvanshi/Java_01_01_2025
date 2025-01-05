package Lecture_9_Arrays;

import java.util.Scanner;

public class Arrange_Numbers_in_the_Array {

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		int i=0;
		for(; i<size/2; i++) {
			input[i] = i*2 + 1;
		}
		for(int j=0; i<size; i++,j++)
		{
			input[i]= size-j*2;
		}
		return input;
	}
	
	public static void print(int input[]) {
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0; i<test; i++)
		{
			int arr[] = takeInput();
			print(arr);
		}
	}

}
