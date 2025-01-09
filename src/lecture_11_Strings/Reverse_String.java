package lecture_11_Strings;

import java.util.Scanner;

public class Reverse_String {
	public static String reverseString(String input) {
		String str = "";
		for(int i=input.length()-1; i>=0; i--) {
			str += input.charAt(i);
		}
		return str;
	}
	
	public static String reverseString1(String input) {
		String str = "";
		for(int i=0; i < input.length(); i++) {
			str = input.charAt(i)+str;
		}
		return str;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String ans = reverseString(str);
		System.out.println(ans);
		
		String ans1 = reverseString1(str);
		System.out.println(ans1);
	}
}
