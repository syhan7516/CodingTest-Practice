package AlgorithmStudy.day1.알고리즘기초;

// 주제 : 정렬의 특성 활용 - 유일성 검사
// 내용 : 정렬된 배열에서 유일성을 검사하는 프로그램 작성
// 방법 : 정렬의 특성을 잘 활용하기
// 특성 :
//  1.기준 데이터로 앞의 데이터와 뒤의 데이터 유추 가능
//  2.동일 값을 가지는 데이터는 반드시 인접

import java.util.ArrayList;
import java.util.List;

public class 유일성검사 {

    // 데이터 값
    public static int numbers[] = {1,1,3,3,6,7,11,11,16,21,21,37,37,37,39,40};
    // 결과 리스트
    public static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {

        // 이전 데이터 저장할 변수
        int prev = numbers[0];
        result.add(prev);

        // 유일성 검사
        for(int idx=1; idx<numbers.length; idx++) {
            if(prev != numbers[idx]) {
                result.add(numbers[idx]);
                prev = numbers[idx];
            }
        }

        // 결과 출력
        System.out.print("유일성 검사 후 : "+" ");
        for(int element: result) System.out.print(element+" ");
        System.out.println();
    }
}
