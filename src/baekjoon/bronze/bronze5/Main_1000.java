package baekjoon.bronze.bronze5;

import java.io.*;
import java.util.*;

// Bronze V _ 1000 _ A+B

public class Main_1000 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        bw.write(Integer.toString(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
        bw.flush();

    }

}
