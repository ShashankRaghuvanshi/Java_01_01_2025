package lecture_11_Strings;

import java.util.Scanner;

public class Assignment_Remove_Character {
	
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		
		String ans = "";
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) != ch){
				ans += str.charAt(i);
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		char x = sr.next().charAt(0);
		String ans = removeAllOccurrencesOfChar(str, x);
		System.out.println(ans);
		
	}

}
