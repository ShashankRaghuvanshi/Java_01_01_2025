package lecture_11_Strings;

import java.util.Scanner;

public class Highest_Occuring_Character {
	
public static char highestOccuringChar(String str) {
		
		int frequecy [] = new int[255];
		char ch= ' ';
		for(int i=0; i<str.length(); i++){
			frequecy[str.charAt(i)]++;
		}

		int maxfrq = Integer.MIN_VALUE;
		for(int i=0; i<frequecy.length; i++){
			if(frequecy[i] > maxfrq){
				maxfrq = frequecy[i];
				ch = (char)i;
			}
		}
		return ch;

	}

	public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	String str = sr.nextLine();
	char ans = highestOccuringChar(str);
	System.out.println(ans);
	
}

}
