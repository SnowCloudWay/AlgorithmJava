package baekjoon.silver.silver4;

import java.util.*;
import java.io.*;

// Silver IV _ 9012 _ 괄호

public class Main_9012 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            Stack<String> stackStr = new Stack<>();
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    stackStr.push(String.valueOf(c));
                } else {
                    if (!stackStr.isEmpty() && stackStr.peek().equals("(")) {
                        stackStr.pop();
                    } else {
                        stackStr.push(String.valueOf(c));
                        break;
                    }
                }
            }

            if (stackStr.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }



        // 스택 X
//        for (int i = 0; i < t; i++) {
//            String s = br.readLine();
//            int cnt = 0;
//            for (int j = 0; j < s.length(); j++) {
//                char c = s.charAt(j);
//                if (c == '(') {
//                    ++cnt;
//                } else if (c == ')') {
//                    --cnt;
//                    if (cnt < 0) {
//                        break;
//                    }
//                }
//            }
//            if (cnt == 0) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }

    }

}
