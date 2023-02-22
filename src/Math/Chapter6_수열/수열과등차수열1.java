package Math.Chapter6_수열;

// 주제 : 수열과 등차수열
// 내용 :
//  - 수열이란 규칙성을 가지고 나열된 수들
//  - 등차수열이란 연속된 두 항의 차이가 일정한 수열
// 방법 :
//  일반항
//  1.a₂-a₁ = d ~ aₙ-aₙ﹘₁ = d
//  2.모두 더하면 aₙ-a₁=(n-1)*d
//  3.식 : aₙ=a₁+(n-1)*d
//  합
//  1.처음과 마지막 항을 더하기
//  2.항의 수 곱하기
//  3.나누기 2하기
// 실습 : n번째 항의 값을 출력하는 프로그랭 만들기

import java.util.Scanner;

public class 수열과등차수열1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 요소 & 공차 & n 입력
        int firEle = scanner.nextInt();
        int D = scanner.nextInt();
        int N = scanner.nextInt();

        // 차례로 n항 구하기
        int firResult = 0;
        int curN = 1;
        while(curN <= N) {

            if(curN==1) {
                firResult = firEle;
            }

            else {
                firResult += D;
            }

            System.out.println(curN + "번째 항의 값 : " + firResult);
            curN += 1;
        }

        System.out.println("----------------------");

        // 일반항으로 구하기
        int secResult = 0;

        // 첫 번째항 + (N-1) * D
        secResult = firEle + (N-1) * D;
        System.out.println(N + "번째 항의 값 : " + secResult);
    }
}