package AlgorithmPractice.DFSBFS;

// 주제 : DFS의 구현을 위한 스택
// 내용 : 선입후출 - 먼저 들어온 데이터가 맨 마지막에 나가는 구조
// 메소드 : push(숫자), pop(), size(), peek(), empty()

import java.util.Stack;

public class AboutStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // 삽입 - push(숫자)
        st.push(3);
        st.push(2);
        st.push(5);
        System.out.println("삽입 결과 : "+st);

        // 제거 - pop()
        st.pop();
        System.out.println("삭제 결과 : "+st);
        st.pop();
        System.out.println("삭제 결과 : "+st);

        // 크기 - size()
        System.out.println("크기 확인 : "+st.size());

        // 스택 최상단 확인 - peek()
        System.out.println("최상단 확인 : "+st.peek());

        // 비었는지 확인 - empty()
        System.out.println("비었는지 확인 : "+st.empty());
        st.pop();
        System.out.println("삭제 결과 : "+st);
        System.out.println("비었는지 확인 : "+st.empty());
    }
}
