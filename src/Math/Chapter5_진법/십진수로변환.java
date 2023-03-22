package Math.Chapter5_진법;

// 주제 : 진법
// 내용 : 진법이란 특정 숫자 몇 개를 사용하여 수를 표시하는 방법
// 방법 :
//  - 어떤 진법에서 10진법으로 변환
//  1.각 자리 수에 (B^(자리수-1)) 곱하기
// 실습 : 다른 진법의 수를 10진법으로 변환

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 십진수로변환 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 진법과 해당 진법의 수 입력
        int radix = Integer.parseInt(st.nextToken());
        String nums = st.nextToken();

        // 진법 변환
        int number = 0;
        int power = nums.length()-1;
        for(int n=0; n<nums.length(); n++) {
            char num = nums.charAt(n);
            // 10 이상일 경우
            if(num <= 'A' && num >= 'Z') {
                number += (num-55) * Math.pow(radix,power--);
            }
            // 아닐 경우
            else {
                number += (num-'0') * Math.pow(radix,power--);
            }
        }

        // 결과 출력
        System.out.println(number);
    }
}