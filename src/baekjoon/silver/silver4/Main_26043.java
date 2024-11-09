package baekjoon.silver.silver4;

import java.util.*;
import java.io.*;

// Silver IV _ 26043 _ 식당 메뉴

public class Main_26043 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Deque<ArrayList<Integer>> dq = new ArrayDeque<>();
        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();
        ArrayList<Integer> cList = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            if (Integer.parseInt(st.nextToken()) == 1) {
                ArrayList<Integer> listInt = new ArrayList<>();
                for (int j = 0; j < 2; j++) listInt.add(Integer.parseInt(st.nextToken()));
                dq.add(listInt);
            } else {
                ArrayList<Integer> listInt = dq.pollFirst();
                int menu = Integer.parseInt(st.nextToken());
                if (menu == listInt.get(1)) aList.add(listInt.get(0));
                else bList.add(listInt.get(0));
            }
        }

        if (aList.isEmpty()) sb.append("None");
        else {
            Collections.sort(aList);
            for (int num : aList) {
                sb.append(num).append(" ");
            }
        }
        sb.append("\n");

        if (bList.isEmpty()) sb.append("None");
        else {
            Collections.sort(bList);
            for (int num : bList) {
                sb.append(num).append(" ");
            }
        }
        sb.append("\n");

        if (dq.isEmpty()) sb.append("None");
        else {
            while (!dq.isEmpty()) {
                ArrayList<Integer> listInt = dq.pollLast();
                cList.add(listInt.get(0));
            }
            Collections.sort(cList);
            for (int num : cList) {
                sb.append(num).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();

    }

}
