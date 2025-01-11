package lecture_11_Strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	public static String removeConsecutiveDuplicates(String str) {
		String ans = "";
		int i=0;
		for(i=0; i<str.length()-1;){
			if(str.charAt(i) == str.charAt(i+1)){
				i++;
			}
			else{
				ans = ans + str.charAt(i);
				i++;
			}
		}
		return ans + str.charAt(i);
	}
	
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = removeConsecutiveDuplicates(str);;

		System.out.println(ans);
		
	}

}
