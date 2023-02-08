package AlgorithmPractice.Dynamic;

// 문제 : 효율적인 화폐 구성
// 문제 해결 방법 : 각 화폐 단위를 하나씩 확인하며 화폐 구성이 가능한지에 대해 생각
// 유의사항 : 최적 부분 구조 확인, 중복되는 부분 문제 확인, 화폐 구성 가능여부에 대한 점화식 설정

import java.util.Arrays;
import java.util.Scanner;

public class 효율적인화폐구성 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 화폐의 종류 & 총합 돈 입력
        int kindsMoney = scanner.nextInt();
        int totalMoney = scanner.nextInt();

        // 화폐의 단위 정보 입력
        int kindsMoneyArr[] = new int[kindsMoney];
        for(int idx=0; idx<kindsMoney; idx++) {
            kindsMoneyArr[idx] = scanner.nextInt();
        }

        // DP Table 초기화
        int dp[] = new int[totalMoney+1];
        Arrays.fill(dp,10001);

        // 다이나믹 프로그래밍 수행
        dp[0] = 0;
        for(int kinds=0; kinds<kindsMoney; kinds++) {
            for(int table=kindsMoneyArr[kinds]; table<=totalMoney; table++) {
                // 화폐 구성 방법이 존재할 경우
                if(dp[table-kindsMoneyArr[kinds]] != 10001) {
                    dp[table] = Math.min(dp[table], dp[table-kindsMoneyArr[kinds]]+1);
                }
            }
        }

        // 결과 출력
        if(dp[totalMoney] == 10001)
            System.out.println(-1);
        else
            System.out.println(dp[totalMoney]);
    }
}