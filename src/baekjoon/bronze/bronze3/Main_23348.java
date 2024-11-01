package baekjoon.bronze.bronze3;

import java.io.*;
import java.util.*;

// Bronze III _ 23348 _ 스트릿 코딩 파이터

public class Main_23348 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());

        int maxScore = 0;
        for (int i = 0; i < n; i++) {
            int sumScore = 0;
            for (int j = 0; j < 3; j++) {
                st = new StringTokenizer(br.readLine());
                int aa = Integer.parseInt(st.nextToken());
                int bb = Integer.parseInt(st.nextToken());
                int cc = Integer.parseInt(st.nextToken());
                sumScore += (a * aa) + (b * bb) + (c * cc);
            }
            if (sumScore > maxScore) {
                maxScore = sumScore;
            }
        }

        bw.write(Integer.toString(maxScore));
        bw.flush();

    }

}
