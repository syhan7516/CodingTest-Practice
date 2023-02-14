package AlgorithmPractice.ShortestPath;

// 주제 : 플로이드-워셜
// 내용 : 모든 노드에서 모든 노드의 최단 경로를 구하는 알고리즘
// 방법 : 인접 행렬 표현으로 모든 경로를 구하는 방법
// 순서 :
// 1.모든 노드를 무한으로 초기화
// 2.자기 자신은 0으로 초기화
// 3.경로에 대한 거리 입력
// 4.3중 반복문으로 최단 경로 갱신

// 인접 행렬 입력 값
//1,2,4
//1,4,6
//2,1,3
//2,3,7
//3,1,5
//3,4,4
//4,3,2

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FloydWarshall {
    // 경로 무한대 초기화를 위한 설정 값
    public static final int INF = (int)1e9;
    // 노드 수, 경로 수
    public static int nodeCnt, edgeCnt;
    // 인접 행렬
    public static int graph[][] = new int[6][6];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 노드 수, 경로 수 입력
        nodeCnt = Integer.parseInt(st.nextToken());
        edgeCnt = Integer.parseInt(st.nextToken());

        // 인정 행렬 초기화
        for (int idx = 0; idx <= nodeCnt; idx++)
            Arrays.fill(graph[idx], INF);

        // 자기 자신 0으로 설정
        for (int a = 1; a <= nodeCnt; a++) {
            for (int b = 1; b <= nodeCnt; b++) {
                if (a == b) graph[a][b] = 0;
            }
        }

        // 경로 정보 입력
        for (int idx = 0; idx < edgeCnt; idx++) {
            st = new StringTokenizer(br.readLine());
            int fromNode = Integer.parseInt(st.nextToken());
            int toNode = Integer.parseInt(st.nextToken());
            int value = Integer.parseInt(st.nextToken());
            graph[fromNode][toNode] = value;
        }

        // 플로이드 워셜 수행
        for (int k = 1; k <= nodeCnt; k++) {
            for (int a = 1; a <= nodeCnt; a++) {
                for (int b = 1; b <= nodeCnt; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        // 결과 출력
        for (int start = 1; start <= nodeCnt; start++) {
            System.out.println("출발 노드 : " + start);
            for (int end = 1; end <= nodeCnt; end++) {
                System.out.print(graph[start][end]+" ");
            }
            System.out.println();
        }
    }
}
