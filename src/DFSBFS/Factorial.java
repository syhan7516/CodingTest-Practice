package DFSBFS;

// 문제 : 팩토리얼을 재귀 함수와 반복문으로 구현
// 문제 해결 방법 : 반복되는 과정, 작업을 파악
// 유의사항 : 재귀 호출의 경우 종료 조건 필요

import java.util.Scanner;

public class Factorial {

    // 재귀 함수
    static int recursionFactorial(int number) {
        if (number <= 1) return 1;
        return number * recursionFactorial(number - 1);
    }

    // 반복문
    static int repetitionResult(int number) {
        int result = 1;
        for (int idx = 1; idx <= number; idx++) {
            result *= idx;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        // 재귀 방법으로 팩토리얼 구현
        int recursionResult = recursionFactorial(N);
        System.out.println("재귀 방법 결과 : " + recursionResult);

        // 반복문으로 팩토리얼 구현
        int repetitionResult = repetitionResult(N);
        System.out.println("반복문 결과 : " + repetitionResult);
    }
}