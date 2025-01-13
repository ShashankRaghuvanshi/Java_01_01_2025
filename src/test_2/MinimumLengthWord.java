package test_2;

import java.util.Scanner;

public class MinimumLengthWord {
	
	
	public static String minLengthWord(String input){
		
		String ansMin = "";
		int minLen = Integer.MAX_VALUE;
		int minstartIndex =0;
		int minendIndex = 0;
		int start=0;
		int end=0;
		int length = 0;

		for(int i=0; i<input.length(); i++){
			if((input.charAt(i) == ' ') || (i == input.length() - 1)){
				end= (i == input.length() - 1) ? i+1: i;
				length = end - start;

				if(length < minLen && length>0){
					minLen = length;
					minstartIndex = start;
					minendIndex = end;
					ansMin = input.substring(minstartIndex, minendIndex);
				}
			}
			start = end+1;
		}

		return ansMin;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.println(minLengthWord(str));
	}

}
