package baekjoon.bronze.bronze3;

import java.io.*;

// Bronze III _ 5597 _ 과제 안 내신 분..?

public class Main_5597 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[30];

        for (int i = 0; i < 28; i++) {
            int num = Integer.valueOf(br.readLine());
            arr[num - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (arr[i] != 1) {
                System.out.println(i + 1);
            }
        }

    }

}
