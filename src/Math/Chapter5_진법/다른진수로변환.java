package Math.Chapter5_진법;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주제 : 진법
// 내용 : 진법이란 특정 숫자 몇 개를 사용하여 수를 표시하는 방법
// 방법 :
//  - 10진법에서 어떤 진법 변환
//  1.N을 B로 더 이상 나눌 수 없을 때 까지 나누기
//  2.나눌 때 마다 나머지를 기록
//  3.기록한 나머지를 거꾸로 출력
// 실습 : 10진법의 수를 다른 진법의 수로 변환

public class 다른진수로변환 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 수, 바꿀 진수 입력
        long number = Integer.parseInt(st.nextToken());
        int radix = Integer.parseInt(st.nextToken());

        // 수가 0일 경우
        if(number==0) {
            System.out.println(0);
        }

        // 아닐 경우
        else {
            // 나누기
            while(number!=0) {
                long remainder = number%radix;

                // 나머지 값이 10이상인 경우
                if(remainder>9)
                    sb.insert(0,(char)(remainder+55));
                // 나머지 값이 9이하인 경우
                else {
                    sb.insert(0,remainder);
                }

                // 다음 연산으로 진행
                number /= radix;
            }
        }

        // 결과 출력
        System.out.println(sb);
    }
}
