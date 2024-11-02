package study.dataStructure;

import java.util.*;
import java.io.*;

public class DequeStudy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Deque 선언
        // ArrayDeque
        // - 배열 기반으로 구현, 메모리 효율 높음
        // - 일반적으로 사용하는 구현체
        // - null 요소 허용 X
        Deque<Integer> deque1 = new ArrayDeque<>();
        // LinkedList
        // - 양방향 연결 리스트로 구현, 요소의 추가 및 삭제가 빠름
        // - 양방향 삽입, 삭제가 빈번할 때 적합하지만, 메모리 사용량이 많고 ArrayDeque에 비해 다소 성능 떨어짐
        // - null 요소 허용
        Deque<Integer> deque2 = new LinkedList<>();

        // Deque 삽입 메서드

        // Deque 삭제 메서드

        // Deque 조회 메서드

        // Stack 관련 메서드 (Deque를 Stack처럼 사용하기 위한 메서드)

        // Deque 기타 메서드
        

    }

}
