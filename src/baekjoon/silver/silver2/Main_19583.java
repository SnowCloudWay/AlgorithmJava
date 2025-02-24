package baekjoon.silver.silver2;

import java.io.*;
import java.util.*;

// Silver II _ 19583 _ 싸이버개강총회

public class Main_19583 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashMap<String, Integer> map = new HashMap<>();
        int cnt = 0;

        st = new StringTokenizer(br.readLine());

        String[] times = st.nextToken().split(":");
        int[] S = new int[2];
        for (int i = 0; i < 2; i++)
            S[i] = Integer.parseInt(times[i]);

        times = st.nextToken().split(":");
        int[] E = new int[2];
        for (int i = 0; i < 2; i++)
            E[i] = Integer.parseInt(times[i]);

        times = st.nextToken().split(":");
        int[] Q = new int[2];
        for (int i = 0; i < 2; i++)
            Q[i] = Integer.parseInt(times[i]);

        String line = "", name = "";
        int h = 0, m = 0;
        while ((line = br.readLine()) != null && !(line.isEmpty())) {
            st = new StringTokenizer(line);
            times = st.nextToken().split(":");
            h = Integer.parseInt(times[0]);
            m = Integer.parseInt(times[1]);
            name = st.nextToken();
            if (!map.containsKey(name)) {
                if (S[0] == h && S[1] >= m || S[0] > h) {
                    map.put(name, 0);
                }
            } else {
                if ((E[0] < h || E[0] == h && E[1] <= m) && (Q[0] > h || Q[0] == h && Q[1] >= m)) {
                    if (map.get(name) == 0) {
                        map.put(name, 1);
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);

    }
}
