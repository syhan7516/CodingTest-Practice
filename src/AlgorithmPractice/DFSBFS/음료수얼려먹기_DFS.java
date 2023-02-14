package AlgorithmPractice.DFSBFS;

// 문제 : 음료수 얼려 먹기
// 문제 해결 방법 : DFS, BFS로 연결된 상하좌우 확인 후 연결 요소 개수 파악
// 유의사항 : 주어진 범위 내에서 탐색/방향 정보를 dfs에 적용(탐색 시작 조건 파악, 탐색 제한 설정, 방문 처리)

import java.util.Scanner;

public class 음료수얼려먹기_DFS {

    // dfs 함수 정의
    static void dfs(int row, int col, int[][]multi, boolean [][]visited) {
        int rowLen = multi.length;
        int colLen = multi[0].length;

        // dfs 탐색 중 주어진 범위에 대한 검사 & 제한
        if(row < 0 || row > rowLen-1 || col < 0 || col > colLen-1 || visited[row][col] == true || multi[row][col] == 1)
            return;

        // dfs 탐색 중 방문 처리 & 현재 위치에서 탐색
        visited[row][col] = true;
        dfs(row,col+1,multi,visited);
        dfs(row+1,col,multi,visited);
        dfs(row,col-1,multi,visited);
        dfs(row-1,col,multi,visited);
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
                    dfs(r,c,multi,visited);
                    count += 1;
                }
            }
        }

        // 결과 출력
        System.out.println("아이스크림 수 : "+count);
    }
}
