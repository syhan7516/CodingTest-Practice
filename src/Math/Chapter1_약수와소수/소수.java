package Math.Chapter1_약수와소수;

// 주제 : 소수
// 내용 : 소수란 1과 그 수 자신만을 약수로 가지는 수
// 방법 :
//  1.2부터 주어진 수-1까지 입력 수에 나누기
//  2.나누어지는 수가 있다면 합성수, 아니면 소수
// 실습 : 입력한 숫자까지의 소수 출력

import java.util.Scanner;

public class 소수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 0보다 큰 정수 입력
        int number = scanner.nextInt();

        // 2부터 입력 수까지
        for(int a=2; a<=number; a++) {
            boolean flag = true;
            // 해당 수 약수 확인
            for(int b=2; b<a; b++) {
                // 약수가 존재하는 경우
                if(a%b==0) {
                    flag = false;
                    break;
                }
            }
            // 결과 출력
            if(flag==false)
                System.out.println(a + " : 소수 X");
            else
                System.out.println(a + " : 소수 O");
        }
    }
}
