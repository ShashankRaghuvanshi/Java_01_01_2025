package Lecture_9_Arrays;

import java.util.Scanner;

public class Finding_Largest_Element {
	
	public static int findLargestElement(int input[])
	{
		int largest = Integer.MIN_VALUE;
		for(int i=0; i<input.length; i++) {
			if(input[i] > largest) {
				largest = input[i];
			}
		}
		return largest;
	}

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
		for(int i=0; i<size; i++) {
			input[i] = sc.nextInt();
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
		int arr[] = takeInput();
		print(arr);
		int max = findLargestElement(arr);
		System.out.println(max);
	}

}
