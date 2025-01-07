package lecture_10_Searching_and_Sorting;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment_Sort_0_1_2 {
	
	public static void sort012(int[] arr) {
        int nextZero = 0; 
        int nextTwo = arr.length - 1; 
        int i = 0; 
        
        // Traverse the array
        while (i <= nextTwo) { 
            if (arr[i] == 0) { 
                // Swap arr[i] with arr[nextZero]
                int temp = arr[nextZero]; 
                arr[nextZero] = arr[i]; 
                arr[i] = temp; 
                
                // Increment both pointers
                i++; 
                nextZero++; 
            } else if (arr[i] == 2) { 
                // Swap arr[i] with arr[nextTwo]
                int temp = arr[nextTwo]; 
                arr[nextTwo] = arr[i]; 
                arr[i] = temp; 
                
                // Decrement the nextTwo pointer
                nextTwo--; 
            } else { 
                // Move to the next element
                i++; 
            } 
        } 
    }
	
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[] takeInput() throws IOException {
        int size = Integer.parseInt(br.readLine().trim());
        int[] input = new int[size];

        if (size == 0) {
            return input;
        }
        
        String[] strNums; 
        strNums = br.readLine().split("\\s");
        

        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }

        return input;
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        int t = Integer.parseInt(br.readLine().trim());

        while(t > 0) {

            int[] input = takeInput();
            sort012(input);
            printArray(input);

            t -= 1;
        }
    }

}
