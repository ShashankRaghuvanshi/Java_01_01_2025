package lecture_7_Operators_and_For_loop;

import java.util.Scanner;

public class Assignment_Sum_or_Product {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int c = sc.nextInt();
		
		switch(c)
		{
		case 1:
			int sum = 0;
			for(int i=1; i<=n; i++) {
				sum += i;
			}
			System.out.println(sum);
			break;
		
		case 2:
			int prod= 1;
			for(int i=1; i<=n; i++)
			{
				prod *= i;
			}
			System.out.println(prod);
			break;
			
		default:
			System.out.println("-1");
			break;
		}
		
		sc.close();

	}

}
