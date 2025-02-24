package baekjoon.bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

// Bronze III _ 2455 _ 지능형 기차

public class Main_2455 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int nowPeople = 0, maxPeople = 0;
        for (int i = 0; i < 4; i++) {
            st = new StringTokenizer(br.readLine());
            nowPeople -= Integer.parseInt(st.nextToken());
            nowPeople += Integer.parseInt(st.nextToken());
            if (maxPeople < nowPeople)
                maxPeople = nowPeople;
        }

        System.out.println(maxPeople);

    }
}
