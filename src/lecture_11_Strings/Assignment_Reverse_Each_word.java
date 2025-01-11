package lecture_11_Strings;

import java.util.Scanner;

public class Assignment_Reverse_Each_word {
	
	public static String reverseEachWord(String str) {
		int start = 0;
		int end = 0;
		String ans = "";
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == ' '){
				end = i;
				String revWord = "";
				for(; start<=end-1; start++){
						revWord = str.charAt(start) + revWord;
				}
				ans += revWord+ " ";
				start = end;
			}
		}

		String revWord = "";
		end = str.length()-1;
		for(; start<=end; start++){
				revWord = str.charAt(start) + revWord;
		}
		ans += revWord;

		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String str = sr.nextLine();
		String ans = reverseEachWord(str);
		System.out.println(ans);
		
	}

}
