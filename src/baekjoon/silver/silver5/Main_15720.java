package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 15720 _ 카우버거

public class Main_15720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int price = 0, salePrice = 0;

        Integer[] B = new Integer[Integer.parseInt(st.nextToken())];
        Integer[] C = new Integer[Integer.parseInt(st.nextToken())];
        Integer[] D = new Integer[Integer.parseInt(st.nextToken())];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < B.length; i++)
            B[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C.length; i++)
            C[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < D.length; i++)
            D[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(B, Collections.reverseOrder());
        Arrays.sort(C, Collections.reverseOrder());
        Arrays.sort(D, Collections.reverseOrder());

        int idx = Math.min(B.length, Math.min(C.length, D.length));

        for (int i = 0; i < idx; i++) {
            int result = B[i] + C[i] + D[i];
            price += result;
            salePrice += (int) (result * 0.9);
        }

        if (B.length >= idx) {
            for (int i = idx; i < B.length; i++) {
                price += B[i];
                salePrice += B[i];
            }
        }

        if (C.length >= idx) {
            for (int i = idx; i < C.length; i++) {
                price += C[i];
                salePrice += C[i];
            }
        }

        if (D.length >= idx) {
            for (int i = idx; i < D.length; i++) {
                price += D[i];
                salePrice += D[i];
            }
        }

        sb.append(price).append("\n").append(salePrice);
        System.out.println(sb);

    }
}
