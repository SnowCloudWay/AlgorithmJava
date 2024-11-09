package study.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueStudy {
    public static void main(String[] args) {
        // LinkedList로 Queue 생성
        Queue<Integer> queue = new LinkedList<>();

        // 큐에 요소 추가
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // 큐 상태 출력
        System.out.println("Queue: " + queue);

        // 큐에서 요소 제거 (FIFO 순서)
        int removedElement = queue.poll();  // 맨 앞에 있는 요소 제거
        System.out.println("Removed Element: " + removedElement);

        // 큐 상태 출력
        System.out.println("Queue after removal: " + queue);

        // 큐의 맨 앞 요소 확인 (제거하지 않고)
        int peekElement = queue.peek();
        System.out.println("Peek Element: " + peekElement);
    }

}
