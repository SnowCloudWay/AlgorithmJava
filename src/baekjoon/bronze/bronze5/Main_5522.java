package baekjoon.bronze.bronze5;

import java.io.*;

// Bronze V _ 5522 _ 카드 게임

public class Main_5522 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;
        for (int i = 0; i < 5; i++)
            result += Integer.parseInt(br.readLine());

        System.out.println(result);

    }
}
