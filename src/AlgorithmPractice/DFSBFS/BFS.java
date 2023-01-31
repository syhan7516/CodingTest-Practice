package 알고리즘1.DFSBFS;

// 주제 : BFS (Breadth-First-Search)
// 내용 : 가까운 노드부터 우선적으로 탐색하는 알고리즘
// 방법 : 큐
// 순서 :
// 1.시작 노드를 큐에 삽입 후 방문 처리
// 2.큐에서 노드를 꺼내기
// 3.꺼낸 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입 후 방문 처리
// 4.2~3번 수행할 수 없을 떄까지 반복

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    // BFS 함수 정의
    static void bfs(int node, int[][]graph, boolean[]visited, Queue<Integer> qu) {
        qu.offer(node);
        System.out.print(node+" ");
        // 현재 노드 방문 처리
        visited[node] = true;

        // 큐가 빌 때까지 반복
        while(!qu.isEmpty()) {
            // 큐에서 하나의 원소 꺼내기
            node = qu.poll();
            // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for(int idx=0; idx<graph[node].length; idx++) {
                int nextNode = graph[node][idx];
                if(visited[nextNode] != true) {
                    qu.offer(nextNode);
                    System.out.print(nextNode+" ");
                    visited[nextNode] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 연결 정보 그래프로 표현
        int [][] graph = {{},{2,3,8},{1,7},{1,4,5},{3,5},{3,4},{7},{2,6,8},{1,7}};
        // 방문 여부 확인 배열
        boolean [] visited = new boolean[graph.length];
        Queue<Integer> qu = new LinkedList<>();

        // bfs 함수 호출
        bfs(1,graph,visited,qu);

        // 탐색 순서 : 1 → 2 → 3 → 8 → 7 → 4 → 5 → 6
    }
}
