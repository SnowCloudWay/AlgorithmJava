package baekjoon.silver.silver2;

import java.io.*;
import java.util.*;

// Silver II _ 24447 _ 알고리즘 수업 - 너비 우선 탐색 4

public class Main_24447 {
    static int N, M, R, cnt;
    static int[] visited, depth;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long result = 0;

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        depth = new int[N+1];

        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
            depth[i] = -1;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        for (int i = 0; i <= N; i++)
            Collections.sort(graph.get(i));

        visited = new int[N+1];
        cnt = 1;
        bfs(R);

        for (int i = 1; i < visited.length; i++)
            result += ((long) visited[i] * depth[i]);

        sb.append(result);

        System.out.println(sb);

    }

    static void bfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        visited[s] = cnt;
        depth[s] = 0;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int w : graph.get(v)) {
                if (depth[w] == -1) {
                    queue.offer(w);
                    cnt++;
                    visited[w] = cnt;
                    depth[w] = depth[v] + 1;
                }
            }
        }
    }
}
