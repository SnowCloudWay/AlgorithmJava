package baekjoon.silver.silver4;

import java.util.*;
import java.io.*;

// Silver IV _ 1822 _ 차집합

public class Main_1822 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        TreeSet<Integer> setA = new TreeSet<>();
        TreeSet<Integer> setB = new TreeSet<>();

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++)
            setA.add(Integer.parseInt(st.nextToken()));

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++)
            setB.add(Integer.parseInt(st.nextToken()));

        setA.removeAll(setB);

        sb.append(setA.size()).append("\n");
        for (int s : setA) {
            sb.append(s).append(" ");
        }

        System.out.print(sb);

    }
}
