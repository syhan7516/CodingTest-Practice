package AlgorithmPractice.BinarySearch;

// 문제 : 떡볶이 떡 만들기
// 문제 해결 방법 : 적절한 높이를 찾을 때까지 이진 탐색을 수행하여 높이 조정하기
// 유의사항 : 이진 탐색을 절단기 높이 조정에 적용, 절단기 높이보다 아래 떡 길이 유의, 절단기 높이의 최댓값 탐색

import java.util.Scanner;

public class 떡볶이떡만들기_반복 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 떡 개수 & 떡 주문 길이 입력
        int riceCakeCnt = scanner.nextInt();
        int riceCakeLen = scanner.nextInt();

        // 떡 길이 정보 입력
        int [] riceCakeLens = new int[riceCakeCnt];
        for(int idx=0; idx<riceCakeCnt; idx++) {
            riceCakeLens[idx] = scanner.nextInt();
        }

        // 이진 탐색 기본 설정
        int start = 0;
        int end = (int)1e9;
        int result = 0;

        // 이진 탐색 반복문 수행
        while(start<=end) {
            long totalLen = 0;
            int mid = (start+end)/2;
            // 떡 자르기
            for(int idx=0; idx<riceCakeLens.length; idx++) {
                if(riceCakeLens[idx] > mid) {
                    totalLen += riceCakeLens[idx]-mid;
                }
            }

            // 자른 결과 확인

            // 떡의 양이 부족한 경우
            if(totalLen<riceCakeLen) {
                end = mid-1;
            }
            // 떡의 양이 충분한 경우
            else {
                result = mid;
                start = mid+1;
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}
