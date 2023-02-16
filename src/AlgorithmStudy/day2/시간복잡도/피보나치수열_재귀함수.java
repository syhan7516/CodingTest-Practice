package AlgorithmStudy.day2.시간복잡도;

// 주제 : 피보나치 수열
// 내용 : 피보나치 수열 재귀함수로 구현
// 방법 : 필요한 부분을 계속하여 재귀로 호출
// 특성 :
//  1.중복되는 부분도 계속 호출
//  2.시간복잡도 O(2^n)

import java.util.Scanner;

public class 피보나치수열_재귀함수 {

    // 피보나치 함수
    static int fibonacci(int number) {
        // 현재 피보나치
        System.out.println("피보나치 : " + number + " 수행 중");

        // 종료 조건
        if(number <= 2)
            return 1;

        // 호출 조건
        return fibonacci(number-1) + fibonacci(number-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자 입력
        int number = scanner.nextInt();

        // 피보나치 호출
        int result = fibonacci(number);

        // 결과 출력
        System.out.println(result);
    }
}
