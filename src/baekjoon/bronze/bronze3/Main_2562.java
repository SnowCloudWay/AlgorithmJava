package baekjoon.bronze.bronze3;

import java.io.*;

// Bronze III _ 2562 _ 최댓값

public class Main_2562 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int maxNum = 0;
        int maxNumIndex = 0;

        for (int i = 1; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > maxNum) {
                maxNum = num;
                maxNumIndex = i;
            }
        }

        bw.write(maxNum + "\n");
        bw.write(Integer.toString(maxNumIndex));
        bw.flush();

    }

}
