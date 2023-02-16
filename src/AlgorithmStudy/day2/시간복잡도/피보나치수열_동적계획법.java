package AlgorithmStudy.day2.시간복잡도;

// 주제 : 피보나치 수열
// 내용 : 피보나치 수열 동적계획법으로 구현
// 방법 : 메모이제이션을 통해 다음 피보나치 구하기
// 특성 :
//  1.바텀업 방식
//  2.이미 구했던 값에 대해 저장 후 필요시 불러와 중복없이 연산
//  3.모든 피보나치 수열구하기 : 시간복잡도 O(n)
//  4.이미 구했던 피보나치 수열구하기 : 시간복잡도 O(1)

import java.util.Scanner;

public class 피보나치수열_동적계획법 {

    // 피보나치 함수
    static int fibonacci(int number) {

        // DP 테이블 생성 & 초기화
        int DP[] = new int[number+1];

        // 피보나치 값 기본 셋팅
        DP[1] = 1;
        DP[2] = 1;

        // 입력 수만큼 반복
        for(int fibo=3; fibo<=number; fibo++) {
            DP[fibo] = DP[fibo-1] + DP[fibo-2];
        }

        // 결과 반환
        return DP[number];
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
