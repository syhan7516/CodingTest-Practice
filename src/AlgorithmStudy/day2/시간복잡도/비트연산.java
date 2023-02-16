package AlgorithmStudy.day2.시간복잡도;

// 주제 : 비트 연산
// 내용 : 비트 연산을 통한 타임컷팅
// 방법 : 나누기 & 나머지 연산을 비트를 옮겨 수행
// 특성 :
//  1.비트의 가장 뒷자리는 1
//  2.비트의 그 다음부터 2의 배수

import java.util.Scanner;

public class 비트연산 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자 입력
        int number = scanner.nextInt();

        // 2로 나눈 나머지 (0이면 짝, 1이면 홀)
        int modNumber = number & 1;
        System.out.println("2로 나눈 나머지 : "+modNumber);

        // 2로 나눈 몫
        int divNumber = number >> 1;
        System.out.println("2로 나눈 몫 : "+divNumber);
    }
}
