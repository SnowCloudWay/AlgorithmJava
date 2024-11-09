package baekjoon.silver.silver2;

import java.util.*;
import java.io.*;

// Silver II _ 2075 _ N번째 큰 수

public class Main_2075 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        PriorityQueue<Long> pqLong = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                pqLong.add(Long.parseLong(st.nextToken()));
                if (pqLong.size() > n) pqLong.poll();
            }
        }

        bw.write(Long.toString(pqLong.poll()));
        bw.flush();

    }

}
