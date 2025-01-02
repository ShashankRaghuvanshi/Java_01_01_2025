package lecture_3_How_is_Data_Stored;
import java.util.Scanner;

public class ASCII_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		int i = ch;
		
		System.out.println(i);
		
		sc.close();
	}

}
