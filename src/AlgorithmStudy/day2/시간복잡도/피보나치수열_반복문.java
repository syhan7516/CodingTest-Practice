package AlgorithmStudy.day2.시간복잡도;

// 주제 : 피보나치 수열
// 내용 : 피보나치 수열 반복문으로 구현
// 방법 : 메모리 스와핑을 이용하여 다음 피보나치 구하기
// 특성 :
//  1.바텀업 방식
//  2.현재 변수 저장값을 이용하여 중복없이 연산
//  3.시간복잡도 O(n)

import java.util.Scanner;

public class 피보나치수열_반복문 {

    // 피보나치 함수
    static int fibonacci(int number) {

        // 피보나치 값 저장
        int a,b,c;
        a = b = c = 1;

        // 입력 수만큼 반복
        for(int fibo=3; fibo<=number; fibo++) {
            c = a + b;
            a = b;
            b = c;
        }

        // 결과 반환
        return c;
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
