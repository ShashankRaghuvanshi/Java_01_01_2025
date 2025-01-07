package lecture_10_Searching_and_Sorting;

import java.util.Scanner;

public class Merge_to_sorted_arrays {
	
public static int[] merge(int arr1[], int arr2[]) {
    	
        int arr3 [] = new int[arr1.length+arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){
            if( arr1[i] <= arr2[j] ){
                arr3[k] = arr1[i];
                k++;
                i++;
            }
            else{
                arr3[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(arr1.length > i){
            arr3[k] = arr1[i];
            k++;
            i++;
        }

        while(arr2.length > j){
            arr3[k] = arr2[j];
            k++;
            j++;
        }

        return arr3;   
	}

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int t = sc.nextInt();
	
	while(t>0)
	{
	    int n = sc.nextInt();
	    int[] arr1 = new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr1[i] = sc.nextInt();
	    }
	    int m = sc.nextInt();
	    int[] arr2 = new int[m];
	    for(int i=0;i<m;i++)
	    {
	        arr2[i] = sc.nextInt();
	    }
	    int[] ans = new int[m+n];
	    ans = merge(arr1, arr2);
        for(int i=0;i<m+n;i++)
        {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
        t-=1;
	}
	
	}
}

