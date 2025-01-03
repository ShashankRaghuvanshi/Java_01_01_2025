package lecture_6_Patterns_2;
import java.util.Scanner;

public class Pattern_Triangle_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+j-1);
			}
			for(int j=2; j<=i; j++)
			{
				System.out.print(i*2-j);
			}
			
			System.out.println("");
		}
		sc.close();

	}

}
