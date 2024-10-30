package baekjoon.silver.silver3;

import java.util.*;
import java.io.*;

// Silver III _ 2559 _ 수열

public class Main_2559 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        ArrayList<Integer> sumList = new ArrayList<>();
        sumList.add(Arrays.stream(Arrays.copyOfRange(nums, 0, k)).sum());

        for (int i = 0; i < n - k; i++) {
            int intervalSum = sumList.get(i) - nums[i] + nums[i + k];
            sumList.add(intervalSum);
        }

        bw.write(Integer.toString(Collections.max(sumList)));
        bw.flush();

    }

}
