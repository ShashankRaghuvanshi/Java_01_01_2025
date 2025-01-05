package lecture_8_Function_Variables_and_their_Scope;

public class Pass_by_Value {
	
	public static void increment(int n) {
		n = n + 1;
	}

	public static void main(String[] args) {
		
		int a = 10;
		increment(a);
		System.out.println(a);

	}

}
