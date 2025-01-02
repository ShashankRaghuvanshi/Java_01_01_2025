package lecture_5_Patterns_1;

import java.util.Scanner;

public class Character_Patterns {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=0; j<n; j++)
			{
				char ch = 'A';
				ch = (char)(ch+j);
				System.out.print(ch);
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				char ch = 'A';
				ch = (char)(ch+j+i);
				System.out.print(ch);
			}
			System.out.println("");
		}
		sc.close();

	}

}
