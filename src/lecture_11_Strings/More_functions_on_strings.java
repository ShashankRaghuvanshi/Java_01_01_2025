package lecture_11_Strings;

public class More_functions_on_strings {

	public static void main(String[] args) {
		
		String str1 = "Coding";
		
		String str2 = " is fun";
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str1.equals(str3));
		
		String str5 = "Coding";
		System.out.println(str1.equals(str5));
		
		String str6 = "runing";
		System.out.println(str1.equals(str6));
		
		System.out.println(str1.compareTo(str5));
		
		System.out.println(str1.compareTo(str6));
		
		System.out.println(str1.contains("ing"));

	}

}
