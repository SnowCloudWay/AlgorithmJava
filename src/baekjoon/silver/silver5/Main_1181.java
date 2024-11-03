package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 1181 _ 단어 정렬

public class Main_1181 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        ArrayList<String> wordList = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (!wordList.contains(word)) {
                wordList.add(word);
            }
        }

        wordList.sort(Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder()));

        for (String w : wordList) {
            sb.append(w).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();

    }

}
