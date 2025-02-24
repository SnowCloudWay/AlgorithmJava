package baekjoon.bronze.bronze3;

import java.io.*;
import java.util.*;

// Bronze III _ 28014 _ 첨탑 밀어서 부수기

public class Main_28014 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int h = 0;
        int left = 0;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            h = Integer.parseInt(st.nextToken());
            if (left <= h)
                cnt++;
            left = h;
        }

        System.out.println(cnt);

    }
}
