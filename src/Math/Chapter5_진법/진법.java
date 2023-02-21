package Math.Chapter5_진법;

// 주제 : 진법
// 내용 : 진법이란 특정 숫자 몇 개를 사용하여 수를 표시하는 방법
// 방법 :
//  1.10진법에서 어떤 진법 변환 - Integer.toString(숫자,변경할진법) 메소드 활용
//  2.어떤 진법에서 10진법 - Integer.parseInt(문자열,현재진법) 메소드 활용
// 실습 : 입력받은 수를 2,8,16진법으로 변환 후 다시 10진법으로 변환

import java.util.Scanner;

public class 진법 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자 입력
        int num = scanner.nextInt();

        // 진법별 변환
        String bin = Integer.toString(num,2);
        String oct = Integer.toString(num,8);
        String hex = Integer.toString(num,16);

        System.out.println("2진법 : " + bin);
        System.out.println("8진법 : " + oct);
        System.out.println("16진법 : " + hex);

        System.out.println("---------------------------------");

        // 10진법으로 변환
        System.out.println("2진법 → 10진법 : " + Integer.parseInt(bin,2));
        System.out.println("8진법 → 10진법 : " + Integer.parseInt(oct,8));
        System.out.println("16진법 → 10진법 : " + Integer.parseInt(hex,16));
    }
}
