package Lecture_9_Arrays;
import java.util.Scanner;
public class Assignment_Find_Unique {
	
	public static int findUnique(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true; // Assume the current element is unique
        
			// Check the rest of the array for duplicates
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) { 
					isUnique = false; // If a duplicate is found, set flag to false
					break; // No need to keep searching
				}
			}

			// If no duplicates were found, return the unique element
			if (isUnique) {
				return arr[i];
			}
		}	

		// If no unique element is found, return 0 (this case won't happen due to the problem constraints)
		return 0;
	 }
    //chatgpt
//    int unique = 0;
//    for (int num : arr) {
//        unique ^= num; // XOR all the numbers
//    }
//    return unique; // The result is the unique number
   
	
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
            System.out.println(findUnique(arr));
           
            t -= 1;
        }
    }

}
