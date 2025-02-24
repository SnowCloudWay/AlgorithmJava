package baekjoon.silver.silver2;

import java.io.*;
import java.util.*;

// Silver II _ 4963 _ 섬의 개수

public class Main_4963 {

    static int W, H;
    static int[][] matrix;
    static boolean[][] visited;

    static int[] dy = {-1, -1, -1, 1, 1, 1, 0, 0};
    static int[] dx = {-1, 0, 1, -1, 0, 1, -1, 1};

    static void dfs(int y, int x) {
        visited[y][x] = true;
        for (int i = 0; i < 8; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (0 <= ny && ny < H && 0 <= nx && nx < W) {
                if(!visited[ny][nx] && matrix[ny][nx] == 1)
                    dfs(ny, nx);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            W = Integer.parseInt(st.nextToken());
            H = Integer.parseInt(st.nextToken());
            if (W == 0 && H == 0) break;
            matrix = new int[H][W];
            visited = new boolean[H][W];
            int cnt = 0;

            for (int i = 0; i < H; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < W; j++) {
                    matrix[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (!visited[i][j] && matrix[i][j] == 1) {
                        dfs(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }


    }

}
