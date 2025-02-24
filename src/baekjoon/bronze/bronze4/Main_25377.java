package baekjoon.bronze.bronze4;

import java.io.*;
import java.util.*;

// Bronze IV _ 25377 _ 빵

public class Main_25377 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int result = 1001;
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if (A <= B) {
                flag = false;
                result = Math.min(result, B);
            }
        }

        if (flag)
            System.out.println(-1);
        else
            System.out.println(result);

    }
}
