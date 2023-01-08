import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(r.readLine());
        String input = st.nextToken();
        char[] input_arr = input.toCharArray();
        for(int i = 0; i < input_arr.length; i++) {
            while(Character.isDigit(input_arr[i])) {
                System.out.print(input_arr[i]);
                i++;
                if(i>= input_arr.length) {
                    System.out.println();
                    return;
                }
                if(!Character.isDigit(input_arr[i])) {
                    System.out.println();
                }
            }
            if(input_arr[i]=='+') {
                System.out.print(" tighten ");
            } else if(input_arr[i]=='-') {
                System.out.print(" loosen ");
            } else {
                System.out.print(input_arr[i]);
            }
        }
    }
}