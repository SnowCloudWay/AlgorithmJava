package baekjoon.bronze.bronze5;

import java.io.*;
import java.util.*;

// Bronze V _ 10871 _ X보다 작은 수

public class Main_10871 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num < x) {
                sb.append(num).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();

    }

}
