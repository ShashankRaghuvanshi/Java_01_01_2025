package lecture_11_Strings;

import java.util.Scanner;

public class Code_PrintAllCharsofStringinSeperateLines {

	public static void printChars(String input) {
		for(int i=0; i<input.length(); i++) {
			System.out.println(input.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printChars(str);
	}

}
