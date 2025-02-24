package baekjoon.silver.silver3;

import java.util.*;
import java.io.*;

// Silver III _ 14235 _ 크리스마스 선물

public class Main_14235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                if (pq.peek() == null)
                    sb.append(-1);
                else
                    sb.append(pq.poll());
                sb.append("\n");
            } else {
                for (int j = 0; j < num; j++) {
                    pq.offer(Integer.parseInt(st.nextToken()));
                }
            }
        }
        System.out.println(sb);
    }
}
