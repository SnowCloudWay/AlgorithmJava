package baekjoon.bronze.bronze5;

import java.io.*;

// Bronze V _ 25372 _ 성택이의 은밀한 비밀번호

public class Main_25372 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i =0; i < n; i++) {
            String num = br.readLine();
            if (num.length() >= 6 && num.length() <= 9)
                sb.append("yes").append("\n");
            else
                sb.append("no").append("\n");
        }
        System.out.println(sb);

    }
}
