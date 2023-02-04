package AlgorithmStudy.day1.알고리즘기초;

// 주제 : 정렬의 특성 활용 - 빈도 구하기(체크배열)
// 내용 : 정렬된 배열에서 빈도를 구하하는 프로그램 작성
// 방법 : 정렬의 특성을 잘 활용하기
// 특성 :
//  1.기준 데이터로 앞의 데이터와 뒤의 데이터 유추 가능
//  2.동일 값을 가지는 데이터는 반드시 인접

import java.util.Arrays;

public class 빈도구하기_체크배열 {
    // 데이터 값
    public static int numbers[] = {1,7,13,8,9,14,7,1,9,3,7,6,11,13,1,7};
    // 빈도 수 저장 배열
    public static int result[];

    public static void main(String[] args) {
        // 배열 정렬
        Arrays.sort(numbers);
        // 빈도 수 저장 배열 크기 정하기
        int size = numbers[numbers.length-1];
        result = new int[size+1];
        // 빈도 수 저장 배열 초기화
        for(int idx=0; idx<result.length; idx++) {
            result[idx] = 0;
        }
        // 빈도 수 저장
        for(int idx=0; idx<numbers.length; idx++) {
            int number = numbers[idx];
            result[number] += 1;
        }

        // 결과 출력
        for(int idx=0; idx<result.length; idx++) {
            if(result[idx] != 0) {
                System.out.println(idx+" : "+result[idx]);
            }
        }
    }
}