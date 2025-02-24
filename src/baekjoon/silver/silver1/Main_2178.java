package baekjoon.silver.silver1;

import java.util.*;
import java.io.*;

// Silver I _ 2178 _ 미로 탐색

public class Main_2178 {

    static int N, M;
    static int[][] matrix, distance;

    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        matrix = new int[N][M];
        distance = new int[N][M];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                matrix[i][j] = s.charAt(j) - '0';
            }
        }

        bfs(0, 0);
        System.out.println(distance[N-1][M-1]);

    }

    static void bfs(int startY, int startX) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startY, startX});
        distance[startY][startX] = 1;
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];
                if (0 <= ny && ny < N && 0 <= nx && nx < M) {
                    if (matrix[ny][nx] == 1 && distance[ny][nx] == 0) {
                        queue.offer(new int[]{ny, nx});
                        distance[ny][nx] = distance[y][x] + 1;
                    }
                }
            }
        }
    }

}
