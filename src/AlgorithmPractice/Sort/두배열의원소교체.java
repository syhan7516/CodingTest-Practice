package AlgorithmPractice.Sort;

// 문제 : 두 배열의 원소 교체
// 문제 해결 방법 : 매번 A에서는 가장 작은 원소, B에서는 가장 큰 원소를 교체
// 유의사항 : 비교를 위한 배열 정렬, 바꿔치기는 A의 원소가 B의 원소보다 보다 작을 경우로 제한

import java.util.Arrays;
import java.util.Scanner;

public class 두배열의원소교체 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;

        // 배열 크기 & 바꿔치기 수 입력
        int size = scanner.nextInt();
        int changeCount = scanner.nextInt();

        // 배열 A, B 입력
        int [] A = new int[size];
        int [] B = new int[size];
        for(int idx=0; idx<size; idx++) { A[idx] = scanner.nextInt(); }
        for(int idx=0; idx<size; idx++) { B[idx] = scanner.nextInt(); }

        // 각 배열 정렬
        Arrays.sort(A);
        Arrays.sort(B);

        // A는 가장 작은 값, B는 가장 큰 값 교환
        for(int idx=0; idx<changeCount; idx++) {
            // A의 원소가 B의 원소보다 작은 경우
            if(A[idx] < B[B.length-1-idx]) {
                // 바꿔치기 수행
                int swapNum = A[idx];
                A[idx] = B[B.length-1-idx];
                B[B.length-1-idx] = swapNum;
            }
            // A의 원소가 B의 원소보다 크거나 같을 경우
            else break;
        }

        // 합구하기
        for(int idx=0; idx<A.length; idx++) {
            result += A[idx];
        }

        // 결과 출력
        System.out.println(result);
    }
}