package 알고리즘1.Implementation;

// 문제 : 왕실의 나이트
// 문제 해결 방법 : 요구사항대로 구현
// 유의사항 : 방향 벡터 설정, 방향 이동에 대한 좌표 제한 설정, 8가지 경로 파악

import java.util.Scanner;

public class 왕실의나이트 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 현재 나이트의 위치 입력
        String point = scanner.next();
        int count = 0;
        int row = point.charAt(1) - 48;
        int col = point.charAt(0) - 96;

        // 8가지 방향 정의
        int [] dx = {2,2,1,-1,-2,-2,-1,1};
        int [] dy = {-1,1,2,2,-1,1,-2,-2};

        // 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        for(int moveIdx=0; moveIdx<8; moveIdx++) {
            int nextX = col + dx[moveIdx];
            int nextY = row + dy[moveIdx];

            // 방향 이동에 대한 좌표 제한 확인
            if(nextX < 1 || nextX > 8 || nextY < 1 || nextY > 8) continue;
            count += 1;
        }

        // 결과 출력
        System.out.println(count);
    }
}
