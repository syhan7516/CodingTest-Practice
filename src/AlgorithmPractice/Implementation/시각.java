package AlgorithmPractice.Implementation;

// 문제 : 시각
// 문제 해결 방법 : 가능한 모든 시각의 경우를 하나씩 모두 세어 풀기
// 유의사항 : 시는 23까지, 분과 초는 59까지

import java.util.Scanner;

public class 시각 {

    // "3" 포함 확인 함수
    static boolean timeCheck(int h, int m, int s) {
        // 십의 자리 및 일의 자리에 "3" 포함 확인
        if(h%10==3 || m/10==3 || m%10==3 || s/10==3 || s%10==3)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 기준 시간 입력
        int hour = scanner.nextInt();
        int count = 0;
        // 모든 시각 조회
        for(int h=0; h<=hour; h++) {
            for(int m=0; m<=59; m++) {
                for(int s=0; s<=59; s++) {
                    // 매 시각 안에 "3"이 포함된 경우
                    if(timeCheck(h,m,s)) count += 1;
                }
            }
        }

        // 결과 출력
        System.out.println(count);
    }
}
