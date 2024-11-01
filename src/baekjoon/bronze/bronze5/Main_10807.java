package baekjoon.bronze.bronze5;

import java.io.*;
import java.util.*;

// Bronze V _ 10807 _ 개수 세기

public class Main_10807 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        int findNum = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == findNum) {
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));
        bw.flush();

    }

}
