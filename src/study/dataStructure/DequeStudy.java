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
        deque1.addFirst(1);     // 맨 앞 원소에 삽입    | 용량 초과 시 예외 발생
        deque1.addLast(1);      // 마지막 원소에 삽입   | 용량 초과 시 예외 발생
        deque1.add(1);             // 마지막 원소에 삽입   | 용량 초과 시 예외 발생
        deque1.offerFirst(1);   // 맨 앞 원소에 삽입    | 삽입 성공 true, 용량 제한 false 리턴
        deque1.offerLast(1);    // 마지막 원소에 삽입   | 삽입 성공 true, 용량 제한 false 리턴
        deque1.offer(1);        // 마지막 원소에 삽입   | 삽입 성공 true, 용량 제한 false 리턴

        // Deque 삭제 메서드
        deque1.remove();        // 맨 앞 원소 제거 후 리턴   | 비어있는 경우 예외 발생
        deque1.removeFirst();   // 맨 앞 원소 제거 후 리턴   | 비어있는 경우 예외 발생
        deque1.removeLast();    // 마지막 원소 제거 후 리턴   | 비어있는 경우 예외 발생
        deque1.poll();          // 맨 앞 원소 제거 후 리턴   | 비어있는 경우 null 리턴
        deque1.pollFirst();     // 마지막 원소 제거 후 리턴   | 비어있는 경우 null 리턴
        deque1.pollLast();      // 마지막 원소 제거 후 리턴   | 비어있는 경우 null 리턴
        deque1.clear();         // 덱 모든 요소 제거

        // Deque 조회 메서드
        deque1.getFirst();      // 맨 앞 원소 리턴    | 비어있는 경우 예외 발생
        deque1.getLast();       // 마지막 원소 리턴    | 비어있는 경우 예외 발생
        deque1.peek();          // 맨 앞 원소 리턴    | 비어있는 경우 null 리턴
        deque1.peekFirst();     // 맨 앞 원소 리턴    | 비어있는 경우 null 리턴
        deque1.peekLast();      // 마지막 원소 리턴    | 비어있는 경우 null 리턴
        deque1.isEmpty();       // 덱이 비어있는지 확인

        // Deque 기타 메서드
        deque1.contains(1);     // 덱에 특정 요소가 포함되어 있는지 확인
        deque1.size();          // 덱의 요소 개수 반환
        deque1.iterator();      // 덱의 요소를 순서대로 접근할 수 있는 Iterator 반환
        deque1.descendingIterator();           // 덱의 요소를 역순으로 접근할 수 있는 Iterator 반환
        deque1.removeFirstOccurrence(1);    // 덱의 첫 번째부터 검색하여 처음 발견된 특정 요소 제거
        deque1.removeLastOccurrence(1);     // 덱의 마지막부터 검색하여 처음 발견된 특정 요소 제거

    }

}
