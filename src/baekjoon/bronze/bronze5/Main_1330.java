package baekjoon.bronze.bronze5;

import java.io.*;
import java.util.*;

// Bronze V _ 1330 _ 두 수 비교하기

public class Main_1330 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a > b) bw.write(">");
        else if (a < b) bw.write("<");
        else bw.write("==");

        bw.flush();

    }

}
