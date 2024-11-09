package baekjoon.bronze.bronze3;

import java.io.*;

// Bronze III _ 10162 _ 전자레인지

public class Main_10162 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int a = 0, b = 0, c = 0;
        int t = Integer.parseInt(br.readLine());

        if (t >= 300) {
            a = t / 300;
            t %= 300;
        }
        if (t >= 60) {
            b = t / 60;
            t %= 60;
        }
        if (t >= 10) {
            c = t / 10;
            t %= 10;
        }

        if (t != 0) bw.write("-1");
        else {
            sb.append(a).append(" ").append(b).append(" ").append(c);
            bw.write(sb.toString());
        }

        bw.flush();

    }

}
