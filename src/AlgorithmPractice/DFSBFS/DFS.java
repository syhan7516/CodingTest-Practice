package AlgorithmPractice.DFSBFS;

// 주제 : DFS (Depth-First-Search)
// 내용 : 깊은 부분을 우선적으로 탐색하는 알고리즘
// 방법 : 스택, 재귀 함수
// 순서 :
// 1.시작 노드를 스택에 삽입 후 방문 처리
// 2.스택의 최상단 노드에 방문하지 않은 인접한 노드 존재 시 해당 노드 스택에 넣고 방문 처리
// 3.방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드 꺼내기
// 4.2~3번 수행할 수 없을 떄까지 반복

public class DFS {

    // DFS 함수 정의
    static void dfs(int node, int[][]graph, boolean[]visited) {
        // 현재 노드 방문 처리
        visited[node] = true;
        System.out.print(node+" ");
        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for(int idx=0; idx<graph[node].length; idx++) {
            int nextNode = graph[node][idx];
            if(visited[nextNode] != true) dfs(nextNode,graph,visited);
        }
    }

    public static void main(String[] args) {
        // 연결 정보 그래프로 표현
        int [][] graph = {{},{2,3,8},{1,7},{1,4,5},{3,5},{3,4},{7},{2,6,8},{1,7}};
        // 방문 여부 확인 배열
        boolean [] visited = new boolean[graph.length];

        // DFS 함수 호출
        dfs(1,graph,visited);

        // 탐색 순서 : 1 → 2 → 7 → 6 → 8 → 3 → 4 → 5
    }
}
