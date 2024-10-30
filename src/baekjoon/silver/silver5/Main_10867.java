package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 10867 _ 중복 빼고 정렬하기

public class Main_10867 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        TreeSet<Integer> set = new TreeSet<>(nums);

        for (Integer num : set) {
            bw.write(num + " ");
        }

        bw.flush();

    }

}
