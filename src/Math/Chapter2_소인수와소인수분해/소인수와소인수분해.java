package Math.Chapter2_소인수와소인수분해;

// 주제 : 소인수 & 소인수분해
// 내용 : 소인수란 약수 중에서 소수인 숫자, 소인수분해란 소인수들을 이용하여 특정한 수를 곱의 형태로 나타낸 것
// 방법 :
//  1.2부터 주어진 수까지 입력 수를 나누어보기
//  2-1.나누어 떨어진다면 계속 나누기
//  2-2.나누어 떨어지지않는다면 다음 수로 나누기
//  3.나누어 떨어지는 수와 그 수의 개수 확인
// 실습 : 입력한 수를 소인수분해하기

import java.util.Scanner;

public class 소인수와소인수분해 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 0보다 큰 정수 입력
        int number = scanner.nextInt();

        // 가장작은 소수
        int startNum = 2;

        // 2~자기자신까지 나누어보기
        while(startNum<=number) {
            if(number%startNum==0) {
                System.out.println("소인수 : " + startNum);
                number /= startNum;
            }
            else {
                startNum += 1;
            }
        }
    }
}
