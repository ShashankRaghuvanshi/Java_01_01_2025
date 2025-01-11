package lecture_11_Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("abc");
		str.setCharAt(1, 'e');
		System.out.println(str);
		str.append("def");
		System.out.println(str+ " " + str.length());
		
	}

}
