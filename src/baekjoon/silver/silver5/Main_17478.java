package baekjoon.silver.silver5;

import java.util.*;
import java.io.*;

// Silver V _ 17478 _ 재귀함수가 뭔가요?

public class Main_17478 {

    public static void solution(String str, int n, int cnt) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(str.repeat(cnt) + "\"재귀함수가 뭔가요?\"\n");
        if (n == cnt) {
            bw.write(str.repeat(cnt) + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
        } else {
            bw.write(str.repeat(cnt) + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
            bw.write(str.repeat(cnt) + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
            bw.write(str.repeat(cnt) + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
            bw.flush();
            solution(str, n, cnt+1);
        }
        bw.write(str.repeat(cnt) + "라고 답변하였지.\n");
        bw.flush();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = "____";
        bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
        bw.flush();
        solution(str, n, 0);

    }

}
