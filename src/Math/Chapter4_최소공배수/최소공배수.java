package Math.Chapter4_최소공배수;

// 주제 : 최소공배수
// 내용 : 최소공배수란 공통된 배수 중에서 가장 작은 수 (거듭제곱, 나눗셈 방법 존재)
// 방법 : 해당 수들을 곱하고, 최대공약수로 나누기 
//      (세 수는 두 수의 최소공배수를 구하고, 그 최대공배수와 다른 나머지 값의 최대공배수를 구하기)
// 실습 : 입력된 두 수의 최소공배수를 구하기

import java.util.Scanner;

public class 최소공배수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 0보다 큰 두 정수 입력
        int firNum = scanner.nextInt();
        int secNum = scanner.nextInt();


        // 최대공약수 구하기
        int maxNum = 0;
        for(int idx=1; idx<=firNum; idx++) {
            if(firNum%idx==0 && secNum%idx==0)
                maxNum = idx;
        }

        // 최소공배수 구하기
        int minNum = 0;
        minNum = firNum * secNum / maxNum;

        // 결과 출력
        System.out.println("최대공약수 : " + maxNum);
        System.out.println("최소공배수 : " + minNum);
    }
}
