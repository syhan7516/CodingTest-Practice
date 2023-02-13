package AlgorithmStudy.day1.알고리즘기초;

// 주제 : 정렬의 특성 활용 - 투포인터_두 배열 같은 값 찾기 (값 중복 X)
// 내용 : 두 배열 같은 값을 찾을 때 정렬된 상태로 수행
// 방법 : 정렬의 특성을 잘 활용하기
// 특성 :
//  1.기준 데이터로 앞의 데이터와 뒤의 데이터 유추 가능
//  2.동일 값을 가지는 데이터는 반드시 인접

import java.util.ArrayList;

public class 투포인터_두배열같은값찾기 {

    // 같은 값 저장 리스트
    public static ArrayList<Integer> result = new ArrayList<>();
    // 같은 값을 찾을 두 배열
    public static int firstNumbers[] = {1,2,4,7,8,9,13,15,18,19,22,24,27,29,37,41};
    public static int secondNumbers[] = {2,5,6,8,9,10,11,13,17,19,20,21,23,24,26,29};

    public static void main(String[] args) {
        // 포인터 및 카운터 설정
        int firstPoint = 0;
        int secondPoint = 0;

        while(firstPoint<firstNumbers.length && secondPoint<secondNumbers.length) {
            // 포인터 설정
            int firNum = firstNumbers[firstPoint];
            int secNum = secondNumbers[secondPoint];

            // 같은 값을 찾을 경우
            if(firNum == secNum) {
                result.add(firNum);
                firstPoint++;
                secondPoint++;
            }

            // 첫 번째 배열의 값이 더 클 경우
            else if(firNum>secNum) {
                secondPoint++;
            }

            // 첫 번째 배열의 값이 더 작을 경우
            else {
                firstPoint++;
            }
        }

        // 결과 출력
        for(int element: result)
            System.out.print(element+" ");
        System.out.println();
        System.out.println("쌍의 수 : "+result.size());
    }
}
