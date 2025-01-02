package lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Assignment_multiplication_table {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 1;
		int p = 0;
		
		while(i <= 10) {
			p = i * N;
			System.out.println(p);
			i++;
		}
		sc.close();

	}

}
