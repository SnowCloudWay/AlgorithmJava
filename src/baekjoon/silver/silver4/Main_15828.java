package baekjoon.silver.silver4;

import java.util.*;
import java.io.*;

// Silver IV _ 15828 _ Router

public class Main_15828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> dqInt = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) break;
            if (num != 0) {
                if (dqInt.size() < n) dqInt.offer(num);
            } else {
                dqInt.pollFirst();
            }
        }

        if (dqInt.isEmpty()) sb.append("empty");
        else {
            while (!dqInt.isEmpty()) {
                sb.append(dqInt.pollFirst()).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();

    }

}
