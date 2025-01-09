package lecture_11_Strings;

import java.util.Scanner;

public interface TakingStringInput {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		str = sc.next();
		System.out.println(str+ " " + str.length());
		
		String str2 = sc.nextLine();
		System.out.println(str2+ " " + str2.length());

	}


}
