package lecture_11_Strings;

import java.util.Scanner;

public class Assignment_Compress_The_String {
	
	public static String getCompressedString(String str) {
		
		// If the input string is empty, return it directly
        if (str == null || str.length() == 0) {
            return str;
        }

        String compressed = ""; // Using a plain string for compression
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            // If the current character is the same as the previous one, increment the count
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Append the character and its count if count > 1
                compressed += str.charAt(i - 1);
                if (count > 1) {
                    compressed += count;
                }
                count = 1; // Reset the count
            }
        }

        // Handle the last group of characters
        compressed += str.charAt(str.length() - 1);
        if (count > 1) {
            compressed += count;
        }

        return compressed;

	}
	
	public static String compressString(String str) {
        // If the input string is empty, return it directly
        if (str == null || str.length() == 0) {
            return str;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            // If the current character is the same as the previous one, increment the count
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // Append the character and its count if count > 1
                compressed.append(str.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1; // Reset the count
            }
        }

        // Handle the last group of characters
        compressed.append(str.charAt(str.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }

        return compressed.toString();
    }
	
	
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = getCompressedString(str);
		System.out.println(ans);
		
	}

}
