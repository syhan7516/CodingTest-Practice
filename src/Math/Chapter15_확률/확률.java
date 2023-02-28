package Math.Chapter15_확률;

// 주제 : 확률
// 내용 : 확률이란 전체 사건(샘플)에서 특정 사건(사건)이 일어날 수 있는 수
// 방법 :
//   1.전체의 경우의 수 확인
//   2.가능한 경우의 수 / 전체의 경우의 수
// 실습 : 박스에 꽝 4장, 선물 3장가 존재하는데, 꽝 2장, 선물 1장 뽑을 확률

import java.util.Scanner;

public class 확률 {

    // 조합 함수 정의
    static int getCombinationCnt(int numCnt, int selectCnt) {
        int resultP = 1;
        for (int idx=numCnt; idx>numCnt-selectCnt; idx--) {
            resultP *= idx;
        }
        int resultR = 1;
        for (int idx=selectCnt; idx>0; idx--) {
            resultR *= idx;
        }
        int totalFailCnt = resultP / resultR;
        return totalFailCnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N, R 입력
        System.out.print("박스 안 종이의 수 : ");
        int numCnt = scanner.nextInt();
        System.out.print("뽑을 종이의 수 : ");
        int selectCnt = scanner.nextInt();
        System.out.print("꽝의 수 : ");
        int failCnt = scanner.nextInt();
        System.out.print("선물의 수 : ");
        int giftCnt = scanner.nextInt();
        System.out.print("뽑을 꽝 & 선물 : ");
        int selectFailCnt = scanner.nextInt();
        int selectGiftCnt = scanner.nextInt();

        // 전체 경우의 수
        int resultP = 1;
        for (int idx = numCnt; idx > numCnt - selectCnt; idx--) {
            resultP *= idx;
        }

        int resultR = 1;
        for (int idx = selectCnt; idx > 0; idx--) {
            resultR *= idx;
        }
        int totalCnt = resultP / resultR;

        // 가능한 경우의 수
        int totalFailCnt = getCombinationCnt(failCnt, selectFailCnt);
        int totalGiftCnt = getCombinationCnt(giftCnt, selectGiftCnt);

        // 결과 출력
        double result = (double) (totalGiftCnt * totalFailCnt) / totalCnt * 100;
        result *= 100;
        result = (double)Math.round(result)/100;
        System.out.println("확률 : " + result + "%");
    }
}