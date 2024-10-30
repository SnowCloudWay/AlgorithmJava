package study;

import java.io.*;
import java.util.StringTokenizer;

// BufferedReader, StringTokenizer, StringBuilder

public class BufferedTokenizerBuilder {

    public static void main(String[] args) throws IOException {

        // BufferedReader : 동기화 되기 때문에 멀티 쓰레드 환경에서 안전함
        // Scanner : 동기화 되지 않기 때문에 멀티 쓰레드 환경에서 안전하지 않음

        // BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = Integer.parseInt(br.readLine());
        // 입력 : readLine(); 메소드 사용
        // String으로 리턴 값이 고정 | 다른 타입의 입력은 형변환 필요
        // 예외처리 반드시 필요	1. throws IOException
        //					    2. readLine()시 마다 try/catch문으로 감싸주기

        // 데이터 가공
        // StringTokenizer
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        // nextToken() 함수를 쓰면 readLine()을 통해 입력 받은 값을 공백 단위로 구분하여 순서대로 호출

        // String.split() 함수
        String arr[] = s.split(" ");
        // 배열에 공백단위로 끊어 데이터를 저장하여 사용


        // BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = "abcdef";	// 출력할 문자열
        bw.write(s);			// 출력
        bw.newLine();			// 줄바꿈
        bw.flush();				// 남아있는 데이터 모두 출력
        bw.close();
        // System.out.println("");처럼 출력과 개행을 동시에 해주지 않기 때문에
        // 개행을 위해선 newLine(); 혹은 bw.write("\n"); 사용해야 함
        // BufferedWriter은 버퍼를 잡아 놓기 때문에 사용 후 반드시 flush()/close() 하기
        // close() 하면 출력 스트림을 아예 닫아버리기 때문에 한 번 출력 후 또 출력하려면 flush() 사용



    }

}
