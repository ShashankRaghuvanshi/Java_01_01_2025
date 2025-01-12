package lecture_12_two_dimensional_Arrays;

import java.util.Scanner;

public class InputAndPrinting2dArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns");
		int col = sc.nextInt();
		
		int input[][] = new int[rows][col];
		
		for(int i=0; i < rows; i++) {
			for(int j=0; j< col; j++) {
				System.out.println("Enter element at"+i+" row "+j+" col");
				input[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i < rows; i++) {
			for(int j=0; j< col; j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}

	}

}
