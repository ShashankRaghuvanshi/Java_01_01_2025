package lecture_7_Operators_and_For_loop;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		
		for(int i = 1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(j+" ");
				if(j>i)
				{
					break;
				}
			}
			System.out.println();
		}

	}

}
