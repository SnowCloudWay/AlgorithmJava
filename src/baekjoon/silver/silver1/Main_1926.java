package baekjoon.silver.silver1;

import java.util.*;
import java.io.*;

// Silver I _ 1926 _ 그림

public class Main_1926 {

    static int H, W;
    static int[][] matrix;
    static boolean[][] visited;

    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        H = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        matrix = new int[H][W];
        visited = new boolean[H][W];
        int totalCnt = 0;
        int maxCnt = 0;
        int cnt;

        for (int i = 0; i < H; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < W; j++)
                matrix[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (!visited[i][j] && matrix[i][j] == 1) {
                    totalCnt++;
                    cnt = dfs(i, j);
                    maxCnt = Math.max(maxCnt, cnt);
                }
            }
        }

        sb.append(totalCnt).append("\n").append(maxCnt);

        System.out.print(sb);

    }

    static int dfs(int y, int x) {
        int cnt = 1;
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (0 <= ny && ny < H && 0 <= nx && nx < W) {
                if (!visited[ny][nx] && matrix[ny][nx] == 1) {
                    cnt += dfs(ny, nx);
                }
            }
        }
        return cnt;
    }
}
