package Math.Chapter3_최대공약수;

// 주제 : 최대공약수
// 내용 : 최대공약수란 공통된 약수 중에서 가장 큰 수 (거듭제곱, 나눗셈 방법 존재)
// 방법 :
//  1.1부터 두 수 중 더 작은 수까지를 입력한 두 수에 나누기
//  2. 결과적으로 가장 마지막에 나누어진 수가 두 수의 최대공약수
// 실습 : 입력받은 두 수의 공약수와 최대공약수 구하기

import java.util.Scanner;

public class 최대공약수_나눗셈 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 0보다 큰 두 정수 입력
        int firNum = scanner.nextInt();
        int secNum = scanner.nextInt();

        // 1~더 작은 수까지 나누어보기
        int maxNum = 0;
        for(int idx=1; idx<=firNum; idx++) {
            if(firNum%idx == 0 && secNum%idx == 0) {
                System.out.println("공약수 : " + idx);
                maxNum = idx;
            }
        }

        // 결과 출력
        System.out.println("최대공약수 : " + maxNum);
    }
}
