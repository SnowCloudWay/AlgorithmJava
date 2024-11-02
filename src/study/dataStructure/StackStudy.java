package study.dataStructure;

import java.util.*;
import java.io.*;

public class StackStudy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 스택의 선언
        Stack<Integer> stackInt = new Stack<>();
        Stack<String> stackStr = new Stack<>();
        Stack<Boolean> stackBool = new Stack<>();

        // 스택 값 추가 : add(삽입할 value), push(삽입할 value)
        stackInt.add(1);         // 반환 값(삽입한 value의 자료형): 삽입한 value
        stackInt.push(2);   // 반환 값(boolean): true(성공) / false(실패;StackOverflow)

        // 스택 값 제거 : pop(), remove(index), clear()
        stackInt.pop();
        stackInt.remove(0);
        stackInt.clear();           // 스택 초기화

        // 스택의 top 원소 반환 : peek()
        stackInt.peek();

        // 스택의 크기 : size()
        stackInt.size();

        // 빈 스택인지 확인 : isEmpty(), empty()   // 반환 값 : 공백(true), 공백X(false)
        stackInt.isEmpty();
        stackInt.empty();

        // 스택 안에 해당 원소 있는지 확인 : search(찾을 value)
        stackInt.search(1);     // 반환 값 : top에서부터 몇 번째에 존재하는지 / 존재X : -1

        // 스택 값 변경 : set(index, 변경할 value)
        stackInt.set(0, 5);     // 반환 값 : 변경 전 value

        // 해당 인덱스에 존재하는 값 반환 : elementAt(index)
        stackInt.elements();   // 반환 값 : 해당 인덱스에 저장된 값


    }

}
