package baekjoon.bronze.bronze5;

import java.io.*;
import java.util.*;

// Bronze V _ 11382 _ 꼬마 정민

public class Main_11382 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Long a = Long.parseLong(st.nextToken());
        Long b = Long.parseLong(st.nextToken());
        Long c = Long.parseLong(st.nextToken());

        bw.write(Long.toString(a + b + c));

        bw.flush();

    }

}
