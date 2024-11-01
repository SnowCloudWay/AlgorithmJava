package baekjoon.bronze.bronze5;

import java.io.*;
import java.util.*;

// Bronze V _ 1008 _ A/B

public class Main_1008 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        bw.write(Double.toString(Double.parseDouble(st.nextToken()) / Double.parseDouble(st.nextToken())));
        bw.flush();

    }

}
