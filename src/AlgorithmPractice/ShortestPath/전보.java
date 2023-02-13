package AlgorithmPractice.ShortestPath;

// 문제 : 전보
// 문제 해결 방법 : 한 도시에서 다른 도시까지의 최단 거리 문제로 치환하여 생각
// 유의사항 : 우선순위 큐를 적용하여 타임커팅 (V^2 → ElogV)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class CityNode implements Comparable<CityNode> {
    private int node;
    private int distance;

    public CityNode(int node, int distance) {
        this.node = node;
        this.distance = distance;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getNode() {
        return this.node;
    }

    // 거리가 짧은 것이 높은 우선순위를 가지도록 설정
    @Override
    public int compareTo(CityNode other) {
        if(this.distance < other.distance)
            return -1;
        return 1;
    }
}


public class 전보 {
    // 노드 기본 설정 값 (무한)
    public static int INF = Integer.MAX_VALUE;
    // 메시지 전달받은 도시 수, 총 걸리는 시간
    public static int totalCity, totalTime;
    // 도시의 개수, 통로의 수, 시작 도시
    public static int cityCnt, roadCnt, startCity;
    // 인접 리스트
    public static ArrayList<ArrayList<CityNode>> graph = new ArrayList<ArrayList<CityNode>>();
    // 최단 경로 테이블
    public static int path[] = new int[30001];
    // 방문 처리 테이블
    public static boolean visited[] = new boolean[30001];

    // 메시지 보내기 함수 정의
    static void sendMessage(int startCity) {
        // 우선순위 큐 만들기
        PriorityQueue<CityNode> priQ = new PriorityQueue<>();
        // 시작 도시에 대한 최단 경로 설정
        path[startCity] = 0;
        // 시작 도시 큐에 넣기
        priQ.offer(new CityNode(startCity,path[startCity]));

        // 큐가 빌 때까지 반복
        while(!priQ.isEmpty()) {
            // 기준 도시 설정
            CityNode node = priQ.poll();
            int nowNode = node.getNode();
            int nowCost = node.getDistance();
            // 방문한 도시일 경우
            if(visited[nowNode]==true)
                continue;
            // 연결된 도시 확인
            for(int idx=0; idx<graph.get(nowNode).size(); idx++) {
                CityNode pareNode = graph.get(nowNode).get(idx);
                int connectNode = pareNode.getNode();
                int connectDis = pareNode.getDistance();
                // 최단 경로 테이블 갱신
                if(path[connectNode] > nowCost+connectDis)
                    path[connectNode] = nowCost+connectDis;

                // 큐에 삽입
                priQ.offer(new CityNode(connectNode,path[connectNode]));
            }

            // 방문 처리
            visited[nowNode] = true;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 도시의 수, 통로 수, 시작 도시 입력
        cityCnt = Integer.parseInt(st.nextToken());
        roadCnt = Integer.parseInt(st.nextToken());
        startCity = Integer.parseInt(st.nextToken());

        // 인접 리스트 초기화
        for(int idx=0; idx<=cityCnt; idx++) {
            graph.add(new ArrayList<>());
        }

        // 연결 정보 입력
        for(int idx=0; idx<roadCnt; idx++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            graph.get(a).add(new CityNode(b,c));
        }

        // 최단 경로 테이블 & 방문 처리 테이블 셋팅
        Arrays.fill(path,INF);
        Arrays.fill(visited,false);

        // 메시지 보내기
        sendMessage(startCity);

        // 결과 출력
        for(int idx=1; idx<=cityCnt; idx++) {
            if(path[idx]!=INF && idx!=startCity) {
                totalCity += 1;
                totalTime = Integer.max(totalTime,path[idx]);
            }
        }

        System.out.println(totalCity+" "+totalTime);
    }
}
