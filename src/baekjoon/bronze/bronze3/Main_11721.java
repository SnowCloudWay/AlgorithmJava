package baekjoon.bronze.bronze3;

import java.io.*;

// Bronze III _ 11721 _ 열 개씩 끊어 출력하기

public class Main_11721 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        for (int i = 0; i < s.length(); i += 10) {
            int end = Math.min(i + 10, s.length());
            sb.append(s.substring(i, end)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

    }

}
