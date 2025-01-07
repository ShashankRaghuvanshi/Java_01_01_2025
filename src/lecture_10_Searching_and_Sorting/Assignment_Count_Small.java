package lecture_10_Searching_and_Sorting;

import java.util.Scanner;

public class Assignment_Count_Small {
	
	public static int[] countS(int n, int m, int []a, int []b) {
        
        // Create a vector ans of size n. 
        int []ans = new int[n] ; 
        
        // For loop from 0 to n-1. 
        for(int idx = 0; idx < n; idx++) {
             // set lo = 0, hi = m-1. 
             int lo = 0, hi = m - 1, cnt = 0 ; 
             // binary search. 
             while(lo <= hi) { 
                 int mid = lo + (hi - lo) / 2 ; 
                 // If element at mid is less than or equal to // a[idx], set lo to mid+1, else reduce hi to mid-1. 
                 if(b[mid] <= a[idx]) { 
                     cnt = mid+1 ; 
                     lo = mid+1 ; 
                } 
                else { 
                    hi = mid-1 ; 
                    } 
                } // update ans at idx with cnt. 
                ans[idx] = cnt ;
            } // return ans. 
            return ans ;
    }

	public static void main(String[] args) 
	{
    Scanner sr = new Scanner(System.in);
    int t= sr.nextInt();
    while(t > 0)
    {
	    int n=sr.nextInt();
	    int a[] = new int[n];
	    for(int i = 0 ; i<n ;i++)
	    {
	        a[i] = sr.nextInt();
	    }
		int m = sr.nextInt();
		int b[] =new int[m];
	    //int index=0;
	    for(int i=0;i<m;i++)
	    {
	        b[i]=sr.nextInt();
	    }
		int ans[] = new int[n];
		ans =countS(n, m, a, b);
		for(int i=0;i<n;i++)
		{
			System.out.print(ans[i]+" ");
		}
	    System.out.println();
	
	    t = t-1;
    }
}
	
}
