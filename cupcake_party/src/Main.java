import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int regularBoxes = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        int smallBoxes = Integer.parseInt(st.nextToken());
        System.out.println((regularBoxes*8 + smallBoxes*3)-28);
    }
}