package lecture_7_Operators_and_For_loop;
import java.util.Scanner;

public class For_loop_variations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		
		for(int i=1, j=1; i<=n && j<=n+100; i++,j+=20)
		{
			System.out.println(i+" "+j);
		}
		sc.close();
	}

}
