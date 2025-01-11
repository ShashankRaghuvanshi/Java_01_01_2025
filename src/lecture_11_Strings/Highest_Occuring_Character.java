package lecture_11_Strings;

import java.util.Scanner;

public class Highest_Occuring_Character {
	
	public static char highestOccuringChar(String str) {
		
		int frequency [] = new int[256];
		char result= ' ';
		for(int i=0; i<str.length(); i++){
			frequency[str.charAt(i)]++;
		}

		int maxfrq = Integer.MIN_VALUE;
		for(int i=0; i<frequency.length; i++){
			if(frequency[i] > maxfrq){
				maxfrq = frequency[i];
				result = (char)i;
			}
		}
		return result;

	}

	public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	String str = sr.nextLine();
	char ans = highestOccuringChar(str);
	System.out.println(ans);
	
}

}
