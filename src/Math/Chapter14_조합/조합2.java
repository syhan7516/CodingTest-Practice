package Math.Chapter14_조합;


import java.util.Scanner;

// 주제 : 조합
// 내용 : 조합이란 순서 상관없이 선택하는 방법
// 방법 : n!/(r!(n-r)!)
// 실습 : 카드 5장 중 2장을 선택했을 때 삼각형과 사각형이 동시에 선택될 수 있는 확률

// 조합 데이터
// 동그라미, 삼각형, 사각형, 오각형, 육각형

public class 조합2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // N, R 입력
        System.out.print("수의 개수 : ");
        int numCnt = scanner.nextInt();
        System.out.print("나열할 개수 : ");
        int selectCnt = scanner.nextInt();

        // 조합의 방법 적용
        int resultP = 1;
        for(int idx=numCnt; idx>numCnt-selectCnt; idx--) {
            resultP *= idx;
        }

        int resultR = 1;
        for(int idx=selectCnt; idx>0; idx--) {
            resultR *= idx;
        }

        // 총 선택가능한 수
        int totalCnt = resultP/resultR;

        // 결과 출력
        double result = ((double)1/totalCnt) * 100;
        System.out.println("확률 : " + (int)result + "%");
    }
}