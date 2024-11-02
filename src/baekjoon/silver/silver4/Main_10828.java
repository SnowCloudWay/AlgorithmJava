package baekjoon.silver.silver4;

import java.io.*;
import java.util.*;

// Silver IV _ 10828 _ 스택

public class Main_10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Stack<Integer> stackInt = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            switch (command) {
                case "push":
                    stackInt.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (!stackInt.empty()) bw.write(Integer.toString(stackInt.pop()) + '\n');
                    else bw.write("-1\n");
                    break;
                case "size":
                    bw.write(Integer.toString(stackInt.size()) + '\n');
                    break;
                case "empty":
                    if (stackInt.empty()) bw.write("1\n");
                    else bw.write("0\n");
                    break;
                case "top":
                    if (stackInt.empty()) bw.write("-1\n");
                    else bw.write(Integer.toString(stackInt.peek()) + '\n');
                    break;
                default:
                    break;
            }
        }

        bw.flush();

    }

}
