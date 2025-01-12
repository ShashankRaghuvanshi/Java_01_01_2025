package lecture_12_two_dimensional_Arrays;

import java.util.Scanner;

public class RowWiseSum {

	public static void rowWiseSum(int[][] a) {
		
		for(int i=0; i < a.length; i++) {
			int sum = 0;
			for(int j=0; j< a[i].length; j++) {
				sum += a[i][j];
			}
			System.out.print(sum+" ");
		}

	}
	
	public static void main(String args[]) 
    {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) 
        {
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    ar[i][j]=sr.nextInt();
                }
            }
            int ans[]= new int[n*m];
            rowWiseSum(ar);
        }
    }

}
