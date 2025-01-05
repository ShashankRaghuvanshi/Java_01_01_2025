package lecture_8_Function_Variables_and_their_Scope;

public class Function_Overloading {
	
	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}
	
	public static double sum(double a, double b) {
		double result = a + b;
		return result;
	}
	
	public static int sum(int a) {
		return a + 1;
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println(sum(a,b));
		System.out.println(sum(a));
		System.out.println(sum(10.5,11.5));
	}

}
