package lecture_12_two_dimensional_Arrays;

import java.util.Scanner;

public class Q_LargestRowOrColumn {
	
	public static void findLargest(int mat[][]){

		// Handle empty matrix case
        if (mat == null || mat.length == 0) {
            System.out.println("row 0 " + Integer.MIN_VALUE);
            return;
        }

        int maxRowSum = Integer.MIN_VALUE;
        int maxColSum = Integer.MIN_VALUE;

        int maxRowIdx = 0; // Default to row 0
        int maxColIdx = 0; // Default to column 0

        // Calculate row-wise sums
        for (int i = 0; i < mat.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                rowSum += mat[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIdx = i;
            }
        }

        // Find maximum column length
        int maxCols = 0;
        for (int[] row : mat) {
            maxCols = Math.max(maxCols, row.length);
        }

        // Calculate column-wise sums
        for (int j = 0; j < maxCols; j++) {
            int colSum = 0;
            for (int i = 0; i < mat.length; i++) {
                if (j < mat[i].length) { // Check if column exists in the current row
                    colSum += mat[i][j];
                }
            }
            if (colSum > maxColSum) {
                maxColSum = colSum;
                maxColIdx = j;
            }
        }

        // Compare row and column sums
        if (maxRowSum >= maxColSum) {
            System.out.println("row " + maxRowIdx + " " + maxRowSum);
        } else {
            System.out.println("column " + maxColIdx + " " + maxColSum);
        }
    }
	
	public static void main(String args[]) {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) 
		{
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m]; // Swap n and m in array dimensions
            for (int i = 0; i < n; i++) 
			{
                for (int j = 0; j < m; j++) 
				{
                    ar[i][j] = sr.nextInt();
                }
            }
            findLargest(ar);
        }
    }

}
