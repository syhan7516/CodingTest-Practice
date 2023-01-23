package Sort;

// 주제 : 선택 정렬
// 내용 : 처리되지 않은 데이터 중에서 가장 작은 데이터를 선택해 범위 맨 앞에 있는 데이터와 바꾸는 방법으로 정렬
// 시간복잡도 : O(N^2)
// 순서 :
// 1.처리되지 않은 데이터 중 가장 작은 데이터를 선택
// 2.해당 범위에서 가장 앞에 존재하는 데이터와 교환
// 3.데이터가 다 처리될 때까지 1~2번 반복

public class Selection {
    public static void main(String[] args) {
        // 정렬되지 않은 정수 배열
        int [] numbers = {7,5,9,0,3,1,6,2,4,8};

        // 선택 정렬
        for(int a=0; a<numbers.length-1; a++) {
            // 가장 작은 데이터의 인덱스
            int minNumIdx=a;
            for(int b=a+1; b<numbers.length; b++) {
                if(numbers[minNumIdx] > numbers[b]) {
                    minNumIdx = b;
                }
            }
            // 데이터 교환
            int swapNum = numbers[a];
            numbers[a] = numbers[minNumIdx];
            numbers[minNumIdx] = swapNum;
        }

        // 결과 출력
        for(int element: numbers) {
            System.out.print(element+" ");
        }
    }
}