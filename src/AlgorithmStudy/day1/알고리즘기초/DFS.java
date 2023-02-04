package AlgorithmStudy.day1.알고리즘기초;

// 주제 : DFS (Depth-First-Search)
// 내용 : 깊은 부분을 우선적으로 탐색하는 알고리즘
// 방법 : 스택, 재귀 함수
// 활용 : 백트래킹(재귀), 단절선, 단절점, 위상정렬, 싸이클찾기

import java.util.ArrayList;
import java.util.List;

public class DFS {

    // // 연결 정보 그래프로 표현
    public static int graph[][] = {{},{2,4},{1,3,5},{2},{1,5},{2,4},{7},{6}};
    // 방문 여부 확인 배열 & 초기화
    public static boolean [] visited = new boolean[graph.length+1];
    // 방문 중 리스트
    public static List<Integer> gray = new ArrayList<>();
    // 방문 완료 리스트
    public static List<Integer> black = new ArrayList<>();

    // dfs 함수 정의
    static void dfs(int node) {
        // 미방문 노드에 연결된 노드 탐색
        for(int idx=0; idx<graph[node].length; idx++) {
            int nextNode = graph[node][idx];
            // 미방문 노드의 경우
            if(!visited[nextNode]) {
                // 방문 표시
                visited[nextNode] = true;
                gray.add(nextNode);
                dfs(nextNode);
                black.add(nextNode);
            }
        }
    }

    public static void main(String[] args) {
        // 노드 탐색
        for(int node=1; node<graph.length; node++) {
            // 미방문 노드의 경우
            if(!visited[node]) {
                // 방문 표시
                visited[node] = true;
                gray.add(node);
                // 미방문 노드에 연결된 노드를 탐색하기
                dfs(node);
                black.add(node);
            }
        }

        // 결과 출력
        System.out.print("방문 중 : ");
        for(int element: gray) System.out.print(element+" ");
        System.out.println();
        System.out.print("방문 완료 : ");
        for(int element: black) System.out.print(element+" ");
        System.out.println();
    }
}