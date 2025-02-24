package baekjoon.silver.silver2;

import java.io.*;
import java.util.*;

// Silver II _ 14713 _ 앵무새

public class Main_14713 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Queue<String>> queues = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++)
            queues.add(new LinkedList<>());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens())
                queues.get(i).offer(st.nextToken());
        }

        Queue<String> L = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens())
            L.offer(st.nextToken());

        while (!L.isEmpty()) {
            String word = L.peek();
            boolean find = false;
            for (int i = 0; i < n; i++) {
                if (word.equals(queues.get(i).peek())) {
                    L.poll();
                    queues.get(i).poll();
                    find = true;
                    break;
                }
            }
            if (!find)
                break;
        }

        boolean queIsEmpty = true;
        for (int i = 0; i < n; i++)
            if (!queues.get(i).isEmpty()) {
                queIsEmpty = false;
                break;
            }

        if (L.isEmpty() && queIsEmpty)
            System.out.println("Possible");
        else
            System.out.println("Impossible");

    }
}
