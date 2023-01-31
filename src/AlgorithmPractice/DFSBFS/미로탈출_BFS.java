package 알고리즘1.DFSBFS;

// 문제 : 미로 탈출
// 문제 해결 방법 : DFS, BFS로 1,1 지점부터 모든 노드의 최단 거리 값을 기록하면서 이동 & 탐색
// 유의사항 : 주어진 범위 내에서 탐색/방향 정보를 bfs에 적용(탐색 제한 설정, 방문 처리, 거리 정보 기록)

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 노드 클래스 정의
class MiroNode {
    private int x;
    private int y;

    public MiroNode(int y, int x) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class 미로탈출_BFS {

    // bfs 함수 정의
    static int bfs(int row, int col, int [][]multi, boolean [][]visited) {
        int rowLen = multi.length;
        int colLen = multi[0].length;

        // 이동 방향 정보 설정 (우,하,좌,상)
        int [] dx = {1,0,-1,0};
        int [] dy = {0,1,0,-1};

        // 노드를 넣을 큐 생성
        Queue<MiroNode> qu = new LinkedList<>();
        // 현재 위치한 노드 삽입
        qu.offer(new MiroNode(row,col));
        // 현재 위치 방문 처리
        visited[row][col] = true;
        
        while(!qu.isEmpty()) {
            // 노드 꺼내기 & 좌표 가져오기
            MiroNode node = qu.poll();
            int x = node.getX();
            int y = node.getY();

            // 이동 가능한 방향 확인
            for(int dir=0; dir<4; dir++) {
                int nextX = x + dx[dir];
                int nextY = y + dy[dir];

                // 좌표를 벗어나는 경우
                if(nextX < 0 || nextX > colLen-1 || nextY < 0 || nextY > rowLen-1)
                    continue;
                // 이미 방문한 경우
                if(visited[nextY][nextX] == true)
                    continue;
                // 괴물이 존재하는 경우
                if(multi[nextY][nextX] == 0)
                    continue;

                // 이동 가능한 뱡향의 좌표에 거리 기록
                multi[nextY][nextX] += multi[y][x];
                // 이동 가능한 방향의 좌표 삽입
                qu.offer(new MiroNode(nextY,nextX));
                // 이동 가능한 방향의 좌표 방문 처리
                visited[nextY][nextX] = true;
            }
        }

        // 탈출로 좌표에 기록된 거리 반환
        return multi[rowLen-1][colLen-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 미로 크기 입력
        int rowSize = scanner.nextInt();
        int colSize = scanner.nextInt();
        int [][] multi = new int[rowSize][colSize];
        boolean [][] visited =  new boolean[rowSize][colSize];

        // 미로 생성
        scanner.nextLine();
        for(int r=0; r<rowSize; r++) {
            String [] monster = scanner.nextLine().split("");
            for(int c=0; c<colSize; c++) {
                multi[r][c] = Integer.parseInt(monster[c]);
                visited[r][c] = false;
            }
        }

        // 미로 탐색 & 탈출구까지 거리 구하기
        int result = bfs(0,0,multi,visited);
        
        // 결과 출력
        System.out.println("미로 탈출 ! : "+result);
    }
}
