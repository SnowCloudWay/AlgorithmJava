package baekjoon.silver.silver1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

// Silver I _ 2667 _ 단지번호붙이기

public class Main_2667 {

    static int N;
    static int[][] matrix;
    static boolean[][] visited;

    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> result = new ArrayList<>();

        N = Integer.parseInt(br.readLine());
        matrix = new int[N][N];
        visited = new boolean[N][N];
        int totalCnt = 0;
        int cnt;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++)
                matrix[i][j] = s.charAt(j) - '0';
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j] && matrix[i][j] == 1) {
                    totalCnt++;
                    cnt = dfs(i, j);
                    result.add(cnt);
                }
            }
        }

        Collections.sort(result);
        for (int num : result)
            sb.append(num).append("\n");

        System.out.println(totalCnt);
        System.out.print(sb);
    }

    static int dfs(int y, int x) {
        int cnt = 1;
        visited[y][x] = true;
        for (int i = 0; i < 4; i++) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if (0 <= ny && ny < N && 0 <= nx && nx < N) {
                if (!visited[ny][nx] && matrix[ny][nx] == 1) {
                    cnt += dfs(ny, nx);
                }
            }
        }
        return cnt;
    }

}
