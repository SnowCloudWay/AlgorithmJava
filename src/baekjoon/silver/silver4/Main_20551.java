package baekjoon.silver.silver4;

import java.util.*;
import java.io.*;

// Silver IV _ 20551 _ Sort 마스터 배지훈의 후계자

public class Main_20551 {

    static int bs_left(int target, int[] data) {
        int low = 0;
        int high = data.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (data[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (data[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(b);

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(br.readLine());
            System.out.println(bs_left(num, b));
        }

    }

}
