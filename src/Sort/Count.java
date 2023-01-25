package Sort;

// 주제 : 계수 정렬
// 내용 : 특정한 조건(데이터의 크기 범위가 제한된 정수 형태)이 부합할 때만 사용할 수 있는 매우 빠르게 동작하는 정렬 알고리즘
// 시간복잡도 : O(N+K)
// 순서 :
// 1.가장 작은 데이터부터 가장 큰 데이터까지의 범위가 모두 담길 수 있는 공간 생성
// 2.데이터를 하나씩 확인하며 값과 동일한 인덱스의 데이터를 1씩 증가시키기
// 3.공간에서 첫 번째 데이터부터 하나씩 그 값만큼 반복하여 인덱스를 출력


public class Count {
    public static void main(String[] args) {
        // 정렬되지 않은 정수 배열
        int [] numbers = {7,5,9,0,3,1,6,2,9,1,4,8,0,5,2};

        // 정수 값들 중 최대 값
        int maxNum = 9;

        // 범위 내 모든 수가 담길 수 있는 공간 생성 후 초기화
        int [] numCount = new int[maxNum+1];
        for(int idx=0; idx<numCount.length; idx++) {
            numCount[idx] = 0;
        }

        // 데이터를 하나씩 확인 & 인덱스 데이터 증가시키기
        for(int idx=0; idx<numbers.length; idx++) {
            int number = numbers[idx];
            numCount[number] += 1;
        }

        // 정렬 결과 출력
        for(int idx=0; idx<numCount.length; idx++) {
            for(int cnt=0; cnt<numCount[idx]; cnt++) {
                System.out.print(idx+" ");
            }
        }
    }
}
