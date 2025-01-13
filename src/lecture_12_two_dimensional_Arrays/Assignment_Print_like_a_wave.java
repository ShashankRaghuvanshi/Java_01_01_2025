package lecture_12_two_dimensional_Arrays;

import java.util.Scanner;

public class Assignment_Print_like_a_wave {
	
	public static void main(String args[]) {
        int t, N, M;
        Scanner sr = new Scanner(System.in);
        t = sr.nextInt();
        for (int k = 0; k < t; ++k) {
            N = sr.nextInt();
            M = sr.nextInt();
            int ar[][] = new int[N][M]; // Swap n and m in array dimensions
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    ar[i][j] = sr.nextInt();
                }
            }
            wavePrint(ar);
	    System.out.println();
        }
    }
	
	
	public static void wavePrint(int mat[][]){
		
		if(mat.length == 0 || mat[0].length == 0){
			return;
		}

		for(int j=0; j<mat[0].length; j++){
				if(j % 2 == 0){
					for(int i=0; i<mat.length; i++){
						System.out.print(mat[i][j]+" ");
					}
				}else{
					for(int k=mat.length-1; k>=0; k--){
						System.out.print(mat[k][j]+" ");
					}
				}
		}
	}

}
