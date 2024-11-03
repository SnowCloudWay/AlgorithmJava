package baekjoon.bronze.bronze2;

import java.util.*;
import java.io.*;

// Bronze II _ 2908 _ 상수

public class Main_2908 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = new StringBuilder(st.nextToken()).reverse().toString();
        String b = new StringBuilder(st.nextToken()).reverse().toString();
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);

        if (aInt > bInt) bw.write(Integer.toString(aInt));
        else bw.write(Integer.toString(bInt));

        bw.flush();

    }

}
