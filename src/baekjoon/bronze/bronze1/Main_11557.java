package baekjoon.bronze.bronze1;

import java.util.*;
import java.io.*;

// Bronze I _ 11557 _ Yangjojang of The Year

public class Main_11557 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            String maxS = "";
            int maxL = 0;
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                String S = st.nextToken();
                int L = Integer.parseInt(st.nextToken());

                if (L > maxL) {
                    maxS = S;
                    maxL = L;
                }
            }
            sb.append(maxS).append("\n");
        }

        System.out.println(sb);
    }
}
