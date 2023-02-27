package Math.Chapter12_군수열;

// 주제 : 군수열
// 내용 : 군수열이란 군(여러 항)으로 묶었을 때 규칙성을 가지는 수열
// 방법 :
//  1.등차, 등비, 계차 등 확인
//  2.여러 항으로 묶어 규칙성 확인
//  3.각 군에 대한 일반항 확인
//  4.각 군에 대한 항 합 확인
//  5.항 합에 대한 값은 전체 항에 대한 n번째 항까지의 개수
// 실습 : n번째 항의 값을 출력하는 프로그램 만들기

// 수열 정보
// 1/1, 1/2, 2/1, 1/3, 2/2, 3/1, 1/4, 2/3, 3/2, 4/1, 1/5, 2/4, ...

import java.util.Scanner;

public class 군수열2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n의 값을 입력
        System.out.print("항 입력 : ");
        int idxNum = scanner.nextInt();

        // 발견 여부 정보, 항에 대한 정보, 군에 대한 정보, 결과
        boolean flag = false;
        int curN = 1;
        int group = 1;
        int resultUp = 0;
        int resultDown = 0;
        
        // 차례대로 구하기
        while(!flag) {
            // 군 내의 수열에 대한 결과 출력
            System.out.print(group+"군 : ");
            for(int idx=1; idx<=group; idx++) {
                System.out.print(idx+ "/" + (group-idx+1) + " ");

                // n에 도달했을 경우
                if(curN==idxNum) {
                    resultUp = idx;
                    resultDown = group-idx+1;
                    flag = true;
                }

                // 항 증가
                curN += 1;
            }

            // 군 증가
            if(flag==false)
                group += 1;

            System.out.println();
        }

        // 결과 출력
        System.out.println(idxNum + "번째 항의 군과 해당 값 : " + group + "군 " + resultUp + "/" + resultDown);
    }
}
