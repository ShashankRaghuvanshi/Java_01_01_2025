package lecture_11_Strings;

import java.util.Scanner;

public class ReverseStringWordWise {
	
	public static String reverseWordWise(String input) {
		int i = input.length() - 1;
		String output = "";
		int end = input.length();

		while (i >= 0) {
    		if (input.charAt(i) == ' ') {
     		   	output = output + input.substring(i + 1, end) + " ";
       	 		end = i;
    		}
    		i--;
		}
		output += input.substring(i + 1, end);
		return output;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		System.out.println(reverseWordWise(input));
	}

}
