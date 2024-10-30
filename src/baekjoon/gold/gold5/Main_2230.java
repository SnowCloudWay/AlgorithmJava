package baekjoon.gold.gold5;

import java.io.*;
import java.util.*;

// Gold V _ 2230 _ 수 고르기

public class Main_2230 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(nums);

        int answer = Collections.max(nums) - Collections.min(nums);
        int start = 0;
        int end = 0;

        while (start < n - 1) {
            int result = nums.get(end) - nums.get(start);
            if (result >= m) {
                if (answer > result) {
                    answer = result;
                }
                start++;
            } else {
                if (end < n - 1) {
                    end++;
                } else {
                    start++;
                }
            }
        }

        bw.write(Integer.toString(answer));
        bw.flush();

    }

}
