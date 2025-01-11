package lecture_11_Strings;

import java.util.Scanner;

public class Assignment_Check_Permutation {
	
	public static boolean isPermutation(String str1, String str2) {
	    // If lengths are not equal, they cannot be permutations
	    if (str1.length() != str2.length()) {
	        return false;
	    }

	    // Create an array to count character frequencies
	    int[] charCounts = new int[256]; // Assuming ASCII characters

	    // Count characters in the first string
	    for (int i = 0; i < str1.length(); i++) {
	        charCounts[str1.charAt(i)]++;
	    }

	    // Decrease counts based on the second string
	    for (int i = 0; i < str2.length(); i++) {
	        charCounts[str2.charAt(i)]--;
	        // If count becomes negative, strings are not permutations
	        if (charCounts[str2.charAt(i)] < 0) {
	            return false;
	        }
	    }

	    // If we reach here, the strings are permutations
	    return true;
	}
	
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str1 = sr.nextLine();
		String str2 = sr.nextLine();
		boolean ans = isPermutation(str1, str2);

		System.out.println(ans);
		
	}

}
