package AlgorithmStudy.day1.알고리즘기초;

// 주제 : 정렬의 특성 활용 - 빈도 구하기(인접인덱스)
// 내용 : 정렬된 배열에서 빈도를 구하하는 프로그램 작성
// 방법 : 정렬의 특성을 잘 활용하기
// 특성 :
//  1.기준 데이터로 앞의 데이터와 뒤의 데이터 유추 가능
//  2.동일 값을 가지는 데이터는 반드시 인접

import java.util.Arrays;

public class 빈도구하기_인접인덱스 {
    // 데이터 값
    public static int numbers[] = {1,7,13,8,9,14,7,1,9,3,7,6,11,13,1,7};
    // 빈도 수 저장 배열
    public static int result[];

    public static void main(String[] args) {
        // 배열 정렬
        Arrays.sort(numbers);
        // 값 저장 변수 초기화
        int count = 1;
        int prev = numbers[0];
        // 배열 확인
        for(int idx=1; idx<numbers.length; idx++) {
            int number = numbers[idx];
            // 이전 데이터와 같은 경우
            if(number==prev) {
                count++;
            }
            // 이전 데이터와 다를 경우
            else {
                System.out.println(prev+" : "+count);
                count = 1;
                prev = number;
            }
            // 마지막 데이터인 경우
            if(idx==numbers.length-1)
                System.out.println(prev+" : "+count);
        }
    }
}
