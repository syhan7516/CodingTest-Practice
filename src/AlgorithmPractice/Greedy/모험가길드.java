package AlgorithmPractice.Greedy;

// 문제 : 모험가 길드
// 문제 해결 방법 : 현재 그룹에 포함된 모험가의 수가 현재 확인하고 있는 공포도보다 크거나 같다면 그룹화
// 정당성 분석 : 오름차순으로 정렬하여 항상 최소한의 모험가의 수만 포함하여 그룹 결성 가능

import java.util.Arrays;
import java.util.Scanner;

public class 모험가길드 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 인원 수 입력 & 수만큼 배열 생성
        int human = scanner.nextInt();
        int [] degree = new int[human];
        // 인원별 공포도 입력
        for(int idx=0; idx<degree.length; idx++) {
            degree[idx] = scanner.nextInt();
        }
        // 오름차순 정렬
        Arrays.sort(degree);
        // 총 그룹의 수
        int group = 0;
        // 현재 포함된 모험가의 수
        int count = 0;
        for(int element: degree) {
            // 모험가 수 추가
            count += 1;
            // 그룹 결성 조건
            if(count >=element) {
                group += 1;
                count = 0;
            }
        }

        // 결과 출력
        System.out.println(group);
    }
}