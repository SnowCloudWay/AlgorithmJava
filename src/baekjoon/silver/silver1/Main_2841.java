package baekjoon.silver.silver1;

import java.util.*;
import java.io.*;

// Silver I _ 2841 _ 외계인의 기타 연주

public class Main_2841 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        Stack<Stack<Integer>> sInt = new Stack<>();
        for (int i = 0; i < 6; i++)
            sInt.add(new Stack<>());

        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            --a;
            if (sInt.get(a).isEmpty() || sInt.get(a).peek() < b) {
                sInt.get(a).push(b);
                cnt++;
            } else if (sInt.get(a).peek() > b) {
                while (true) {
                    if (sInt.get(a).isEmpty() || sInt.get(a).peek() <= b)
                        break;
                    sInt.get(a).pop();
                    cnt++;
                }
                if (sInt.get(a).isEmpty() || sInt.get(a).peek() < b) {
                    sInt.get(a).push(b);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}
