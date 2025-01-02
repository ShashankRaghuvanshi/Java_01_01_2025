package lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n % 2 == 0)
		{
			System.out.println("Even");
			return;
		}
		
		System.out.println("Odd");
		
//		else
//		{
//			System.out.println("Odd");
//		}
		
	}

}
