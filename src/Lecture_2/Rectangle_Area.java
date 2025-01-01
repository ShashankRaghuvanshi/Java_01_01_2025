package Lecture_2;
import java.util.Scanner;
public class Rectangle_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int l1 = x2 - x1;
		int l2 = y2-y1;
		
		System.out.println(l1*l2);
		
		sc.close();

	}

}
