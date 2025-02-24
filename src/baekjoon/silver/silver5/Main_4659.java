package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 4659 _ 비밀번호 발음하기

public class Main_4659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            String pw = br.readLine();

            if (pw.equals("end"))
                break;

            char prev = '0';
            int cnt = 0;
            boolean flag = false;

            for (char c : pw.toCharArray()) {
                if (isVowel(c))
                    flag = true;

                if (isVowel(c) != isVowel(prev))
                    cnt = 1;
                else
                    cnt++;

                if (cnt >= 3 || prev == c && (c != 'e' && c != 'o')) {
                    flag = false;
                    break;
                }

                prev = c;
            }

            sb.append("<").append(pw);
            if (flag)
                sb.append("> is acceptable.\n");
            else
                sb.append("> is not acceptable.\n");

        }
        System.out.println(sb);
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u';
    }

}
