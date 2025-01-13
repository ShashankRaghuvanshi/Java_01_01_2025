package test_2;

import java.util.Scanner;

public class LeadersInArray {
	
	public static void leaders(int[] input) {
		
		for(int i=0; i<input.length; i++){
			boolean isleader = true;

			for(int j=i+1; j<input.length; j++){
				if(input[i] < input[j]){
					isleader = false;
					break;
				}
			}	
			if(isleader)	{
				System.out.print(input[i]+" ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
                int[] input = new int[n];  

		for(int i=0; i<n; i++) {  
                //reading array elements from the user   
                 input[i]=s.nextInt();  
                }  
		leaders(input);

	}


}
