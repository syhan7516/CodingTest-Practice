package Math.Chapter9_계차수열;

// 주제 : 계차수열
// 내용 : 계차수열이란 두 항의 차로 이루어진 또 다른 수열
// 방법 :
//  1.등차수열, 등비수열인지 확인
//  2.두 항의 차에 대한 수열의 일반항 확인
//  3.해당 일반항으로 계차수열에 대한 일반항 확인
// 실습 : n번째 항의 값을 출력하는 프로그램 만들기

// 수열 정보
// an = 3,7,13,21,31,43,57
// bn = 4,6,8,10,12,14,16

import java.util.Scanner;

public class 계차수열2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 요소
        System.out.print("a의 첫번째 요소 입력 : ");
        int firEle = scanner.nextInt();
        System.out.print("a의 N항 입력 : ");
        int firN = scanner.nextInt();

        // 차에 대한 첫 번째 요소
        System.out.print("b의 첫번째 요소 입력 : ");
        int secEle = scanner.nextInt();
        System.out.print("b의 공차 입력 : ");
        int secD = scanner.nextInt();

        // 일반항으로 구하기
        int secResult = secEle + (firN-2) * secD;
        int secSum = (secEle+secResult)*(firN-1)/2;
        int firResult = secSum+firEle;
        System.out.println(firN + "번째 a : " + firResult);
        System.out.println((firN-1) + "번째 b : " + secResult);
        System.out.println("----------------------------");
    }
}
