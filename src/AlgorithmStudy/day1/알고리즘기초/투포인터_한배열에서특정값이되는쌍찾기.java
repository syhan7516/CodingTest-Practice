package AlgorithmStudy.day1.알고리즘기초;

// 주제 : 정렬의 특성 활용 - 투포인터_한 배열에서 특정 값이 되는 쌍 찾기 (값 중복 X)
// 내용 : 한 배열에서 특정 값이 되는 쌍을 찾을 때 정렬된 상태로 수행
// 방법 : 정렬의 특성을 잘 활용하기
// 특성 :
//  1.기준 데이터로 앞의 데이터와 뒤의 데이터 유추 가능
//  2.동일 값을 가지는 데이터는 반드시 인접

import java.util.ArrayList;
import java.util.Scanner;

public class 투포인터_한배열에서특정값이되는쌍찾기 {

    // 같은 값 저장 리스트
    public static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    // 특정 값을 이루는 쌍 리스트
    public static ArrayList<Integer> pair;
    // 특정 값이 되는 쌍을 찾을 배열
    public static int numbers[] = {1,2,4,7,8,9,13,15,18,19,22,24,27,29,37,41};
    // 포인터 설정
    public static int firPoint;
    public static int secPoint;
    // 찾을 특정 값
    public static int searchNum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 특정 값 입력
        searchNum = scanner.nextInt();

        // 포인터 위치 지정
        firPoint = 0;
        secPoint = numbers.length-1;

        // 특정 값 찾기
        while(firPoint < secPoint) {
            // 포인터들이 가리키는 수의 합
            int pointSum = numbers[firPoint] + numbers[secPoint];

            // 특정 값을 찾을 경우
            if(pointSum == searchNum) {
                pair = new ArrayList<>();
                pair.add(numbers[firPoint]);
                pair.add(numbers[secPoint]);
                result.add(pair);
                firPoint++;
                secPoint--;
            }

            // 특정 값보다 클 경우
            else if(pointSum > searchNum) {
                secPoint--;
            }

            // 특정 값보다 작을 경우
            else {
                firPoint++;
            }
        }

        // 결과 출력
        for(int a=0; a<result.size(); a++) {
            for(int b=0; b<result.get(a).size(); b++)
                System.out.print(result.get(a).get(b)+" ");
            System.out.println();
        }
    }
}
