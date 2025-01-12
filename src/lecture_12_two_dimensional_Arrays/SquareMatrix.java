package lecture_12_two_dimensional_Arrays;

import java.util.Scanner;

public class SquareMatrix {
	
	public static String sqrMat(int [][]mat, int n, int m,int diag[]) 
    {

        if(n != m){
            return "NO";
        }
        
        for(int i=0; i <n; i++) {
			for(int j=0; j< m; j++) {
				if(i == j){
                    diag[i] = mat[i][j];
                }
			}
		}
        return "YES";
    }
	
	public static void main(String args[]) {
        int t, m, n;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            n = sr.nextInt();
            m = sr.nextInt();
            int ar[][] = new int[n][m]; // Swap n and m in array dimensions
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            int diag[] = new int[Math.min(n, m)]; // Use Math.min to get the smaller dimension
            String ans = sqrMat(ar, n, m, diag);
            System.out.println(ans);
            if (ans.equals("YES")) {
                for (int i = 0; i < diag.length; i++) {
                    System.out.print(diag[i] + " ");
                }
                System.out.println();
            }
        }
    }

}
