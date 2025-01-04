package lecture_7_Operators_and_For_loop;

import java.util.Scanner;

public class Assignment_Reverse_of_a_number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		int sum = 0;
		int r;
		
		while(n>0)
		{
			r = n % 10;
			sum = sum * 10 + r;
			n /= 10;
			
		}
		System.out.println(sum);
		sc.close();

	}

}
