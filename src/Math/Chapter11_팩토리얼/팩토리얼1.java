package Math.Chapter11_팩토리얼;

// 주제 : 팩토리얼
// 내용 : 팩토리얼이란 정수 n까지의 모든 정수를 곱한 결과
// 방법 : 1부터 입력 값까지 계속 곱하기 (반복문, 재귀함수)
// 실습 : 입력받은 팩토리얼 결괏값을 출력하는 프로그램 만들기

import java.util.Scanner;

public class 팩토리얼1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 구하려는 팩토리얼 입력
        System.out.print("팩토리얼 입력 : ");
        int factorial = scanner.nextInt();

        // 반복문으로 구하기
        int result = 1;
        for(int idx=1; idx<=factorial; idx++) {
            result *= idx;
        }

        // 결과 출력
        System.out.println(factorial + "! 팩토리얼 결괏값 : " + result);
    }
}
