package lecture_7_Operators_and_For_loop;
import java.util.Scanner;

public class All_prime_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =2;i<=n;i++)
		{
			boolean prime = true;
			
			for(int d=2; i>d; d++)
			{
				if(i % d == 0)
				{
					prime = false;
					break;
				}

			}
			
			if(prime == true)
			{
				System.out.println(i);
			}
			
		}
		
		sc.close();

	}

}
