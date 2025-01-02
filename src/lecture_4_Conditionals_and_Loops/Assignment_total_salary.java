package lecture_4_Conditionals_and_Loops;
import java.util.Scanner;

public class Assignment_total_salary {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int basic = sc.nextInt();
		
		char grade = sc.next().charAt(0);
		
		double HRA = 0.2 * basic; 
		double DA = 0.5 * basic;
		double PF = 0.11 * basic;
		int Allow;
		double Total_salary;
		
		if(grade == 'A')
		{
			Allow = 1700;
			Total_salary = (basic + HRA + DA + Allow - PF);
		}
		else if(grade == 'B')
		{
			Allow = 1500;
			Total_salary = (basic + HRA + DA + Allow - PF);
		}
		else
		{
			Allow = 1300;
			Total_salary = (basic + HRA + DA + Allow - PF);
		}
		System.out.println(Math.round(Total_salary));
		
		sc.close();

	}

}
