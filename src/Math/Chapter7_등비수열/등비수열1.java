package Math.Chapter7_등비수열;

// 주제 : 등비수열
// 내용 : 등비수열이란 연속된 두 항의 비가 일정한 수열
// 방법 :
//  일반항
//  1.a₂/a₁ = r ~ aₙ/aₙ﹘₁ = r
//  2.모두 곱하면 aₙ/a₁= r^(n-1)
//  3.식 : aₙ=a₁*r^(n-1)
//  합
//  1.Sₙ = (a₁*r^0) + (a₁*r^1) + (a₁*r^2) ... + (a₁*r^n-1)
//  2.Sₙ*r = (a₁*r^1) + (a₁*r^2) ... + (a₁*r^n)
//  3.첫 번째 항과 두 번째 항을 빼기
//  4.Sₙ(1-r) = a₁*(1-r^n)
//  5.Sₙ = a₁*(1-r^n)/(1-r)
// 실습 : n번째 항의 값을 출력하는 프로그램을 만들기

import java.util.Scanner;

public class 등비수열1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 요소 & 등비 & n 입력
        int firEle = scanner.nextInt();
        int R = scanner.nextInt();
        int N = scanner.nextInt();

        // 차례로 구하기
        int firResult = 0;
        int curN = 1;
        while(curN <= N) {

            if(curN==1) {
                firResult = firEle;
            }

            else {
                firResult *= R;
            }

            System.out.println(curN + "번째 항의 값 : " + firResult);
            curN += 1;
        }

        System.out.println("----------------------");

        // 일반항으로 구하기
        int secResult = 0;

        // 첫 번째항 * R^(N-1)
        secResult = (int) (firEle * Math.pow(R,N-1));
        System.out.println(N + "번째 항의 값 : " + secResult);
    }
}
