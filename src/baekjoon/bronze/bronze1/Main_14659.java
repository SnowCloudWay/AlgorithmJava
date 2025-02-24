package baekjoon.bronze.bronze1;

import java.util.*;
import java.io.*;

// Bronze I _ 14659 _ 한조서열정리하고옴ㅋㅋ

public class Main_14659 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] hanjos = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            hanjos[i] = Integer.parseInt(st.nextToken());

        int maxKill = 0;
        int bestHanjo = hanjos[0];
        int kill = 0;

        for (int i = 1; i < N; i++) {
            if (bestHanjo > hanjos[i])
                kill += 1;
            else {
                if (maxKill < kill)
                    maxKill = kill;
                bestHanjo = hanjos[i];
                kill = 0;
            }
        }

        if (maxKill < kill)
            maxKill = kill;
        System.out.println(maxKill);

    }
}
