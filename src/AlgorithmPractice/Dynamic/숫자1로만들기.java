package AlgorithmPractice.Dynamic;

// 문제 : 숫자 1로 만들기
// 문제 해결 방법 : 각 연산 결과에 대한 최적의 해를 작은 문제로 생각
// 유의사항 : 최적 부분 구조 확인, 중복되는 부분 문제 확인, 연산 결과 비교에 대한 점화식 설정

import java.util.Scanner;

public class 숫자1로만들기 {

    // 결과 변수
    public static int result;
    // 테이블 만들기
    public static int opResult[] = new int[30001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 입력
        int number = scanner.nextInt();

        // 테이블 초기화
        for(int idx=0; idx<opResult.length; idx++) {
            opResult[idx] = 0;
        }

        // 다이나믹 프로그래밍 진행 (보텀업)
        for(int idx=2; idx<number+1; idx++) {
            // 현재의 수에서 1을 빼는 경우
            opResult[idx] = opResult[idx-1] + 1;
            // 현재의 수가 2로 나누어 떨어지는 경우
            if(idx%2==0)
                opResult[idx] = Math.min(opResult[idx],opResult[idx/2]+1);
            // 현재의 수가 3으로 나누어 떨어지는 경우
            if(idx%3==0)
                opResult[idx] = Math.min(opResult[idx],opResult[idx/3]+1);
            // 현재의 수가 5로 나누어 떨어지는 경우
            if(idx%5==0)
                opResult[idx] = Math.min(opResult[idx],opResult[idx/5]+1);
        }

        // 결과 출력
        System.out.println(opResult[number]);
    }
}