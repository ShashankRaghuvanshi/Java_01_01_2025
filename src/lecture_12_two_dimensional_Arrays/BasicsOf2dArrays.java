package lecture_12_two_dimensional_Arrays;

public class BasicsOf2dArrays {

	public static void main(String[] args) {
		
		int arr2d[][] = new int[3][4];
		System.out.println(arr2d[1][2]);
		arr2d[2][0] = 15;
		System.out.println(arr2d[2][0]);
		
		int arr2[][] = {{1,2,3},{4,5,6}};
		
		System.out.println(arr2[1][1]);

	}

}
