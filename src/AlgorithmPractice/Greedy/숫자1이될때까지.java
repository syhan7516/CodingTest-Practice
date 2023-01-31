package 알고리즘1.Greedy;

// 문제 : 1이 될 때까지
// 문제 해결 방법 : 최대한 많이 나누기 연산 수행
// 정당성 분석 : 나누는 연산이 1을 빼는 작업보다 숫자의 값을 훨씬 많이 줄이기 가능

import java.util.Scanner;

public class 숫자1이될때까지 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자, 나눌 수 입력
        int number = scanner.nextInt();
        int dividNum = scanner.nextInt();
        int count = 0;

        while(true) {
            // 숫자가 1일 경우 반복문 종료
            if(number==1) break;

            // 나누기가 가능하다면 나누기
            if(number%dividNum==0) number /= dividNum;
            // 나누기가 불가능하다면 1빼기
            else number -= 1;
            // 연산 수 증가
            count += 1;
        }

        // 결과 출력
        System.out.println(count);
    }
}
