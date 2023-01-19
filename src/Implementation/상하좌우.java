package Implementation;

// 문제 : 상하좌우
// 문제 해결 방법 : 요구사항대로 구현
// 유의사항 : 방향벡터 설정, 방향 이동에 대한 좌표 제한 설정

import java.util.Scanner;

public class 상하좌우 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 맵 크기 입력
        int mapSize = scanner.nextInt();
        // 버퍼 비우기
        scanner.nextLine();
        // 이동 키 입력
        String [] moveKeys = scanner.nextLine().split(" ");

        // 초기 좌표 값
        int x = 1;
        int y = 1;
        // 방향 벡터 설정
        int [] dx = {1,0,-1,0};
        int [] dy = {0,1,0,-1};
        // 이동 키 타입
        String [] moveKey = {"R","D","L","U"};

        // 입력받은 키 확인
        for(int moveIdx=0; moveIdx<moveKeys.length; moveIdx++) {
            int nextX = -1;
            int nextY = -1;
            // 키 확인 후 이동 방향 설정
            for(int keyIdx=0; keyIdx<4; keyIdx++) {
                if (moveKeys[moveIdx].equals(moveKey[keyIdx])) {
                    nextX = x + dx[keyIdx];
                    nextY = y + dy[keyIdx];
                }
            }
            // 이동 방향에 대한 공간 좌표 확인
            if(nextX < 1 || nextX > mapSize || nextY < 1 || nextY > mapSize)
                continue;
            // 이동 수행
            else {
                x = nextX;
                y = nextY;
            }
        }

        // 결과 출력
        System.out.println(y+" "+x);
    }
}
