package lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Fah_to_Celsius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		
		int C;
		
		while(S <= E) {
			C = ((S-32)*5)/9;
			System.out.println(S+" "+C);
			S = S + W;
		}
		sc.close();
	}

}
