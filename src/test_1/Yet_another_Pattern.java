package test_1;

import java.util.Scanner;

public class Yet_another_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] r = new int[N];
		
		for(int k=0; k<r.length; k++)
		{
			r[k] = sc.nextInt();
		}
		
		for(int k=0; k<r.length; k++)
		{
			int n= r[k];
			for(int i=1; i<=n; i++)
			{
				for(int j=1; j<i; j++)
				{
					System.out.print(" ");
				}
				for(int j=1; j<=n-i+1; j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		sc.close();
	}

}
