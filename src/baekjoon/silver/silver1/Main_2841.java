package baekjoon.silver.silver1;

import java.util.*;
import java.io.*;

// Silver I _ 2841 _ 외계인의 기타 연주

public class Main_2841 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++)
            arr.add(new ArrayList<>());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            a -= 1;

        }

    }

}
