package lecture_7_Operators_and_For_loop;
import java.util.Scanner;

public class Assignment_Check_Number_Sequence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();  // Read the number of elements in the sequence
        int[] sequence = new int[n];
        
        // Read the sequence
        for (int i = 0; i < n; i++) {
            sequence[i] = sc.nextInt();
        }
        
        // Flag to check if the sequence can be split
        boolean canSplit = true;
        
        int i = 0;
        
        // Step 1: Find the longest strictly decreasing subsequence starting from the beginning
        while (i < n - 1 && sequence[i] > sequence[i + 1]) {
        	i++;
        }
        
        // Step 2: Find the longest strictly increasing subsequence starting from where the decrease stopped
        while (i < n - 1 && sequence[i] < sequence[i + 1]) {
            i++;
        }
        
        // If we have processed the entire sequence, return true (valid split)
        if (i != n - 1) {
            canSplit = false;
        }
        
        // Print the result (true/false)
        System.out.println(canSplit);
        
        sc.close();

	}

}
