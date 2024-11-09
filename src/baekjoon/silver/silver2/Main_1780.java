package baekjoon.silver.silver2;

import java.util.*;
import java.io.*;

// Silver II _ 1780 _ 종이의 개수

public class Main_1780 {

    static int a = 0;
    static int b = 0;
    static int c = 0;

    public static void solution(int x, int y, int n, int[][] paper) {
        int num = paper[x][y];
        for (int i = x; i < x+n; i++) {
            for (int j = y; j < y+n; j++) {
                if (num != paper[i][j]) {
                    solution(x, y, n/3, paper);
                    solution(x, y+n/3, n/3, paper);
                    solution(x, y+2*n/3, n/3, paper);
                    solution(x+n/3, y, n/3, paper);
                    solution(x+n/3, y+n/3, n/3, paper);
                    solution(x+n/3, y+2*n/3, n/3, paper);
                    solution(x+2*n/3, y, n/3, paper);
                    solution(x+2*n/3, y+n/3, n/3, paper);
                    solution(x+2*n/3, y+2*n/3, n/3, paper);
                    return;
                }
            }
        }
        if (num == -1) a += 1;
        else if (num == 0) b += 1;
        else c += 1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] paper = new int[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solution(0, 0, n, paper);
        sb.append(a).append("\n").append(b).append("\n").append(c);
        System.out.println(sb);

    }

}
