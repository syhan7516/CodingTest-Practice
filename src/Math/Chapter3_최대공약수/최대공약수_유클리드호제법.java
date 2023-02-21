package Math.Chapter3_최대공약수;

// 주제 : 최대공약수
// 내용 : 최대공약수란 공통된 약수 중에서 가장 큰 수 (거듭제곱, 나눗셈 방법 존재)
// 방법 :
//  1.A,B의 최대공약수는 B,A%B의 최대공약수
//  2.B,A%B의 최대공약수는 A%B,B%(A%B)의 최대공약수
//  3.1~2번 과정에서 나누어 떨어지는 값이 0이 나올 때까지 반복
// 실습 : 입력받은 두 수의 공약수와 최대공약수 구하기

import java.util.Scanner;

public class 최대공약수_유클리드호제법 {

    // 유클리드 호제법 정의
    static int gcd(int firNum, int secNum) {
        if(firNum%secNum==0)
            return secNum;

        return gcd(secNum, firNum%secNum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 0보다 큰 두 정수 입력
        int firNum = scanner.nextInt();
        int secNum = scanner.nextInt();

        // 최대공약수 : 유클리드 호제법
        int result = gcd(firNum,secNum);

        // 공약수 : 최대공약수의 약수
        for(int idx=1; idx<=result; idx++) {
            if(result%idx==0)
                System.out.println("공약수 : " + idx);
        }

        // 결과 출력
        System.out.println("최대공약수 : " + result);
    }
}
