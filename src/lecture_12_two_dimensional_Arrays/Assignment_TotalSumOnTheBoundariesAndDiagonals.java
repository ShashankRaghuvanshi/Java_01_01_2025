package lecture_12_two_dimensional_Arrays;

import java.util.Scanner;

public class Assignment_TotalSumOnTheBoundariesAndDiagonals {
	
	public static void main(String args[]) {
        int t, N, M;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            int ar[][] = new int[N][N]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            totalSum(ar);
        }
    }
	
	public static void totalSum(int[][] mat) {
		
		int n = mat.length; // Size of the square matrix
    int sum = 0;

    if (n == 0 || mat[0].length == 0) {
        System.out.println(sum);
        return;
    }

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            // Add boundary elements
            if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                sum += mat[i][j];
            }
            // Add main diagonal elements excluding boundary
            else if (i == j && !(i == 0 || i == n - 1)) {
                sum += mat[i][j];
            }
            // Add secondary diagonal elements excluding boundary
            else if (i + j == n - 1 && !(i == 0 || i == n - 1)) {
                sum += mat[i][j];
            }
        }
    }

    System.out.println(sum);
	}

}
