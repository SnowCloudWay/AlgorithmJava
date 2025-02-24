package baekjoon.bronze.bronze3;

import java.io.*;
import java.util.*;

// Bronze III _ 14215 _ 세 막대

public class Main_14215 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(nums);

        if (nums[0] + nums[1] <= nums[2])
            nums[2] = nums[0] + nums[1] - 1;

        sb.append(nums[0] + nums[1] + nums[2]);
        System.out.println(sb);

    }
}
