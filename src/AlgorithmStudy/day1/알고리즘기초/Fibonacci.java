package AlgorithmStudy.day1.알고리즘기초;

// 주제 : 피보나치 수열
// 내용 : 피보나치 수열을 재귀함수로 구현
// 방법 : 재귀 함수
// 유의 사항 : 재귀 함수는 종료 조건과 서치 조건이 기본

import java.util.Scanner;

public class Fibonacci {

    // 피보나치 수열 함수 정의
    static int recursion(int number) {
        // Termination Condition
        if(number <= 2)
            return 1;

        return recursion(number-1) + recursion(number-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자 입력
        int number = scanner.nextInt();
        // 피보나치 수열 함수 호출
        int result = recursion(number);

        // 결과 출력
        System.out.println(result);
    }
}
