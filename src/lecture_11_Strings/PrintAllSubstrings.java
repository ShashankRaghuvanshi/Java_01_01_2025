package lecture_11_Strings;

import java.util.Scanner;

public class PrintAllSubstrings {

	public static void printAllSubstrings(String input) {
		for(int i=0; i<input.length(); i++) {
			for(int j=i+1; j<=input.length(); j++) {
				System.out.print(input.substring(i,j)+" ");
			}
			System.out.println();
		}
	}
	
	public static void printAllSubstrings1(String input) {
		for(int len=1; len <= input.length(); len++) {
			for(int start=0; start <= input.length()-len; start++) {
				int end = start + len-1;
				System.out.print(input.substring(start,end+1)+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printAllSubstrings(str);
		printAllSubstrings1(str);
		
	}

}
