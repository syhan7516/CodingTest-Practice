package Math.Chapter13_순열;

// 주제 : 순열
// 내용 : 순열이란 순서있게 일렬로 나열하는 경우의 수
// 방법 :
//   1-1.n*(n-1)*(n-2)*...*(n-r+1)
//   1-2.n!/(n-r)!
// 실습 : 순열들의 값을 구하는 프로그램 만들기

import java.util.Scanner;

public class 순열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N, R 입력
        System.out.print("수의 개수 : ");
        int numCnt = scanner.nextInt();
        System.out.print("나열할 개수 : ");
        int selectCnt = scanner.nextInt();

        // 순열구하는 방법 적용
        int result = 1;
        for(int idx=numCnt; idx>numCnt-selectCnt; idx--) {
            System.out.print(idx + " * ");
            result *= idx;
        }

        // 결과 출력
        System.out.println("\b\b" + " = " + result);
    }
}
