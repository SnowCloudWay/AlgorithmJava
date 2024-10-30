package baekjoon.bronze.bronze1;

import java.util.*;
import java.io.*;

// Bronze I _ 2851 _ 슈퍼 마리오

public class Main_2851 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(Integer.parseInt(br.readLine()));

        for (int i = 1; i < 10; i++) {
            prefixSum.add(prefixSum.get(i-1) + Integer.parseInt(br.readLine()));
            if (prefixSum.get(i) >= 100) break;
        }

        if (prefixSum.get(prefixSum.size() - 1) == 100) bw.write("100");
        else {
            if (100 - prefixSum.get(prefixSum.size() - 2) >= prefixSum.get(prefixSum.size() - 1) - 100) {
                bw.write(Integer.toString(prefixSum.get(prefixSum.size() - 1)));
            } else {
                bw.write(Integer.toString(prefixSum.get(prefixSum.size() - 2)));
            }
        }

        bw.flush();

    }

}
