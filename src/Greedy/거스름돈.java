package Greedy;

// 문제 : 거스름돈
// 문제 해결 방법 : 가장 큰 화폐 단위부터 교환
// 정당성 분석 : 큰 단위가 항상 작은 단위의 배수
// 시간 복잡도 : 화폐의 종류만큼 복잡도에 영향 → O(N)

public class 거스름돈 {
    public static void main(String[] args) {
        int money = 1260;
        int count = 0;

        // 큰 단위의 화폐부터 차례대로 확인
        int [] moneyTypes = {500,100,50,10};

        // 화폐 종류별로 거슬러 줄 수 있는 동전 개수 세기
        for(int element: moneyTypes) {
            count += money/element;
            money %= element;
        }

        // 결과 출력
        System.out.println(count);
    }
}
