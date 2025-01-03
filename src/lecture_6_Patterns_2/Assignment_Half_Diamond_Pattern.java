package lecture_6_Patterns_2;

import java.util.Scanner;

public class Assignment_Half_Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n==0)
		{
			System.out.println("*");
			sc.close();
			return;
		}
		
		for(int i=0; i<=n; i++)
		{
			System.out.print("*");
			
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			for(int j=2; j<=i; j++)
			{
				System.out.print(i-j+1);
			}
			if(i>0)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=1; i<=n; i++)
		{
			System.out.print("*");
			
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(j);
			}
			for(int j=1; j<=n-i-1; j++)
			{
				System.out.print(n-j-i);
			}
			if(i<n)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();


	}

}
