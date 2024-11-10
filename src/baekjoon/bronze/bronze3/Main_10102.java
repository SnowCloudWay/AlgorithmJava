package baekjoon.bronze.bronze3;

import java.io.*;

// Bronze III _ 10102 _ 개표

public class Main_10102 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long cntA = str.chars().filter(c -> c == 'A').count();
        long cntB = str.chars().filter(c -> c == 'B').count();

        if (cntA > cntB) System.out.println("A");
        else if (cntA < cntB) System.out.println("B");
        else System.out.println("Tie");

    }

}
