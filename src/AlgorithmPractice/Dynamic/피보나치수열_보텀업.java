package AlgorithmPractice.Dynamic;

// 문제 : 피보나치 수열
// 문제 해결 방법 : 반복문을 통해 아래 값을 차례로 만들어 필요한 값 얻기
// 유의사항 : 최적 부분 구조 확인, 중복되는 부분 문제 확인, 아래에서 위로 구현

import java.util.Scanner;

public class 피보나치수열_보텀업 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테이블 사이즈 입력
        int dSize = scanner.nextInt();
        // 테이블 생성
        long dTable[] = new long[dSize+1];
        // 피보나치 수 기본 값 셋팅
        dTable[0] = 0;
        dTable[1] = 1;
        // 반복문으로 피보나치 수 구하기
        for(int idx=2; idx<dSize+1; idx++) {
            dTable[idx] = dTable[idx-1] + dTable[idx-2];
        }

        long result = dTable[dSize];

        // 결과 출력
        System.out.println(result);
    }
}