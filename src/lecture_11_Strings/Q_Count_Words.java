package lecture_11_Strings;

import java.util.Scanner;

public class Q_Count_Words {
	public static int countWords(String input) {
		if(input.length() == 0) {
			return 0;
		}
		int count = 1;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == ' ') {
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = countWords(str);
		System.out.println(count);
	}
}
