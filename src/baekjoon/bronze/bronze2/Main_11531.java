package baekjoon.bronze.bronze2;

import java.util.*;
import java.io.*;

// Bronze II _ 11531 _ ACM 대회 채점

public class Main_11531 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashMap<String, Integer> map = new HashMap<>();
        int sp = 0, penalty = 0;

        while(true) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            if (m == -1)
                break;
            String problem = st.nextToken();
            if (st.nextToken().equals("wrong")) {
                if (map.containsKey(problem))
                    map.put(problem, map.get(problem) + 1);
                else
                    map.put(problem, 1);
            } else {
                if (map.containsKey(problem))
                    penalty += 20 * map.get(problem);
                penalty += m;
                sp++;
            }
        }

        System.out.printf("%d %d", sp, penalty);

    }
}
