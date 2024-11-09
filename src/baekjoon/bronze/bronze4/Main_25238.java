package baekjoon.bronze.bronze4;

import java.io.*;
import java.util.*;

// Bronze IV _ 25238 _ 가희와 방어율 무시

public class Main_25238 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        System.out.println(a - ((a * b) / 100) >= 100 ? "0" : "1");


    }

}
