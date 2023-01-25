package Sort;

// 주제 : 퀵 정렬
// 내용 : 기준을 설정하고 그 기준보다 큰 데이터와 작은 데이터의 위치를 바꾸며 정렬하는 방법
// 시간복잡도 : O(NlogN), 이미 정렬되어 있을수록 더 느리게 동작 O(N^2)
// 순서 :
// 1.범위 내 첫 번째 값을 기준(피봇)으로 설정
// 2.범위 내 두 번째 데이터를 왼쪽 인덱스, 마지막 데이터를 오른쪽 인덱스로 설정
// 3.기준 값보다 크거나 같을 때까지 왼쪽 인덱스를 증가, 작거나 같을 때까지 오른쪽 인덱스를 감소
// 4.왼쪽 범위의 데이터 값과 오른쪽 범위의 데이터 값을 교환
// 5.왼쪽 인덱스와 오른쪽 인덱스가 서로 엇갈리(왼쪽 인덱스가 오른쪽 인덱스보다 클 때) 때까지 3~4번 반복
// 6.기준 값과 작은 데이터를 서로 교환
// 7.분할했을 때 시작점이 끝점보다 크거나 같을 때까지 기준의 왼쪽, 오른쪽 묶음으로 분할하여 위의 작업 반복

public class Quick {
    // 퀵 정렬 함수 정의
    static void quickSort(int [] numbers, int start, int end) {
        // 분할 종료 조건
        if(start>=end) return;

        // 기준점, 왼쪽 & 오른쪽 인덱스 설정
        int pivot = start;
        int left = start+1;
        int right = end;

        // 분할된 범위 탐색 종료 조건
        while(left<=right) {
            // 왼쪽 탐색 종료 조건
            while(left <= end && numbers[left] <= numbers[pivot]) { left += 1; }
            // 오른쪽 탐색 종료 조건
            while(right > start && numbers[right] >= numbers[pivot]) { right -= 1; }

            // 왼쪽 인덱스와 오른쪽 인덱스가 서로 엇갈릴 경우
            if(left>right) {
                int swapNum = numbers[right];
                numbers[right] = numbers[pivot];
                numbers[pivot] = swapNum;
            }
            // 왼쪽 인덱스와 오른쪽 인덱스가 서로 엇갈리지않을 경우
            else {
                int swapNum = numbers[left];
                numbers[left] = numbers[right];
                numbers[right] = swapNum;
            }
        }

        // 분할 정렬 결과
        System.out.print("범위("+start+","+end+")정렬 : ");
        for(int element: numbers) {
            System.out.print(element+" ");
        }
        System.out.println();

        // 분할하여 퀵 정렬 함수 호출
        quickSort(numbers,start,right-1);
        quickSort(numbers,right+1,end);
    }

    public static void main(String[] args) {
        // 정렬되지 않은 정수 배열
        int [] numbers = {7,5,9,0,3,1,6,2,4,8};

        // 퀵 정렬 함수 호출
        quickSort(numbers,0,numbers.length-1);
    }
}
