package baekjoon.silver.silver4;

import java.util.*;
import java.io.*;

// Silver IV _ 10546 _ 배부른 마라토너

public class Main_10546 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (map.containsKey(name))
                map.put(name, map.get(name) + 1);
            else
                map.put(name, 1);
        }

        for (int i = 0; i < n-1; i++) {
            String name = br.readLine();
            map.put(name, map.get(name) - 1);
            if (map.get(name) == 0)
                map.remove(name);
        }

        sb.append(map.keySet().iterator().next());
        System.out.println(sb);

    }
}
