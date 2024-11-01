package baekjoon.bronze.bronze5;

import java.io.*;

// Bronze V _ 18108 _ 1998년생인 내가 태국에서는 2541년생?!

public class Main_18108 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(Integer.toString(Integer.parseInt(br.readLine()) - 543));

        bw.flush();

    }

}
