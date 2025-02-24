package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 5800 _ 성적 통계

public class Main_5800 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int k = Integer.parseInt(br.readLine());
        for (int i = 1; i < k+1; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            for (int j = 0; j < n; j++)
                list.add(Integer.parseInt(st.nextToken()));
            list.sort(Collections.reverseOrder());

            int largestGap = 0;
            for (int l = 0; l < n-1; l++) {
                int gap = list.get(l) - list.get(l+1);
                if(largestGap < gap)
                    largestGap = gap;
            }

            sb.append("Class ").append(i).append('\n');
            sb.append("Max ").append(Collections.max(list)).append(", ");
            sb.append("Min ").append(Collections.min(list)).append(", ");
            sb.append("Largest gap ").append(largestGap);
            System.out.println(sb);
        }

    }
}
