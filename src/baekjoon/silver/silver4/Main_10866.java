package baekjoon.silver.silver4;

import java.io.*;
import java.util.*;

// Silver IV _ 10866 _ 덱

public class Main_10866 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Deque<Integer> dequeInt = new ArrayDeque<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push_front":
                    dequeInt.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    dequeInt.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    if (dequeInt.isEmpty()) bw.write("-1\n");
                    else bw.write(Integer.toString(dequeInt.pollFirst()) + '\n');
                    break;
                case "pop_back":
                    if (dequeInt.isEmpty()) bw.write("-1\n");
                    else bw.write(Integer.toString(dequeInt.pollLast()) + '\n');
                    break;
                case "size":
                    bw.write(Integer.toString(dequeInt.size()) + '\n');
                    break;
                case "empty":
                    if (dequeInt.isEmpty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "front":
                    if (dequeInt.isEmpty()) bw.write("-1\n");
                    else bw.write(Integer.toString(dequeInt.peekFirst()) + '\n');
                    break;
                case "back":
                    if (dequeInt.isEmpty()) bw.write("-1\n");
                    else bw.write(Integer.toString(dequeInt.peekLast()) + '\n');
                    break;
            }
        }

        bw.flush();

    }

}
