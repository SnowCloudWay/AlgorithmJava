package baekjoon.bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Bronze IV _ 2845 _ 파티가 끝나고 난 뒤

public class Main_2845 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int m2 = L * P;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++)
            sb.append(Integer.parseInt(st.nextToken()) - m2).append(" ");

        System.out.println(sb);

    }
}
