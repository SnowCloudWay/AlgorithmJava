package baekjoon.bronze.bronze5;

import java.io.*;
import java.util.*;

// Bronze V _ 1001 _ A-B

public class Main_1001 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        bw.write(Integer.toString(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken())));
        bw.flush();

    }

}
