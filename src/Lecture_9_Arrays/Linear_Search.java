package Lecture_9_Arrays;

import java.util.Scanner;

public class Linear_Search {
	
	public static int linearSearch(int input[],int index) {
		for(int i=0; i<input.length; i++){
			if(input[i] == index) {
				return i;
			}
		}
		return -1;
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
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		for(int i=0; i<test; i++)
		{
			int arr[] = takeInput();
			int X = sc.nextInt();
			int index = linearSearch(arr,X);
			System.out.println(index);
		}
	}

}
