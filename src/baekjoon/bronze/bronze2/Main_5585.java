package baekjoon.bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Bronze II _ 5585 _ 거스름돈

public class Main_5585 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;
        int money = Integer.parseInt(br.readLine());
        money = 1000 - money;

        if (money >= 500) {
            cnt += money / 500;
            money %= 500;
        }
        if (money >= 100) {
            cnt += money / 100;
            money %= 100;
        }
        if (money >= 50) {
            cnt += money / 50;
            money %= 50;
        }
        if (money >= 10) {
            cnt += money / 10;
            money %= 10;
        }
        if (money >= 5) {
            cnt += money / 5;
            money %= 5;
        }
        cnt += money;

        System.out.println(cnt);

    }
}
