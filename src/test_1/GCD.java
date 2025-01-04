package test_1;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Write your code 
				Scanner sc = new Scanner(System.in);
				int test = sc.nextInt();

				int [][] val = new int [test][2];

				for(int i=0; i<val.length; i++)
				{
					val[i][0] = sc.nextInt();
					val[i][1] = sc.nextInt();
				}

				for(int i=0; i<val.length; i++)
				{
					int a = val[i][0];
					int b = val[i][1];

					int gcd_max;
					int gcd = 1;

					if(a<=b)
					{
						gcd_max = a;
					}
					else{
						gcd_max = b;
					}

					int k=2;

					while(k<=gcd_max)
					{
						if(a%k==0 && b%k==0)
						{
							gcd = k;
						}
						k++;
					}
					System.out.println(gcd);

				}
				sc.close();
	}

}
