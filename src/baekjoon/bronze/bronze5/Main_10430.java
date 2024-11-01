package baekjoon.bronze.bronze5;

import java.io.*;
import java.util.*;

// Bronze V _ 10430 _ 나머지

public class Main_10430 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        bw.write(Integer.toString((a + b) % c) + '\n');
        bw.write(Integer.toString(((a % c) + (b % c)) % c) + '\n');
        bw.write(Integer.toString((a * b) % c) + '\n');
        bw.write(Integer.toString(((a % c) * (b % c)) % c) + '\n');

        bw.flush();

    }

}
