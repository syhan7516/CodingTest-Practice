package DFSBFS;

// 문제 : 음료수 얼려 먹기
// 문제 해결 방법 : DFS, BFS로 연결된 상하좌우 확인 후 연결 요소 개수 파악
// 유의사항 : 주어진 범위 내에서 탐색/방향 정보를 bfs에 적용(탐색 시작 조건 파악, 탐색 제한 설정, 방문 처리)

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 노드 클래스 정의
class Node {

    private int x;
    private int y;

    public Node(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class 음료수얼려먹기_BFS {

    // bfs 함수 정의
    static void bfs(int row, int col, int[][]multi, boolean[][]visited) {
        int rowLen = multi.length;
        int colLen = multi[0].length;

        // 이동 방향 정보 설정 (우,하,좌,상)
        int [] dx = {1,0,-1,0};
        int [] dy = {0,1,0,-1};

        // 노드를 넣을 큐 생성
        Queue<Node> qu = new LinkedList<>();
        // 현재 위치한 노드 삽입
        qu.offer(new Node(row,col));
        // 현재 위치 방문 처리
        visited[row][col] = true;

        while(!qu.isEmpty()) {
            // 노드 꺼내기 & 좌표 가져오기
            Node node = qu.poll();
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
                if(visited[nextY][nextX] == true || multi[nextY][nextX] == 1)
                    continue;

                // 이동 가능한 방향의 좌표 삽입
                qu.offer(new Node(nextY,nextX));
                // 이동 가능한 방향의 좌표 방문 처리
                visited[nextY][nextX] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 얼음 틀 크기 입력
        int count = 0;
        int rowSize = scanner.nextInt();
        int colSize = scanner.nextInt();
        int [][] multi = new int[rowSize][colSize];
        boolean [][] visited = new boolean[rowSize][colSize];

        // 얼음 틀 생성
        scanner.nextLine();
        for(int r=0; r<rowSize; r++) {
            String [] wall = scanner.nextLine().split("");
            for(int c=0; c<colSize; c++) {
                multi[r][c] = Integer.parseInt(wall[c]);
                visited[r][c] = false;
            }
        }

        // 얼음 틀 탐색 & 음료수 채우기
        for(int r=0; r<rowSize; r++) {
            for(int c=0; c<colSize; c++) {
                if(multi[r][c] == 0 && visited[r][c] == false) {
                    bfs(r, c, multi, visited);
                    count += 1;
                }
            }
        }

        // 결과 출력
        System.out.println("아이스크림 수 : "+count);
    }
}
