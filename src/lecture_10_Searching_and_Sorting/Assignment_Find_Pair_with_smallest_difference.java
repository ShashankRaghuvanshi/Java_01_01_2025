package lecture_10_Searching_and_Sorting;

import java.util.Scanner;

public class Assignment_Find_Pair_with_smallest_difference {
	
	public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            // Swap the smallest element with the current position
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    // Function to find the smallest difference
    public static int smallestDifferencePair(int[] arr1, int n, int[] arr2, int m) {
        // Sort both arrays using the helper function
        selectionSort(arr1, n);
        selectionSort(arr2, m);

        // Two-pointer approach to find the smallest difference
        int p = 0, q = 0;
        int minDiff = Math.abs(arr1[0] - arr2[0]);

        while (p < n && q < m) {
            int diff = Math.abs(arr1[p] - arr2[q]);
            minDiff = Math.min(minDiff, diff);

            // Move the pointer of the smaller element
            if (arr1[p] < arr2[q]) {
                p++;
            } else {
                q++;
            }
        }

        return minDiff;
    }
    
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        int t= sr.nextInt();
        while(t > 0)
        {
            int n=sr.nextInt();
            int m = sr.nextInt();
            int a[] = new int[n];
            for(int i = 0 ; i<n ;i++)
            {
                a[i] = sr.nextInt();
            }
            
            int b[] =new int[m];
            //int index=0;
            for(int i=0;i<m;i++)
            {
                b[i]=sr.nextInt();
            }
            int ans;
            ans =smallestDifferencePair(a, n, b, m);
            System.out.println(ans);
            t = t-1;
        }
    }
    
    
}
