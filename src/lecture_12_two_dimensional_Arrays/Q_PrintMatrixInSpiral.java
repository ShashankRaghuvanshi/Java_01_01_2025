package lecture_12_two_dimensional_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_PrintMatrixInSpiral {
	
public static void spiralPrint(int matrix[][]){
		
		// Handle the case of an empty matrix
        if (matrix.length == 0) {
            return;
        }

        int top = 0;            // Top boundary
        int bottom = matrix.length - 1; // Bottom boundary
        int left = 0;           // Left boundary
        int right = matrix[0].length - 1; // Right boundary

        // Loop until all boundaries overlap or cross
        while (top <= bottom && left <= right) {
            // Print top row (left to right)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // Print right column (top to bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // Print bottom row (right to left), if there's a bottom row left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Print left column (bottom to top), if there's a left column left
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static int[][] take2DInput() throws IOException {
    String[] strRowsCols = br.readLine().trim().split("\\s");
    int n_rows = Integer.parseInt(strRowsCols[0]);
    int m_cols = Integer.parseInt(strRowsCols[1]);

    if (n_rows == 0) {
        return new int[0][0];
    }


    int[][] mat = new int[n_rows][m_cols];

    for (int row = 0; row < n_rows; row++) {
        String[] strNums; 
        strNums = br.readLine().trim().split("\\s");
        
        for (int col = 0; col < m_cols; col++) {
            mat[row][col] = Integer.parseInt(strNums[col]);
        }
    }

    return mat;
	}


	public static void main(String[] args) throws NumberFormatException, IOException {
    int t = Integer.parseInt(br.readLine().trim());

    while(t > 0) {

        int[][] mat = take2DInput();

        spiralPrint(mat);
        System.out.println();

        t -= 1;
    }
}

	

}
