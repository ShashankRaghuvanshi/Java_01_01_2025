package lecture_10_Searching_and_Sorting;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Insertion_Sort {

	public static void insertionSort(int[] arr, int size) {
        
        for(int i = 1; i< arr.length; i++){

            int j = i - 1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
	
	public static class FastReader {

        BufferedReader br;
        StringTokenizer root;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (root == null || !root.hasMoreTokens()) {
                try {
                    root = new StringTokenizer(br.readLine());
                } catch (Exception r) {
                    r.printStackTrace();
                }
            }
            return root.nextToken();
        }

        String nextL() throws IOException {
            return br.readLine();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static FastReader sc = new FastReader();

    private static int t;
    private static int []n;
    private static int [][]arr;

    private static void takeInput() throws IOException {
        t = 1;
        n = new int[t];
        arr = new int[t][];
        for (int i = 0; i < t; ++i) {
            n[i] = sc.nextInt();
            arr[i] = new int[n[i]];
            for(int j = 0; j < n[i]; j++)
                arr[i][j] = sc.nextInt();
        }
    }

    private static void execute() {
        for (int i = 0; i < t; ++i) {
            insertionSort(arr[i], n[i]);
        }
    }

    private static void executeAndPrintOutput() {
        for (int i = 0; i < t; ++i) {
            insertionSort(arr[i], n[i]);
            for(int j : arr[i]){
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        takeInput();
        executeAndPrintOutput();
    }


}
