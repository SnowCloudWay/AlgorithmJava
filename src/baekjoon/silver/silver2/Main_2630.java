package baekjoon.silver.silver2;

import java.util.*;
import java.io.*;

// Silver II _ 2630 _ 색종이 만들기

public class Main_2630 {

    static int white = 0;
    static int blue = 0;

    public static void solution(int x, int y, int n, int[][] paper) {
        int color = paper[x][y];
        for (int i = x; i < x+n; i++) {
            for (int j = y; j < y+n; j++) {
                if (color != paper[i][j]) {
                    solution(x, y, n/2, paper);
                    solution(x, y+n/2, n/2, paper);
                    solution(x+n/2, y, n/2, paper);
                    solution(x+n/2, y+n/2, n/2, paper);
                    return;
                }
            }
        }
        if (color == 0) white += 1;
        else blue += 1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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

        System.out.println(white);
        System.out.println(blue);

    }

}
