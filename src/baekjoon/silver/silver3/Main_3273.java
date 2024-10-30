package baekjoon.silver.silver3;

import java.util.*;
import java.io.*;

// Silver III _ 3273 _ 두 수의 합

public class Main_3273 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);

        int x = Integer.parseInt(br.readLine());

        int start = 0;
        int end = n - 1;
        int cnt = 0;

        while (start < end) {
            int sum = nums[start] + nums[end];

            if (sum == x) {
                cnt++;
                start++;
            } else if (sum < x) {
                start++;
            } else {
                end--;
            }
        }

        bw.write(Integer.toString(cnt));
        bw.flush();

    }

}
