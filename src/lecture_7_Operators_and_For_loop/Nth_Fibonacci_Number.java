package lecture_7_Operators_and_For_loop;
import java.util.Scanner;

public class Nth_Fibonacci_Number {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		int c;
		for(int i = 0; i < n; i++)
		{
			c = a + b;
			a = b;
			b = c;
		} 
		System.out.println(a);
		
		s.close();
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		sc.close();
//		
//		if(n == 1 || n == 2)
//		{
//			System.out.println("1");
//			return;
//		}
//		
//		int a = 1;
//		int b = 1;
//		int count;
//		int fn = 1;
//		
//		for(count = 3; count <= n; count ++)
//		{
//			fn = a + b;
//			a = b;
//			b = fn;
//		}
//		
//		System.out.println(fn);
		
	}

}
