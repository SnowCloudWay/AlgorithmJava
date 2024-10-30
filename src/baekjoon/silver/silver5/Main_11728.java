package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 11728 _ 배열 합치기

public class Main_11728 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] num1 = new int[n];
        int[] num2 = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine()); 
        for (int i = 0; i < m; i++) {
            num2[i] = Integer.parseInt(st.nextToken());
        }

        int idx1 = 0;
        int idx2 = 0;
        ArrayList<Integer> nums = new ArrayList<>();
        while (idx1 < n && idx2 < m) {
            if (num1[idx1] <= num2[idx2]) {
                nums.add(num1[idx1++]);
            } else {
                nums.add(num2[idx2++]);
            }
        }
        while (idx1 < n) {
            nums.add(num1[idx1++]);
        }
        while (idx2 < m) {
            nums.add(num2[idx2++]);
        }

        for (int num : nums) {
            bw.write(num + " ");
        }
        bw.flush();

    }

}
