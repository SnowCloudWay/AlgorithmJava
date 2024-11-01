package study.dataStructure;

import java.util.*;
import java.io.*;

public class PriorityQueueStudy {

    public static void main(String[] args) {

        // 우선순위 큐 생성
        // int형 | 우선순위가 낮은 숫자 순
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        // int형 | 우선순위가 높은 숫자 순
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        // String형
        PriorityQueue<String> pq3 = new PriorityQueue<>();
        PriorityQueue<String> pq4 = new PriorityQueue<>(Collections.reverseOrder());

        // 우선순위 큐 값 추가
        pq1.add(1);         // 삽입 성공하면 true 반환, 실패하면 예외 발생
        pq1.offer(2);    //

        // 우선순위 큐 값 제거
        pq1.poll();     // 첫번째 값 반환, 비어있으면 null
        pq1.remove();   // 첫번째 값 제거
        pq1.clear();    // 초기화

        // 우선순위 높은 값 출력
        pq1.peek();     // 값이 없을 경우 null

    }

}
