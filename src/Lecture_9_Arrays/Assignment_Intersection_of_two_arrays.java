package Lecture_9_Arrays;
import java.util.Scanner;
public class Assignment_Intersection_of_two_arrays {
	
	public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
	
	public static void main(String[] args) 
    {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr1=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr1[i]=sr.nextInt();
            }
            int m =sr.nextInt();
            int[] arr2=new int[m];
            for (int i =0 ; i<m;i++)
            {
                arr2[i]=sr.nextInt();
            }
            intersections(arr1, arr2);
            System.out .println();
            t -= 1;
        }
    }

}
