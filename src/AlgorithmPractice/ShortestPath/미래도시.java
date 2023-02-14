package AlgorithmPractice.ShortestPath;

// 문제 : 미래 도시
// 문제 해결 방법 : 전형적인 최단 거리 문제이며, 노드의 크기가 최대 100이므로, 플로이드 워셜 적용
// 유의사항 : 출발지 → 도착지를 출발지 → 경유지 → 도착지로 점화식 설정 (V^3)

// 연결 회사 입력 데이터
// 5 7
// 1 2
// 1 3
// 1 4
// 2 4
// 3 4
// 3 5
// 4 5
// 4 5
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 미래도시 {
    // 경로 초기화를 위한 무한대 설정
    public static final int INF = (int)1e9;
    // 회사의 수, 경로 수
    public static int companyCnt, roadCnt;
    // 거쳐갈 회사, 방문할 회사
    public static int visitCompany, destination;
    // 인접 행렬
    public static int company[][] = new int[101][101];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 회사의 수, 경로 수 입력
        companyCnt = Integer.parseInt(st.nextToken());
        roadCnt = Integer.parseInt(st.nextToken());

        // 경로 초기화
        for(int idx=1; idx<=companyCnt; idx++)
            Arrays.fill(company[idx],INF);

        // 자기 자신 0으로 설정
        for(int a=1; a<=companyCnt; a++) {
            for(int b=1; b<=companyCnt; b++) {
                if(a==b) company[a][b] = 0;
            }
        }

        // 경로 정보 입력
        for(int idx=0; idx<roadCnt; idx++) {
            st = new StringTokenizer(br.readLine());
            int fromNode = Integer.parseInt(st.nextToken());
            int toNode = Integer.parseInt(st.nextToken());
            company[fromNode][toNode] = 1;
            company[toNode][fromNode] = 1;
        }

        // 방문할 회사 입력 & 거쳐갈 회사
        st = new StringTokenizer(br.readLine());
        destination = Integer.parseInt(st.nextToken());
        visitCompany = Integer.parseInt(st.nextToken());

        // 모든 회사에서의 최단 경로 탐색
        for(int k=1; k<=companyCnt; k++) {
            for(int a=1; a<=companyCnt; a++) {
                for(int b=1; b<=companyCnt; b++) {
                    company[a][b] = Math.min(company[a][b],company[a][k]+company[k][b]);
                }
            }
        }

        // 결과 출력
        int result = company[1][visitCompany] + company[visitCompany][destination];
        if(result >= INF)
            System.out.println("도달할 수 없습니다.");
        else
            System.out.println("최단 경로 : "+result);
    }
}