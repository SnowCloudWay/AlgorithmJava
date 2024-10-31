package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 2822 _ 점수 계산

public class Main_2822 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] scores = new int[8];
        int sumHighScore = 0;

        for (int i = 0; i < 8; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
        int[] sortedScores = Arrays.copyOf(scores, 8);
        Arrays.sort(sortedScores);

        ArrayList<Integer> idxList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int highScore = sortedScores[i+3];
            sumHighScore += highScore;

            for (int j = 0; j < scores.length; j++) {
                if (scores[j] == highScore) {
                    idxList.add(j + 1);
                    break;
                }
            }

        }

        Collections.sort(idxList);
        for (int idx : idxList) {
            sb.append(idx).append(" ");
        }

        System.out.println(sumHighScore);
        System.out.println(sb.toString().trim());

    }

}
