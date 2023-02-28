package Math.Chapter13_순열;

// 주제 : 원순열
// 내용 : 원순열이란 시작과 끝의 구분이 없는 원 모습으로 구성된 순열
// 방법 :
//   1-1.n!/n
//   1-2.(n-1)!
// 실습 : 4명의 친구가 원탁 테이블에 앉을 수 있는 순서를 계산해보기

import java.util.Scanner;

public class 원순열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사람 수 입력
        System.out.print("사람의 수 : ");
        int personCnt = scanner.nextInt();

        // 원순열 방법 적용
        int result = 1;
        for(int idx=personCnt-1; idx>0; idx--) {
            System.out.print(idx + " * ");
            result *= idx;
        }

        // 결과 출력
        System.out.println("\b\b" + " = " + result);
    }
}
