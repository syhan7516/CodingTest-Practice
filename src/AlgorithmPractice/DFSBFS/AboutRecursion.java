package AlgorithmPractice.DFSBFS;

// 주제 : DFS의 구현을 위한 재귀 함수
// 내용 : 자기 자신을 다시 호출하는 함수를 의미
// 유의사항 : 종료 조건이 포함된 부분이 필요

public class AboutRecursion {

    static void recursionFunction(int number){
        // 종료 조건
        if(number == 100) return;

        // 재귀 호출
        System.out.println(number+"번째 재귀에서 "+(number+1)+"번쨰 재귀 호출");
        recursionFunction(number+1);
        System.out.println(number+"번째 재귀 종료");
    }

    public static void main(String[] args) {
        // 재귀 함수 호출
        recursionFunction(1);
    }
}
