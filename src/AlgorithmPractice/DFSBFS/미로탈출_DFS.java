package AlgorithmPractice.DFSBFS;

// 문제 : 미로 탈출
// 문제 해결 방법 : DFS, BFS로 1,1 지점부터 모든 노드의 최단 거리 값을 기록하면서 이동 & 탐색
// 유의사항 : 주어진 범위 내에서 탐색/방향 정보를 dfs에 적용(탐색 제한 설정, 방문 처리, 거리 정보 기록)

import java.util.Scanner;

public class 미로탈출_DFS {

    // dfs 함수 정의
    static void dfs(int row, int col, int [][] multi, boolean [][] visited, int count) {
        int rowLen = multi.length;
        int colLen = multi[0].length;

        // dfs 탐색 중 주어진 범위에 대한 검사 & 제한
        if(row < 0 || row > rowLen-1 || col < 0 || col > colLen-1 || visited[row][col] == true || multi[row][col] == 0)
            return;

        // dfs 탐색 중 방문 처리 & 현재 위치에서 탐색
        count += 1;
        multi[row][col] += count;
        visited[row][col] = true;
        dfs(row,col+1,multi,visited,count);
        dfs(row+1,col,multi,visited,count);
        dfs(row,col-1,multi,visited,count);
        dfs(row-1,col,multi,visited,count);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 미로 크기 입력
        int count = 0;
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
        dfs(0,0,multi,visited,count);
        int result = multi[rowSize-1][colSize-1]-1;
        System.out.println("미로 탈출 ! : "+result);
    }
}