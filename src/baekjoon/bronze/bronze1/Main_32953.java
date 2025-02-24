package baekjoon.bronze.bronze1;

import java.util.*;
import java.io.*;

// Bronze I _ 32953 _ 회상

public class Main_32953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashMap<String, Integer> map = new HashMap<>();
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                String number = st.nextToken();
                if (map.containsKey(number))
                    map.put(number, map.get(number) + 1);
                else
                    map.put(number, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= M)
                cnt++;
        }

        System.out.println(cnt);

    }
}
