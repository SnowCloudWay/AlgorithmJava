package baekjoon.silver.silver2;

import java.util.*;
import java.io.*;

// Silver II _ 2160 _ DFS와 BFS

public class Main_1260 {

    static int N, M, S;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        for (int i = 0; i <= N; i++)
            graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }

        for (int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        visited = new boolean[N+1];
        dfs(S);

        sb.append("\n");

        visited = new boolean[N+1];
        bfs(S);
        System.out.println(sb);

    }

    static void dfs(int v) {
        visited[v] = true;
        sb.append(v).append(" ");
        for (int w : graph.get(v)) {
            if (!visited[w])
                dfs(w);
        }
    }

    static void bfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(s);
        visited[s] = true;
        while (!queue.isEmpty()) {
            int v = queue.poll();
            sb.append(v).append(" ");
            for (int w : graph.get(v)) {
                if (!visited[w]) {
                    queue.offer(w);
                    visited[w] = true;
                }
            }
        }
    }

}
