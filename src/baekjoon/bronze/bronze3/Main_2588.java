package baekjoon.bronze.bronze3;

import java.io.*;

// Bronze III _ 2588 _ 곱셈

public class Main_2588 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        int b100 = b / 100;
        int b10 = b % 100 / 10;
        int b1 = b % 10;

        bw.write(Integer.toString(a * b1) + '\n');
        bw.write(Integer.toString(a * b10) + '\n');
        bw.write(Integer.toString(a * b100) + '\n');
        bw.write(Integer.toString(a * b));

        bw.flush();

    }

}
