package Math.Chapter1_약수와소수;

// 주제 : 약수
// 내용 : 약수란 어떤 수를 나누어떨어지게 하는 수
// 방법 :
//  1.1부터 주어진 수까지 입력 수를 나누기
//  2.나누어 떨어진다면 해당 수는 입력 수의 약수
// 실습 : 입력한 숫자의 약수 출력

import java.util.Scanner;

public class 약수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 0보다 큰 정수 입력
        int number = scanner.nextInt();

        // 1 ~ 입력 수까지 나누어 약수 찾기
        for(int idx=1; idx<=number; idx++) {
            if(number%idx==0)
                System.out.println(number + "의 약수 : " + idx);
        }
    }
}
