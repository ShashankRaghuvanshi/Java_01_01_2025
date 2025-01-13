package lecture_12_two_dimensional_Arrays;

import java.util.Scanner;

public class Assignment_Transpose_of_a_matrix {
	
	public static int[][] transpose(int m, int n, int[][] mat) {
		
		// Create a new matrix for the transposed result
        int[][] transposed = new int[n][m];
        
        // Swap rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transposed[j][i] = mat[i][j];
            }
        }
        return transposed;
	}
	
	public static void main(String args[]) 
    {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) 
        {
            m = sr.nextInt();
            n = sr.nextInt();
            int ar[][] = new int[m][n]; // Swap n and m in array dimensions
            for (int i = 0; i < m; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    ar[i][j] = sr.nextInt();
                }
            }
	        int ans[][]=new int[n][m];
            ans = transpose(m,n,ar);
    	    for(int i=0;i<n;i++)
    	    {	
        		for(int j=0;j<m;j++)
        		{
        			System.out.print(ans[i][j]+" ");
        		}
		        System.out.println();
	        }
        }
    }

}
