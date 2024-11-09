package baekjoon.gold.gold4;

import java.io.*;
import java.util.*;

// Gold IV _ 1715 _ 카드 정렬하기

public class Main_1715 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> pqInt = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) pqInt.add(Integer.parseInt(br.readLine()));
        int cnt = 0;

        while (pqInt.size() != 1) {
            int res = pqInt.poll() + pqInt.poll();
            pqInt.add(res);
            cnt += res;
        }

        bw.write(Integer.toString(cnt));
        bw.flush();

    }

}
