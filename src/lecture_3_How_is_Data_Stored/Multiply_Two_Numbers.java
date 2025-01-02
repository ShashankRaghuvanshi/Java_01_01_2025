package lecture_3_How_is_Data_Stored;
import java.util.Scanner;

public class Multiply_Two_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int f1 = sc.nextInt();
		long f2 = sc.nextInt();
		long f3 = f1 * f2;
		
		System.out.println(f3);
		
		sc.close();
	}

}
