package baekjoon.silver.silver2;

import java.io.*;
import java.util.*;

// Silver II _ 24444 _ 알고리즘 수업 - 너비 우선 탐색 1

public class Main_24444 {

    static int N, M, R;
    static int cnt;
    static int[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++)
            graph.add(new ArrayList<>());

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
            sb.append(visited[i]).append("\n");

        System.out.println(sb);
    }

    static void bfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        visited[s] = cnt;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            for (int w : graph.get(v)) {
                if (visited[w] == 0) {
                    queue.offer(w);
                    cnt++;
                    visited[w] = cnt;
                }
            }
        }
    }

}
