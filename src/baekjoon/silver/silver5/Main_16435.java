package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 16435 _ 스네이크버드

public class Main_16435 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> h = new ArrayList<>();
        for (int i = 0; i < n; i++) h.add(Integer.parseInt(st.nextToken()));
        Collections.sort(h);

        for (int hh : h) {
            if (l >= hh) l += 1;
            else break;
        }

        System.out.println(l);

    }

}
