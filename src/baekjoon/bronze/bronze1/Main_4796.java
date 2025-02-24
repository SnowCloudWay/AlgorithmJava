package baekjoon.bronze.bronze1;

import java.util.*;
import java.io.*;

// Bronze I _ 4796 _ 캠핑

public class Main_4796 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;
        int caseIdx = 1;

        while (true) {
            st = new StringTokenizer(br.readLine());
            sb = new StringBuilder();
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int day = 0;

            if (l == 0 && p == 0 && v == 0)
                break;

            while (true) {
                if (p <= v) {
                    day += l;
                    v -= p;
                }
                else {
                    if (l >= v)
                        day += v;
                    else
                        day += l;
                    break;
                }
            }

            sb.append("Case ").append(caseIdx).append(": ").append(day);
            caseIdx++;
            System.out.println(sb);

        }

    }
}
