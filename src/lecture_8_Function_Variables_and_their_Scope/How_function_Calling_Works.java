package lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class How_function_Calling_Works {
	
	public static boolean isPrime(int n)
	{
		int d = 2;
		
		while(d<n) {
			if(n % d == 0) {
				return false;
			}
			d++;
		}
		return true;
	}
	
	public static void print_prime(int n)
	{
		for(int i=2; i<=n; i++)
		{
			boolean isPrime = isPrime(i);
			if(isPrime == true) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		print_prime(n);
		
		sc.close();
		
	}

}
