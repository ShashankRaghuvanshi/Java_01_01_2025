package lecture_6_Patterns_2;

import java.util.Scanner;

public class Odd_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{		
			for(int j=1; j<=n-i+1; j++)
			{
				System.out.print((j+i-1)*2-1);
			}
			for(int j=1; j<i; j++)
			{
				System.out.print((j)*2-1);
			}
			System.out.println("");
			
		}
		
		sc.close();

	}

}
