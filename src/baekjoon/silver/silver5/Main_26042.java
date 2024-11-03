package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 26042 _ 식당 입구 대기 줄

public class Main_26042 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Deque<Integer> dequeInt = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        int waitMax = 0;
        int lastStudent = n + 1;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            if (st.nextToken().equals("1")) {
                dequeInt.offer(Integer.parseInt(st.nextToken()));

                int waitNow = dequeInt.size();
                if (waitNow >= waitMax) {
                    int last = dequeInt.peekLast();
                    if (waitNow == waitMax) {
                        if (last < lastStudent) {
                            lastStudent = last;
                        }
                    } else {
                        waitMax = waitNow;
                        lastStudent = last;
                    }
                }
            } else {
                dequeInt.pollFirst();
            }
        }

        sb.append(waitMax).append(" ").append(lastStudent);
        bw.write(sb.toString());
        bw.flush();

    }
}
