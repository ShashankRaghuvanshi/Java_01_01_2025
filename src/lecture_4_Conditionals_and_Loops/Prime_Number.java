package lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int d = 2;
		
		while(d<n)
		{
			if(n % d == 0)
			{
				System.out.println("Not Prime");
				return;
			}
			else
			{
				d++;
			}
		}
		System.out.println("Prime");
		
		sc.close();
	}

}
