package lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class Assignment_Fibonacci_Member {
	
	public static boolean checkMember(int n)
	{
		int a = 0;
		int b = 1;

		if (n == 0 || n == 1) {
            return true;
        }

		for(int i = 0; a < n; i++)
		{
			int c = a + b;
			a = b;
			b = c;
		} 
		if(a== n)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		boolean b = checkMember(n);
		System.out.println(b);
		
		s.close();

	}

}
