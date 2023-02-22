package Math.Chapter8_시그마;

// 주제 : 시그마
// 내용 : 시그마란 수열의 합을 나타내는 기호
// 방법 :
//  1.등비수열인지, 등차수열인지 판단
//  2.어떤 수열인지에 따라 일반항으로 합 구하기
// 실습 : n번째 항까지의 합을 출력하는 프로그램을 만들기

import java.util.Scanner;

public class 시그마 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 등차수열 첫 번째 요소 & 공차 & n 입력
        int firEle = scanner.nextInt();
        int D = scanner.nextInt();
        int firN = scanner.nextInt();

        // N항까지의 합
        int firResult = firEle + (firN-1) * D;
        int firPrefixSum = (firEle + firResult) * firN/2;
        System.out.println("등차수열 N항까지의 합 : " + firPrefixSum);

        // 등비수열 첫 번째 요소 & 공비 & n 입력
        int secEle = scanner.nextInt();
        int R = scanner.nextInt();
        int secN = scanner.nextInt();

        // N항까지의 합
        int secPrefixSum = 0;
        secPrefixSum = (int) ((secEle * (1-(Math.pow(R,secN)))) / (1-R));
        System.out.println("등비수열 N항까지의 합 : " + secPrefixSum);
    }
}
