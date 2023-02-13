package AlgorithmPractice.Dynamic;

// 문제 : 금광
// 문제 해결 방법 : 왼쪽 위에서 오는 경우, 왼쪽 아래에서 오는 경우, 왼쪽에서 오는 경우 → 세 가지만 고려
// 유의사항 : 최적 부분 구조 확인, 중복되는 부분 문제 확인, 매 칸마다의 금 보유 정보를 점화식으로 표현

import java.util.Scanner;

public class 금광 {

    public static int row;
    public static int col;
    public static int gold[][] = new int[20][20];
    public static int dp[][] = new int[20][20];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 케이스 수 입력
        int caseNum = scanner.nextInt();

        for(int caseIdx=0; caseIdx<caseNum; caseIdx++) {
            // 행, 열 입력
            row = scanner.nextInt();
            col = scanner.nextInt();

            // 금광 정보 입력
            for(int a=0; a<row; a++) {
                for(int b=0; b<col; b++) {
                    gold[a][b] = scanner.nextInt();
                }
            }

            // DP 테이블 초기화
            for(int a=0; a<row; a++) {
                for(int b=0; b<col; b++) {
                    dp[a][b] = gold[a][b];
                }
            }

            // 금광 탐색
            for(int b=1; b<col; b++) {
                for(int a=0; a<row; a++) {
                    if(b==0)
                        dp[a][b] = dp[a][b] + Integer.max(dp[a][b-1],dp[][])
                    dp[a][b] = dp[a][b] + Integer.max(Integer.max(dp[a-1][b-1],dp[a][b-1]),dp[a+1][b-1]);
                }
            }


            // 결과 출력
            for(int a=0; a<row; a++) {
                for(int b=0; b<col; b++) {
                    System.out.print(gold[a][b]+" ");
                }
                System.out.println();
            }
        }

    }
}