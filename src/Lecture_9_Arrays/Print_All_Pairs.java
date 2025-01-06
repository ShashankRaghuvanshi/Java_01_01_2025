package Lecture_9_Arrays;

import java.util.Scanner;

public class Print_All_Pairs {
	
	public static void printAllPairs(int input [])
	{
		for(int i=0; i<input.length-1; i++) {
			for(int j=i; j<input.length-1; j++) {
				System.out.print(input[i]+","+input[j+1]+" ");
			}
			System.out.println();
		}
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

	public static void main(String[] args)  {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int[] arr=takeInput();
            print(arr);
            printAllPairs(arr);
        }
	}

}
