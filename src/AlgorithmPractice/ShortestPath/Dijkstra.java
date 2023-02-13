package AlgorithmPractice.ShortestPath;

// 주제 : 다익스트라
// 내용 : 음의 간선이 없는 조건에서 특정 노드에서 모든 노드의 최단 경로를 구하는 알고리즘
// 방법 : 큐, 우선순위 큐
// 순서 :
// 1.출발 노드를 선택
// 2-1.최단 거리 테이블 초기화 (자기자신 노드 0, 나머지 노드 무한)
// 2-2.방문 표시를 위한 노드 테이블 초기화
// 3.방문하지 않은 노드들 중에서 가장 짧은 최단 거리 선택 (우선순위 큐 사용)
// 4.해당 노드를 거쳐 다른 노드로 가는 비용을 계산 후 최단 거리 테이블 갱신
// 5.해당 노드 확인 종료 후 방문 처리
// 6.3~5번 반복

// 인접 리스트 입력 값
//1 2 2
//1 3 5
//1 4 1
//2 3 3
//2 4 2
//3 2 3
//3 6 5
//4 3 3
//4 5 1
//5 3 1
//5 6 2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 노드 정의
class Node implements Comparable<Node> {
    private int nodeNum;
    private int distance;

    public Node(int nodeNum, int distance) {
        this.nodeNum = nodeNum;
        this.distance = distance;
    }

    public int getNodeNum() {
        return this.nodeNum;
    }

    public int getDistance() {
        return this.distance;
    }

    // 우선순위 결정을 위한 설정
    @Override
    public int compareTo(Node other) {
        if(this.distance < other.distance)
            return -1;
        return 1;
    }
}

public class Dijkstra {
    // 노드 최단 경로 초기값
    public static final int INF = Integer.MAX_VALUE;
    // 노드 수, 간선 수, 시작 노드
    public static int nodeCnt, edgeCnt, startNode;
    // 방문 처리 테이블
    public static boolean visited[] = new boolean[100001];
    // 최단 경로 테이블
    public static int path[] = new int[100001];
    // 인접 리스트
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();

    // 다익스트라
    static void dijkstra(int startNode) {
        // 우선순위 큐 생성
        PriorityQueue<Node> priQ = new PriorityQueue<>();
        // 시작 노드 최단 경로 테이블 설정
        path[startNode] = 0;
        // 큐에 시작 노드 입력
        priQ.offer(new Node(startNode,path[startNode]));

        // 큐가 비었을 때까지 반복
        while(!priQ.isEmpty()) {
            // 큐에서 노드 꺼내기
            Node node = priQ.poll();
            int nowNode = node.getNodeNum();
            int nowDist = node.getDistance();

            // 이미 방문한 노드인 경우
            if(visited[nowNode]==true)
                continue;

            // 방문 처리
            visited[nowNode] = true;

            // 해당 노드와 인접한 노드 확인
            for(int idx=0; idx<graph.get(nowNode).size(); idx++) {
                Node tempNode = graph.get(nowNode).get(idx);
                int vertex = tempNode.getNodeNum();
                int cost = tempNode.getDistance();

                // 최단 경로 테이블 갱신
                if(path[vertex] > nowDist+cost)
                    path[vertex] = nowDist+cost;

                // 큐에 삽입
                priQ.offer(new Node(vertex,path[vertex]));
            }
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 노드 수, 간선 수, 시작 노드 입력
        nodeCnt = Integer.parseInt(st.nextToken());
        edgeCnt = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());

        // 인접 리스트 생성
        for(int idx=0; idx<=nodeCnt; idx++)
            graph.add(new ArrayList<>());

        // 인접 리스트 입력 (기준 노드, 인접 노드, 비용)
        for(int idx=0; idx<edgeCnt; idx++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph.get(a).add(new Node(b,c));
        }

        // 방문 테이블 & 최단 경로 테이블 초기화
        Arrays.fill(visited,false);
        Arrays.fill(path,INF);

        // 다익스트라 수행
        dijkstra(startNode);

        // 결과 출력
        for(int idx=1; idx<=nodeCnt; idx++)
            System.out.println(idx + "번 노드까지 : "+path[idx]);
    }
}