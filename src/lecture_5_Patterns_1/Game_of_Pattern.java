package lecture_5_Patterns_1;

import java.util.Scanner;

public class Game_of_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print("#");
			}
			System.out.println("");
		}
		sc.close();
	}

}
