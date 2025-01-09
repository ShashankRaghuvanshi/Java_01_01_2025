package lecture_11_Strings;

public class String_Substring_function {

	public static void main(String[] args) {
		
		String str1 = "Coding";
		String substr = str1.substring(0);
		System.out.println(substr);
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(2));
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(4));
		System.out.println(str1.substring(5));
		System.out.println(str1.substring(6));
		System.out.println(substr.length());
		
		System.out.println(str1.substring(1,5));
		System.out.println(str1.substring(1,6));
		System.out.println(str1.substring(0,6));

	}

}
