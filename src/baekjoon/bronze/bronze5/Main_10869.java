package baekjoon.bronze.bronze5;

import java.io.*;
import java.util.*;

// Bronze V _ 10869 _ 사칙연산

public class Main_10869 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        bw.write(Integer.toString(a + b)+'\n');
        bw.write(Integer.toString(a - b)+'\n');
        bw.write(Integer.toString(a * b)+'\n');
        bw.write(Integer.toString(a / b)+'\n');
        bw.write(Integer.toString(a % b)+'\n');

        bw.flush();

    }

}
