package test_2;

import java.util.Scanner;

public class CountAndSay {
	
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        StringBuffer sb = new StringBuffer();

        while (t-- > 0) {
            int n = s.nextInt();
            String ans = writeAsYouSpeak(n);
            sb.append(ans + "\n");
        }
        System.out.print(sb);
    }
	
	public static String writeAsYouSpeak(int n) 
    {
        String current = "1";

        for(int i = 1; i<n; i++){
            StringBuilder next = new StringBuilder();
            int count = 1;

            for(int j=1; j<current.length(); j++){
                if(current.charAt(j) == current.charAt(j-1)){
                    count++;
                }else{
                    next.append(count).append(current.charAt(j-1));
                    count = 1;
                }
            }

            next.append(count).append(current.charAt(current.length() -  1));

            current = next.toString();
        }
        return current;

    }

}
