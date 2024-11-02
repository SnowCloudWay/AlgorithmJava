package baekjoon.bronze.bronze4;

import java.io.*;

// Bronze IV _ 9316 _ Hello Judge

public class Main_9316 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            bw.write(String.format("Hello World, Judge %d!\n", i));
        }

        bw.flush();

    }

}
