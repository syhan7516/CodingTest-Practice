package BinarySearch;

// 주제 : BinarySearch
// 내용 : 정렬되어 있는 데이터들에 탐색 범위를 절반씩 좁혀가며 데이터를 탐색하는 방법
// 순서 :
// 1.정렬되었는지 확인
// 2.시작점, 중간점((시작+끝)/2), 끝점 설정
// 3-1.찾고자하는 값이 중간점 값보다 크다면 시작점을 중간점 다음으로 설정 후 다시 탐색
// 3-2.찾고자하는 값이 중간점 값보다 작다면 끝점을 중간점 이전으로 설정 후 다시 탐색
// 4.중간 값이 찾고자하는 값이거나, 시작점 위치가 끝점 위치보다 커질 때까지 2~3번 반복

import java.util.Scanner;

public class BinarySearch_반복 {

    // 이진 탐색 함수 정의
    static int binarySearch(int[] numbers, int target, int start, int end) {
        while (start <= end) {
            // 중간점 설정
            int mid = (start + end) / 2;

            // 찾고자하는 값을 찾은 경우
            if (numbers[mid] == target)
                return mid;
                // 찾고자하는 값이 중간점 값보다 큰 경우
            else if (numbers[mid] < target) {
                start = mid + 1;
            }
            // 찾고자하는 값이 중간점 값보다 작은 경우
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정렬된 정수 배열
        int[] numbers = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};

        // 찾을 번호 입력
        int findNum = scanner.nextInt();

        // 이진 탐색 호출
        int result = binarySearch(numbers, findNum, 0, numbers.length - 1);

        // 결과 출력
        if(result == -1)
            System.out.println("찾고자하는 값이 없습니다.");
        else
            System.out.println("찾고자하는 값의 위치는 : "+(result+1)+"번째");
    }
}