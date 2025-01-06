package lecture_10_Searching_and_Sorting;

import java.util.Scanner;

public class Binary_Search {
	
	public static int binarySearch(int input[], int n) {
		int start = 0;
		int end = input.length-1;
		
		while(start <= end) {
			int mid = (start + end)/2;
			
			if(input[mid] == n) {
				return mid;
			}
			else if(input[mid] > n) {
				end = mid-1;
			}
			else if(input[mid] < n) {
				start = mid+1;
			}
		}
		return -1;
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
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = takeInput();
		int num = sc.nextInt();
		int ans = binarySearch(arr, num);
		System.out.println(ans);
	}
}
