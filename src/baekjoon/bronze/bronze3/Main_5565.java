package baekjoon.bronze.bronze3;

import java.io.*;

// Bronze III _ 5565 _ 영수증

public class Main_5565 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int price = Integer.parseInt(br.readLine());
        for (int i = 0; i < 9; i++)
            price -= Integer.parseInt(br.readLine());

        System.out.println(price);

    }
}
