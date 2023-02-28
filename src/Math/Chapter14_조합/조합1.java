package Math.Chapter14_조합;


import java.util.Scanner;

// 주제 : 조합
// 내용 : 조합이란 순서 상관없이 선택하는 방법
// 방법 : n!/(r!(n-r)!)
// 실습 : 조합들의 값을 구하는 프로그램 만들기

// 조합 데이터
// 8C3, 7C5

public class 조합1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N, R 입력
        System.out.print("수의 개수 : ");
        int numCnt = scanner.nextInt();
        System.out.print("나열할 개수 : ");
        int selectCnt = scanner.nextInt();

        // 조합의 방법 적용
        int resultP = 1;
        for(int idx=numCnt; idx>numCnt-selectCnt; idx--) {
            resultP *= idx;
        }

        int resultR = 1;
        for(int idx=selectCnt; idx>0; idx--) {
            resultR *= idx;
        }

        // 결과 출력
        int resultC = resultP/resultR;
        System.out.println("조합의 결과 : " + resultC);
    }
}