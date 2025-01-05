package lecture_8_Function_Variables_and_their_Scope;

public class Functions_with_void_return_type {

	public static int divideNumbers(int num, int deno) {
		
		if(deno == 0)
		{
			return Integer.MIN_VALUE;
		}
		return num / deno;
	}
	
	public static void printDivisonResult(int num, int deno) {
		
		if(deno == 0)
		{
			System.out.println("Division by zero is not allowed");
			//exit the function
			return;
		}
		System.out.println(num / deno);
	}
	
	public static void main(String[] args) {
		
		int num = 8;
		int deno = 0;  //divided by zero arithmetic exceptions
		int result = divideNumbers(num, deno);
		printDivisonResult(num, deno);
		System.out.println(result);
		

	}

}
