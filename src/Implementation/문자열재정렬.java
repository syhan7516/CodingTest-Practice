package Implementation;

// 문제 : 문자열 재정렬
// 문제 해결 방법 : 요구사항대로 구현
// 유의사항 : 타입별 저장, 타입 변환, 문자열로 연결

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 문자열재정렬 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력
        String letters = scanner.next();
        List<Character> letter = new ArrayList<>();
        String result = "";
        int numSum = 0;
        
        // 문자를 하나씩 확인
        for(int idx=0; idx<letters.length(); idx++) {
            char target = letters.charAt(idx);
            // 문자가 숫자인 경우
            if(target >= 48 && target <= 57) {
                numSum += target - 48;
            }
            // 문자가 문자인 경우
            else { letter.add(target); }
        }

        // 오름차순 정렬
        Collections.sort(letter);
        // 문자를 문자열로 합치기
        for(char element: letter) {
            result += element;
        }
        // 숫자들의 합 문자열로 연결
        result += Integer.toString(numSum);

        // 결과 출력
        System.out.println(result);
    }
}
