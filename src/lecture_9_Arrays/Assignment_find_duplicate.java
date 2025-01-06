package lecture_9_Arrays;
import java.util.Scanner;

public class Assignment_find_duplicate {
	
	public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        for(int i=0; i<arr.length; i++){
                boolean isunique=true;
                for(int j=0; j<arr.length; j++){
                    if(i != j && arr[i]==arr[j]){
                        isunique=false;
                        return arr[i];
                    }
                }
        }
        return Integer.MAX_VALUE;
    }
	
	public static void main(String[] args)  {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        while(t > 0) 
        {
            int n=sr.nextInt();
            int[] arr=new int[n];
            for (int i =0 ; i<n;i++)
            {
                arr[i]=sr.nextInt();
            }
            System.out.println(duplicateNumber(arr));
           
            t -= 1;
        }
    }
}
