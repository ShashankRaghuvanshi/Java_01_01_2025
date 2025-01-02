package lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Assignment_Factors {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int d = 2;
		int count = 0;
		
		while(d <= (n-1))
		{
			if (n % d == 0)
			{
				System.out.print(d+" ");
				count++;
			}
			d++;
		}
		
		if(count == 0)
		{
			System.out.println("-1");
		}
		sc.close();

	}

}
