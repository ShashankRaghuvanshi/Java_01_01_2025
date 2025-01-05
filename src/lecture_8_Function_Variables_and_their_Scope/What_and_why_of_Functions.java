package lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class What_and_why_of_Functions {
	
	public static int factorial(int n){
		int ans = 1;
		for(int i =1; i<=n; i++){
			ans = ans * i;
		}
		return ans;
	}
	
	public static int ncr(int n, int r)
	{
		int num = factorial(n);
		
		int den1 = factorial(r);
		
		int den2 = factorial(n-r);
		
		int ans = num/(den1 * den2);
		
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int ans = ncr(n,r);
		
		System.out.println(ans);
		
		sc.close();

	}

}
