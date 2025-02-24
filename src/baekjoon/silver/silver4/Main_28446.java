package baekjoon.silver.silver4;

import java.io.*;
import java.util.*;

// Silver IV _ 28446 _ 볼링공 찾아주기

public class Main_28446 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        HashMap<Long, Integer> map = new HashMap<>();

        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            if (Integer.parseInt(st.nextToken()) == 1) {
                int x = Integer.parseInt(st.nextToken());
                long w = Long.parseLong(st.nextToken());
                map.put(w, x);
            } else {
                int key = map.get(Long.parseLong(st.nextToken()));
                sb.append(key).append("\n");
            }
        }

        System.out.println(sb);

    }


}
