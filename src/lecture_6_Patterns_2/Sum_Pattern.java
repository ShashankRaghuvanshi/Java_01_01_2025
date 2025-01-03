package lecture_6_Patterns_2;

import java.util.Scanner;

public class Sum_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{		
			for(int j=1; j<=i; j++)
			{
				if(i==j)
				{
					System.out.print(j);
					break;
				}
				System.out.print(j+"+");
			}
			System.out.print("=");
			
			int sum=0;
			for(int j=0; j<=i; j++)
			{
				sum+=j;
			}
			System.out.println(sum);
			
		}
		
		sc.close();


	}

}
