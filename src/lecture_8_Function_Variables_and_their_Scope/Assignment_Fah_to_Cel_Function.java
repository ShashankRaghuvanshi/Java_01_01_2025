package lecture_8_Function_Variables_and_their_Scope;

import java.util.Scanner;

public class Assignment_Fah_to_Cel_Function {

	public static void fah_to_cel(int S, int E, int W)
	{
		
		while(S <= E) {
			int C = ((S-32)*5)/9;
			System.out.println(S+" "+C);
			S = S + W;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		
		fah_to_cel(S,E,W);
		
		sc.close();

	}

}
