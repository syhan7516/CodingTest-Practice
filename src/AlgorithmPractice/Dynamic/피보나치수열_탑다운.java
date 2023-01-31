package AlgorithmPractice.Dynamic;

// 문제 : 피보나치 수열
// 문제 해결 방법 : 위에서 차례로 필요한 값을 위한 피보나치 함수를 호출하여 테이블을 채우기
// 유의사항 : 최적 부분 구조 확인, 중복되는 부분 문제 확인, 위에서 아래로 구현

import java.util.Scanner;

public class 피보나치수열_탑다운 {

    // 피보나치 함수 정의
    static int fibonacci(int dTable[], int num) {
        // 종료 조건 1 : 1 또는 2
        if(num == 1 || num == 2)
            return 1;

        // 종료 조건 2 : 테이블에 값이 존재할 경우
        if(dTable[num] != 0)
            return dTable[num];

        // 서치 컨디션 : 테이블이 값이 없는 경우
        dTable[num] = fibonacci(dTable,num-1) + fibonacci(dTable,num-2);

        // 해당 피보나치 결과 반환
        return dTable[num];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 테이블 사이즈 입력
        int dSize = scanner.nextInt();
        // 테이블 생성
        int dTable[] = new int[dSize+1];
        // 테이블 초기화
        for(int idx=0; idx<dSize+1; idx++) {
            dTable[idx] = 0;
        }
        // 피보나치 함수 호출(탑다운)
        int result = fibonacci(dTable,dSize);

        // 결과 출력
        System.out.println(result);
    }
}
