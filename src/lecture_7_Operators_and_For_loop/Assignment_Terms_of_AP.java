package lecture_7_Operators_and_For_loop;
import java.util.Scanner;

public class Assignment_Terms_of_AP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		for(int i=1,count=0; count<n; i++)
		{
			int t = 3 * i + 2;
			
			if(t % 4 == 0)
			{
				continue;
			}
			count ++;
			System.out.print(t+" ");
		}
		sc.close();

	}

}
