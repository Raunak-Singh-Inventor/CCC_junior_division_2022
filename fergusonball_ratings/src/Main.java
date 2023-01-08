import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        boolean isGold = true;
        int numStarRatingPlayers = 0;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(r.readLine());
            int points = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(r.readLine());
            int stars = points*5-Integer.parseInt(st.nextToken())*3;
            if(stars<=40) {
                isGold = false;
            }
            if(stars>40) {
                numStarRatingPlayers++;
            }
        }
        if(isGold) {
            System.out.print(numStarRatingPlayers);
            System.out.println("+");
            return;
        }
        System.out.println(numStarRatingPlayers);
    }
}