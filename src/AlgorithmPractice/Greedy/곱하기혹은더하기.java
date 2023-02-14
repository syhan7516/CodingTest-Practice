package AlgorithmPractice.Greedy;

// 문제 : 곱하기 혹은 더하기
// 문제 해결 방법 : 최대한 많이 * 연산 수행
// 정당성 분석 : *가 +보다 더 값을 크게 만듦으로 두 수 중 하나라도 0, 1이 아니면 다 곱하여 값을 크게 가능

import java.util.Scanner;

public class 곱하기혹은더하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자 형태의 문자열 입력
        String letterTypeNum = scanner.next();
        // 문자열 분리 후 배열에 저장
        String [] letterTypeNums = letterTypeNum.split("");

        int result = Integer.parseInt(letterTypeNums[0]);
        for(int idx=1; idx<letterTypeNums.length; idx++) {
            int number = Integer.parseInt(letterTypeNums[idx]);

            // 두 수 중 하나라도 0, 1인 경우
            if(result <= 1 || number <= 1) {
                result += number;
            }
            // 두 수 중 하나라도 0, 1이 아닌 경우
            else {
                result *= number;
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}
