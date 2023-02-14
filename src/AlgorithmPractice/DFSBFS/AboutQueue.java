package AlgorithmPractice.DFSBFS;

// 주제 : BFS의 구현을 위한 큐
// 내용 : 선입선출 - 먼저 들어온 데이터가 제일 먼저 나가는 구조
// 메소드 : offer(숫자), poll(), size(), peek(), isEmpty()

import java.util.LinkedList;
import java.util.Queue;

public class AboutQueue {
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();

        // 삽입 - offer(숫자);
        qu.offer(3);
        qu.offer(2);
        qu.offer(5);
        System.out.println("삽입 결과 : "+qu);

        // 제거 - poll()
        qu.poll();
        System.out.println("제거 결과 : "+qu);
        qu.poll();
        System.out.println("제거 결과 : "+qu);

        // 크기 - size()
        System.out.println("크기 확인 : "+qu.size());
        
        // 큐 출구 확인 - peek()
        System.out.println("출구 확인 : "+qu.peek());

        // 비었는지 확인 - isEmpty()
        System.out.println("비었는지 확인 : "+qu.isEmpty());
        qu.poll();
        System.out.println("제거 결과 : "+qu);
        System.out.println("비었는지 확인 : "+qu.isEmpty());
    }
}