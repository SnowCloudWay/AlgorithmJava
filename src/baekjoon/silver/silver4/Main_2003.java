package baekjoon.silver.silver4;

import java.util.*;
import java.io.*;

// Silver IV _ 2003 _ 수들의 합 2

public class Main_2003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int intervalSum = 0;
        int end = 0;
        int cnt = 0;
        for (int start = 0; start < n; start++) {
            while (intervalSum < m && end < n) {
                intervalSum += nums[end];
                end += 1;
            }
            if (intervalSum == m) {
                cnt += 1;
            }
            intervalSum -= nums[start];
        }

        bw.write(Integer.toString(cnt));
        bw.flush();

    }

}
