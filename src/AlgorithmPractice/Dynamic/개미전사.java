package AlgorithmPractice.Dynamic;

// 문제 : 개미전사
// 문제 해결 방법 : i번째 식량창고에 대해서 털지 안 털지의 여부를 결정
// 유의사항 : 최적 부분 구조 확인, 중복되는 부분 문제 확인, 약탈 여부를 점화식으로 결정

import java.util.Scanner;

public class 개미전사 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        // 창고의 수 입력
        int warehouseCount = scanner.nextInt();
        // 창고 만들기 & 테이블 만들기
        int warehouses[] = new int[warehouseCount];
        int foods[] = new int[warehouseCount];
        // 각 창고의 식량 수
        for(int idx=0; idx<warehouseCount; idx++) {
            warehouses[idx] = scanner.nextInt();
        }
        // 기본 값 설정
        foods[0] = warehouses[0];
        foods[1] = warehouses[1];

        // 창고별 약탈 가능한 최적의 수 찾기
        for(int idx=2; idx<warehouseCount; idx++) {
            foods[idx] = Math.max(warehouses[idx]+warehouses[idx-2],warehouses[idx-1]);
        }
        result = foods[warehouseCount-1];

        // 결과 출력
        System.out.println(result);
    }
}
