package lecture_11_Strings;

import java.util.Scanner;

public class Check_Palindrome_Hint {

	public static boolean checkPalindrome(String input) {
		String reverseString = reverseString(input);
		if(input.contentEquals(reverseString)) {  //input.equals(reverseString)
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean checkPalindrome1(String input) {
		for(int i=0; i<input.length()/2; i++) {
			if(input.charAt(i) != input.charAt(input.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static String reverseString(String input) {
		String str = "";
		for(int i=0; i < input.length(); i++) {
			str = input.charAt(i)+str;
		}
		return str;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean ans = checkPalindrome(str);
		System.out.println(ans);
		
		boolean ans1 = checkPalindrome1(str);
		System.out.println(ans1);
		
	}

}
