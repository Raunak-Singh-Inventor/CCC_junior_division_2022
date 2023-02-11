import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] rows = new int[m];
        int[] cols = new int[n];

        st = new StringTokenizer(r.readLine());
        int k = Integer.parseInt(st.nextToken());
        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(r.readLine());
            String axis = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            if(axis.equals("R")) {
                rows[num-1]++;
            } else if(axis.equals("C")) {
                cols[num-1]++;
            }
        }

        int res = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if((rows[i]+cols[j])%2==1) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}