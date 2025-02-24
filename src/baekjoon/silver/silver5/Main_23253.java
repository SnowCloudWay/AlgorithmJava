package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 23253 _ 자료구조는 정말 최고야

public class Main_23253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 1;
        boolean flag = true;

        ArrayList<Stack<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            int k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            arr.add(new Stack<>());
            for (int j = 0; j < k; j++)
                arr.get(i).add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 1; i < N + 1; i++) {
            if (i != cnt) {
                flag = false;
                break;
            }
            for (int j = 0; j < M; j++) {
                if (!arr.get(j).isEmpty()) {
                    if (arr.get(j).peek() == cnt) {
                        arr.get(j).pop();
                        cnt++;
                        break;
                    }
                }
            }
        }

        if (flag)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
