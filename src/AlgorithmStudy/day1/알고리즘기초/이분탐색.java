package AlgorithmStudy.day1.알고리즘기초;

// 주제 : 정렬의 특성 활용 - 이분 탐색
// 내용 : 정렬된 배열에서 데이터의 위치를 찾는 프로그램 작성
// 방법 : 정렬의 특성을 잘 활용하기
// 특성 :
//  1.기준 데이터로 앞의 데이터와 뒤의 데이터 유추 가능
//  2.동일 값을 가지는 데이터는 반드시 인접

import java.util.Scanner;

public class 이분탐색 {
    // 탐색 데이터
    public static int searchNum;
    // 데이터
    public static int numbers[] = {1,2,4,7,8,9,13,15,18,19,22,24,27,29,37};

    // 이분 탐색 함수 정의
    static int binarySearch(int start, int end) {

        while (start <= end) {
            // 중간점 설정
            int mid = (start + end) / 2;

            // 찾고자하는 값을 찾은 경우
            if (numbers[mid] == searchNum)
                return mid;

            // 찾고자하는 값이 중간점 값보다 큰 경우
            else if (numbers[mid] > searchNum)
                end = mid - 1;

            // 찾고자하는 값이 중간점 값보다 작은 경우
            else
                start = mid + 1;
        }

        // 찾고자하는 값이 없는 경우
        return -1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 탐색 번호 입력
        searchNum = scanner.nextInt();

        // 이분 탐색 수행
        int result = binarySearch(0,numbers.length-1);

        // 결과 출력
        if(result==-1)
            System.out.println("데이터가 없습니다.");
        else
            System.out.println((result+1)+"번째 위치에 있습니다.");
    }
}
