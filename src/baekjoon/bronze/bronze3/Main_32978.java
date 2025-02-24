package baekjoon.bronze.bronze3;

import java.io.*;
import java.util.*;

// Bronze III _ 32978 _ 아 맞다 마늘

public class Main_32978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        HashMap<String, Integer> dict = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            dict.put(st.nextToken(), 0);

        st = new StringTokenizer(br.readLine());
        String str = "";
        for (int i = 0; i < N - 1; i++) {
            str = st.nextToken();
            dict.put(str, dict.get(str) + 1);
        }

        for (Map.Entry<String, Integer> entry : dict.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
