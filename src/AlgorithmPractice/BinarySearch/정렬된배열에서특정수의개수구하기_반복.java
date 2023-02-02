package AlgorithmPractice.BinarySearch;

// 문제 : 정렬된 배열에서 특정 수의 개수 구하기
// 문제 해결 방법 : 특정 값이 등장하는 첫 번째 위치와 마지막 위치를 찾아 차이를 계산
// 유의사항 : 탐색 종료 조건과 특정 수의 탐색 조건 유의

import java.util.Scanner;

public class 정렬된배열에서특정수의개수구하기_반복 {

    // 처음 위치를 찾는 함수 정의
    static int getLeftIdx(int dataArr[], int target, int start, int end) {
        while(start<end) {
            int mid = (start+end)/2;
            if(dataArr[mid]>=target) end = mid;
            else start = mid+1;
        }
        return end;
    }

    // 마지막 위치를 찾는 함수 정의
    static int getRightIdx(int dataArr[], int target, int start, int end) {
        while(start<end) {
            int mid = (start+end)/2;
            if(dataArr[mid]>target) end = mid;
            else start = mid+1;
        }
        return end;
    }

    // 특정 수 개수를 찾는 함수 정의
    static int getCount(int dataArr[], int target, int start, int end) {
        int leftIdx = getLeftIdx(dataArr,target,start,end);
        int rightIdx = getRightIdx(dataArr,target,start,end);
        return rightIdx-leftIdx;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 데이터 개수 & 특정 수 입력
        int dataCount = scanner.nextInt();
        int number = scanner.nextInt();

        // 데이터 입력
        int dataArr[] = new int[dataCount];
        for(int idx=0; idx<dataArr.length; idx++) {
            dataArr[idx] = scanner.nextInt();
        }

        // 특정 수의 개수를 구하는 함수 호출
        int result = getCount(dataArr,number,0,dataArr.length-1);

        // 결과 출력
        System.out.println(result);

        scanner.close();
    }
}
