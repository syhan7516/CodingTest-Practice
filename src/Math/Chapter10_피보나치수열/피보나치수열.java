package Math.Chapter10_피보나치수열;

// 주제 : 피보나치 수열
// 내용 : 피보나치 수열이란 세 번째 항부터 해당 항이 이전과 이전의 전 항을 더한 합으로 성립하는 수열
// 방법 :
//  1.첫 번째, 두 번째 항 넣기
//  2.세 번째 항부터 전과 전전 항을 더하기
//  3.더한 후 전 항에는 현재 결과 값을 전전 항에는 전 항의 값을 넣기
// 실습 : 피보나치 수를 계산하는 프로그램 만들기

import java.util.Scanner;

public class 피보나치수열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 구하려는 피보나치 수 입력
        System.out.print("피보나치 수 입력 : ");
        int pibonacciNum = scanner.nextInt();

        // 첫 번째, 두 번째 항 정의
        int firNum = 1;
        int secNum = 1;

        // 반복문을 통해 피보나치 수 구하기
        int result = 0;
        int numSum = 0;
        int curN = 1;
        while(curN<=pibonacciNum) {
            if(curN<=2)
                result = 1;
            else {
                result = firNum + secNum;
                firNum = secNum;
                secNum = result;
            }

            numSum += result;
            System.out.println(curN + "의 피보나치 수 : " + result);
            System.out.println(curN + "번째 항까지의 합 : " + numSum);
            System.out.println("----------------------------------");

            curN += 1;
        }
    }
}
