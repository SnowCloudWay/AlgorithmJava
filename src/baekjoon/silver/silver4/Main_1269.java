package baekjoon.silver.silver4;

import java.util.*;
import java.io.*;

// Silver IV _ 1269 _ 대칭 차집합

public class Main_1269 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) set1.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) set2.add(Integer.parseInt(st.nextToken()));

        Set<Integer> diff1 = new HashSet<>(set1);
        Set<Integer> diff2 = new HashSet<>(set2);
        diff1.removeAll(set2);
        diff2.removeAll(set1);

        System.out.println(diff1.size() + diff2.size());

    }

}
