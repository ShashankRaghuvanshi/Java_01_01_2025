package lecture_12_two_dimensional_Arrays;

import java.util.Scanner;

public class RowWiseTraversal {
	
	public static int[] printRowWise(int [][]a) {
        
        int ans[] = new int[(a.length * a[0].length)];
        int count = 0;
        for(int i=0; i < a.length; i++) {
			for(int j=0; j< a[i].length; j++) {
				ans[count] = a[i][j];
                count++;
			}
		}
        return ans;
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
            ans= printRowWise(ar);
           // System.out.print(ans.length);
            for(int i=0;i<ans.length;i++)
            {
                    System.out.print(ans[i]+" ");
            }
	    System.out.println();
               
        }
    }

}
