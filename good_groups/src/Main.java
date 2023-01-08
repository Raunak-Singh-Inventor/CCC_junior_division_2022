import java.io.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(r.readLine());
        int x = Integer.parseInt(st.nextToken());
        String[][] sameGroupPairs = new String[x][2];
        for (int i = 0; i < x; i++) {
            st = new StringTokenizer(r.readLine());
            sameGroupPairs[i] = new String[]{st.nextToken(), st.nextToken()};
        }
        st = new StringTokenizer(r.readLine());
        int y = Integer.parseInt(st.nextToken());
        String[][] difGroupPairs = new String[y][2];
        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(r.readLine());
            difGroupPairs[i] = new String[]{st.nextToken(), st.nextToken()};
        }
        st = new StringTokenizer(r.readLine());
        int g = Integer.parseInt(st.nextToken());
        String[][] groups = new String[g][3];
        int constraintsViolated = 0;
        for(int i = 0; i < g; i++) {
            st = new StringTokenizer(r.readLine());
            groups[i] = new String[] {st.nextToken(), st.nextToken(), st.nextToken()};
        }
        for(int i = 0; i < x; i++) {
            boolean[] pairTruth = new boolean[2];
            for(int j = 0; j < g; j++) {
                pairTruth = new boolean[2];
                for(int k = 0; k < 3; k++) {
                    if (Objects.equals(sameGroupPairs[i][0], groups[j][k])) {
                        pairTruth[0] = true;
                    }
                    if (Objects.equals(sameGroupPairs[i][1], groups[j][k])) {
                        pairTruth[1] = true;
                    }
                    if(pairTruth[0] && pairTruth[1]) {
                        break;
                    }
                }
                if(pairTruth[0] && pairTruth[1]) {
                    break;
                }
            }
            if(!pairTruth[0] || !pairTruth[1]) {
                constraintsViolated++;
            }
        }
        for(int i = 0; i < y; i++) {
            boolean[] pairTruth = new boolean[2];
            for(int j = 0; j < g; j++) {
                pairTruth = new boolean[2];
                for(int k = 0; k < 3; k++) {
                    if (Objects.equals(difGroupPairs[i][0], groups[j][k])) {
                        pairTruth[0] = true;
                    }
                    if (Objects.equals(difGroupPairs[i][1], groups[j][k])) {
                        pairTruth[1] = true;
                    }
                }
                if(pairTruth[0] && pairTruth[1]) {
                    break;
                }
            }
            if(pairTruth[0] && pairTruth[1]) {
                constraintsViolated++;
            }
        }
        System.out.println(constraintsViolated);
    }
}