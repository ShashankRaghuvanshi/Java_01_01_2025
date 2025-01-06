package lecture_9_Arrays;

import java.util.Scanner;

public class Arrange_Numbers_in_the_Array {
	
	public static int[] arrageNumbers(int[] arr, int n) {
    	//Your code goes here
        int index = 0;

        for(int i=1; i<=n; i+=2) {
            arr[index++] = i;
        }

        for(int i= n%2 == 0 ? n : n-1; i>=2; i-=2){
            arr[index++] = i;
        }
        return arr;

    // int left = 0;
    // int right = n - 1;
    // int counter = 1;

    // while (left <= right) {
    //     if (counter % 2 == 1) {
    //         arr[left] = counter;
    //         counter++;
    //         left++;
    //     } else {
    //         arr[right] = counter;
    //         counter++;
    //         right--;
    //     }
    // }

    }


	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int input[] = new int[size];
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
			arr = arrageNumbers(arr,arr.length);
			print(arr);
		}
	}

}
