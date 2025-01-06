package lecture_10_Searching_and_Sorting;

import java.util.Scanner;

public class Selection_Sort {
	
	public static void selectionSort(int input []) {
		
		for(int i=0; i<input.length-1; i++) {
			int min_index = i;
			for(int j=i+1; j < input.length; j++) {
				if(input[j] < input[min_index]) {
					min_index = j;
				}
			}
			
			int temp = input[min_index];
			input[min_index] = input[i];
			input[i] = temp;
		}
	}

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input [] = new int[size];
		for(int i=0; i<input.length; i++) {
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
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = takeInput();
		selectionSort(arr);
		print(arr);
	}

}
