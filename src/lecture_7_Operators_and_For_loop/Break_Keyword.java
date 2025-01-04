package lecture_7_Operators_and_For_loop;
import java.util.Scanner;

public class Break_Keyword {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int d = 2;
		boolean divided = false;
		
		while(d<n)
		{
			if(n % d == 0)
			{
				divided = true;
				break;
			}
			d = d + 1;
		}
		if(divided)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
		
		sc.close();
	}

}
