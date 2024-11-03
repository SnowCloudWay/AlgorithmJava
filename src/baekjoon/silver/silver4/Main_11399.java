package baekjoon.silver.silver4;

import java.io.*;
import java.util.*;

// Silver IV _ 11399 _ ATM

public class Main_11399 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] times = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(times);

        int sumTime = 0;
        int totalTime = times[0];

        for (int i = 1; i < n; i++) {
            sumTime += times[i-1];
            totalTime += sumTime + times[i];
        }

        bw.write(Integer.toString(totalTime));
        bw.flush();

    }

}
