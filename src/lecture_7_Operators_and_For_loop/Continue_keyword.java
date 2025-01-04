package lecture_7_Operators_and_For_loop;

public class Continue_keyword {

	public static void main(String[] args) {
		
		int n = 4;
		
		for(int i = 1; i<=n; i++)
		{
			if(i == 2)
			{
				continue;
			}
			System.out.println(i);
			
		}

	}

}
