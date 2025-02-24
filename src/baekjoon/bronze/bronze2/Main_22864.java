package baekjoon.bronze.bronze2;

import java.io.*;
import java.util.*;

// Bronze II _ 22864 _ 피로도

public class Main_22864 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int work = 0, tired = 0, time = 0;

        if (A <= M) {
            while (time < 24) {
                if (tired + A > M) {
                    tired -= C;
                    if (tired < 0)
                        tired = 0;
                }
                else {
                    work += B;
                    tired += A;
                }

                time++;
            }
        }

        System.out.println(work);

    }
}
