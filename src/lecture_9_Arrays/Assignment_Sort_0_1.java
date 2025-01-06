package lecture_9_Arrays;
import java.util.Scanner;
public class Assignment_Sort_0_1 {
	
	public static void sortZeroesAndOne(int[] arr) {

        int nextZero = 0; 
        
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == 0) { 
                int temp = arr[nextZero]; 
                arr[nextZero] = arr[i]; 
                arr[i] = temp; 
                nextZero += 1; 
            } 
        } 

    // int left = 0; // Pointer for 0s
    // int right = arr.length - 1; // Pointer for 1s

    // while (left < right) {
    //     // If the left element is 1 and the right element is 0, swap them
    //     if (arr[left] == 1 && arr[right] == 0) {
    //         int temp = arr[left];
    //         arr[left] = arr[right];
    //         arr[right] = temp;
    //         left++;
    //         right--;
    //     }

    //     // If the left element is 0, move the left pointer forward
    //     if (arr[left] == 0) {
    //         left++;
    //     }

    //     // If the right element is 1, move the right pointer backward
    //     if (arr[right] == 1) {
    //         right--;
    //     }
    // }
    }
	
	public static void main(String[] args) 
    {
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
            sortZeroesAndOne(arr);
             for(int i=0;i<n;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
           
            t -= 1;
        }
        
    }
	
	

}
