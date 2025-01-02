package lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Assignment_Sum_of_even_and_odd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int r;
		int sum_even = 0;
		int sum_odd = 0;
		
		while(n > 0)
		{
			r = n % 10;
			n = n / 10;
			if(r % 2 != 0)
			{
				sum_odd = sum_odd + r;
			}
			else
			{
				sum_even = sum_even + r;
			}
		}
		
		System.out.println(sum_even+" "+sum_odd);
		
		sc.close();

	}

}
