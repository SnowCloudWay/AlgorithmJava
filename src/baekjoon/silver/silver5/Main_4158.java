package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 4158 _ CD

public class Main_4158 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) break;

            HashMap<Integer, Integer> cdMap = new HashMap<>();
            int cnt = 0;

            for (int i = 0; i < n+m; i++) {
                int cd = Integer.parseInt(br.readLine());
                cdMap.put(cd, cdMap.getOrDefault(cd, 0) + 1);
            }

            for (int key : cdMap.keySet()) {
                int value = cdMap.get(key);
                if (value == 2) cnt++;
            }

            bw.write(Integer.toString(cnt)+'\n');
            bw.flush();
        }


    }

}
