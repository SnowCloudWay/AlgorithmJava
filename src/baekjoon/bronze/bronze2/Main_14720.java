package baekjoon.bronze.bronze2;

import java.io.*;
import java.util.*;

// Bronze II _ 14720 _ 우유 축제

public class Main_14720 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int cnt = 0, last = 2;

        for (int i = 0; i < n; i++) {
            int now = Integer.parseInt(st.nextToken());
            if (last == 2 && now == 0) {
                cnt++;
                last = 0;
            } else if (last == 0 && now == 1) {
                cnt++;
                last = 1;
            } else if (last == 1 && now == 2) {
                cnt++;
                last = 2;
            }
        }


        System.out.println(cnt);

    }
}
