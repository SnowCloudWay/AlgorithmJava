package baekjoon.silver.silver1;

import java.util.*;
import java.io.*;

// Silver I _ 15903 _ 카드 합체 놀이

public class Main_15903 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long totalSum = 0;

        PriorityQueue<Long> pq = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            pq.add(Long.parseLong(st.nextToken()));
        }

        for (int i = 0; i < m; i++) {
            long a = pq.poll();
            long b = pq.poll();
            long c = a + b;
            pq.add(c);
            pq.add(c);
        }

        for (long num : pq) {
            totalSum += num;
        }

        bw.write(String.valueOf(totalSum));
        bw.flush();

    }

}
