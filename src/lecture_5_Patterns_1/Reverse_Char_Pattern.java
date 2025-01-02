package lecture_5_Patterns_1;

import java.util.Scanner;

public class Reverse_Char_Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				char ch = 'A';
				ch = (char)(ch+n-j-1);
				System.out.print(ch);
			}
			System.out.println("");
		}
		
		sc.close();

	}

}
