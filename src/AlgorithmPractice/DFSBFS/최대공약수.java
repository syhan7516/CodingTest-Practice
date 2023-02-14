package AlgorithmPractice.DFSBFS;

// 문제 : 최대공약수 (유클리드 호제법)
// 문제 해결 방법 : A, B 최대공약수는 B와 A, B의 나머지 값의 최대공약수와 동일
// 유의사항 : 반복 작업에 대한 종료 조건 파악

public class 최대공약수 {

    // 최대공약수 함수
    static int gcd(int num1, int num2) {
        // 종료 조건
        if(num1%num2==0) return num2;

        // 재귀적 호출
        return gcd(num2,num1%num2);
    }

    public static void main(String[] args) {
        // 최대공약수 함수 호출
        int result = gcd(192,162);

        // 결과 출력
        System.out.println("최대공약수 : "+result);
    }
}
