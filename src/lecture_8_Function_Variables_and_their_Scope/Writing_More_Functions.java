package lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class Writing_More_Functions {

	public static int factorial(int n){
		int ans = 1;
		for(int i =1; i<=n; i++){
			ans = ans * i;
		}
		return ans;
	}
	
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
	
	public static void print_Till_N(int n)
	{
		if(n<=0)
		{
			return;
		}
		for(int i=1; i<=n; i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		print_Till_N(20);
		
		boolean ans1 =isPrime(13);
		System.out.println(ans1);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int num = factorial(n);
		
		int den1 = factorial(r);
		
		int den2 = factorial(n-r);
		
		int ans = num/(den1 * den2);
		
		System.out.println(ans);
		
		sc.close();
	}

}
