package lecture_7_Operators_and_For_loop;

import java.util.Scanner;

public class Assignment_Square_Root {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++)
		{
			if((i*i) <= n && (i+1)*(i+1)>n)
			{
				System.out.println(i);
				break;
			}
		}
		sc.close();

	}

}
