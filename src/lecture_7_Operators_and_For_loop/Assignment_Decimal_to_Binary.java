package lecture_7_Operators_and_For_loop;

import java.util.Scanner;

public class Assignment_Decimal_to_Binary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long sum = 0;
		int count = 0;
		int r ;
		
		while(n > 0)
		{
			r = n % 2;
			sum = sum + r * (long)Math.pow(10, count);
			n= n/2;
			count++;
		}
		System.out.print(sum);
		
		sc.close();

	}
	
	//we can do with String Builder also

}
