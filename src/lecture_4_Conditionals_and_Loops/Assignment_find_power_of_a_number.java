package lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Assignment_find_power_of_a_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int p = 1;
		
		if(n == 0)
		{
			p = 1;
		}
		else
		{
			int i = 1;
			while(i <= n)
			{
				p = p * x;
				i++;
			}
		}
		
		System.out.println(p);
		sc.close();
	}

}
