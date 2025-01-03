package lecture_6_Patterns_2;

import java.util.Scanner;

public class Inverted_Number_Pattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i+1; j++)
			{
				System.out.print(n-i+1);
			}
			
			System.out.println("");
		}
		sc.close();

	}

}
