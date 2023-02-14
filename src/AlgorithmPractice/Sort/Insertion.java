package AlgorithmPractice.Sort;

// 주제 : 삽입 정렬
// 내용 : 처리되지 않은 데이터를 하나씩 골라 적절한 위치에 삽입하는 방법으로 정렬
// 시간복잡도 : O(N^2), 이미 정렬되어 있을수록 더 빠르게 동작 O(N)
// 순서 :
// 1.첫 번째 데이터는 정렬이 되어 있다고 판단
// 2.다음 데이터부터 첫 번째 데이터까지 해당 데이터의 위치를 확인
// 3.자신보다 작은 데이터 존재 시 교환 후 종료
// 4.마지막 데이터 확인이 끝날 때까지 2~3번을 반복

public class Insertion {
    public static void main(String[] args) {
        // 정렬되지 않은 정수 배열
        int [] numbers = {7,5,9,0,3,1,6,2,4,8};

        // 삽입 정렬
        for(int a=1; a<numbers.length; a++) {
            for(int b=a; b>0; b--) {
                // 자신보다 큰 데이터인 경우
                if(numbers[b] < numbers[b-1]) {
                    int swapNum = numbers[b];
                    numbers[b] = numbers[b-1];
                    numbers[b-1] = swapNum;
                }
                // 자신보다 작은 데이터인 경우
                else break;
            }
        }

        // 결과 출력
        for(int element: numbers) {
            System.out.print(element+" ");
        }
    }
}