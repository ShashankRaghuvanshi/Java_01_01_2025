package lecture_9_Arrays;

import java.util.Scanner;

public class Return_Array_Sum {
	
	public static int returnArraySum(int input []) {
		int sum = 0;
		for(int i=0; i<input.length; i++) {
			sum += input[i];
		}
		return sum;
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
			int sum = returnArraySum(arr);
			System.out.println(sum);
		}	
	}

}
