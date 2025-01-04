package lecture_7_Operators_and_For_loop;
import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int r;
		int count = 0;
		int s = 0;
		
		while(n>0)
		{
			r = n % 10;
			s = s + r * (1<<count);  
			//Math.pow(2, n) & Using Bit Shifting
			count ++;
			n /= 10;
		}
		
		System.out.println(s);
		
		sc.close();

	}

}
