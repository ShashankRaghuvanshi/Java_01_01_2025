package lecture_12_two_dimensional_Arrays;

import java.util.Scanner;

public class Assignment_QueryAndMatrix {
	
	public static int[] query(int[][] mat, int m, int n, String[] q) {
		// Count the number of type-2 queries
        int k = 0;
        for (int i = 0; i < q.length; i++) {
            String query = q[i];
            int queryType = query.charAt(0) - '0';  // Extract query type
            if (queryType == 2) {
                k++;  // Count type-2 queries for the result array size
            }
        }
        
        // Array to store results for type-2 queries
        int[] result = new int[k];
        int j = 0;

        // Process all queries
        for (int i = 0; i < q.length; i++) {
            String query = q[i];
            int queryType = query.charAt(0) - '0';  // Extract query type
            char dimension = query.charAt(1);  // Row or Column (R/C)
            int index = query.charAt(2) - '0';  // Extract the index (1-based)

            if (queryType == 1) {
                // Flip the row or column based on the query
                if (dimension == 'R') {
                    flipRow(mat, index, n);  // Flip the entire row
                } else if (dimension == 'C') {
                    flipColumn(mat, index, m);  // Flip the entire column
                }
            } else if (queryType == 2) {
                // Count the zeros in the specified row or column
                int count = 0;
                if (dimension == 'R') {
                    count = countZerosInRow(mat, index, n);  // Count zeros in row
                } else if (dimension == 'C') {
                    count = countZerosInColumn(mat, index, m);  // Count zeros in column
                }
                result[j] = count;  // Store result for the current query
                j++;
            }
        }

        return result;  // Return the results of type-2 queries
    }

    // Method to flip the entire row (toggle 0s and 1s)
    private static void flipRow(int[][] matrix, int rowIndex, int n) {
        for (int j = 0; j < n; j++) {
            matrix[rowIndex][j] ^= 1;  // Flip using XOR
        }
    }

    // Method to flip the entire column (toggle 0s and 1s)
    private static void flipColumn(int[][] matrix, int colIndex, int m) {
        for (int i = 0; i < m; i++) {
            matrix[i][colIndex] ^= 1;  // Flip using XOR
        }
    }

    // Method to count the number of zeros in a row
    private static int countZerosInRow(int[][] matrix, int rowIndex, int n) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (matrix[rowIndex][j] == 0) {  // Check if the value is zero
                count++;
            }
        }
        return count;
	}

    private static int countZerosInColumn(int[][] matrix, int colIndex, int m) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (matrix[i][colIndex] == 0) {  // Check if the value is zero
                count++;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        while (T-- > 0) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            int[][] matrix = new int[M][N];
            int Q = scanner.nextInt();
            scanner.nextLine();

            String[] queries = new String[Q];
            for (int i = 0; i < Q; i++) {
                queries[i] = scanner.nextLine();
            }

            int[] result = query(matrix, M, N, queries);

            for (int count : result) {
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }

}
