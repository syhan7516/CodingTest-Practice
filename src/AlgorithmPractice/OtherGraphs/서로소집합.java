package AlgorithmPractice.OtherGraphs;

// 주제 : 서로소 집합 (Union, find)
// 내용 : 서로소 부분을 집합들로 나누어진 원소들의 데이터를 처리하기 위한 자료구조
// 방법 : 합집합(Union), 찾기(find)를 통해 구현
// 순서 :
// 1.대표 노드를 나타내는 테이블을 만들고, 자기 자신을 대표로 초기화
// 2.합집합 연산을 확인(찾기)하여, 서로 연결된 두 노드의 대표 노드를 확인
// 2-1.찾기에서는 자신의 대표 노드를 따라가 자기 자신과 대표 노드가 같을 때까지 찾아 반환
// 2-2.반환할 때는 경로 압축을 위해 연결된 모든 노드를 대표 노드로 수정
// 3.합집합하는 대표 노드를 다른 대표 노드로 설정
// 4.모든 합집합 연산을 처리할 때까지 1~2번 과정 반복

// 입력 정보
//7 8
//0 1 3
//1 1 7
//0 7 6
//1 7 1
//0 3 7
//0 4 2
//0 1 1
//1 1 1

import java.util.Scanner;

public class 서로소집합 {
    static int find(int group[], int node) {
        if(group[node]==node) {
            return node;
        }
        else {
            return group[node] = find(group,group[node]);
        }
    }

    static void union(int group[], int firNode, int secNode) {
        int firNodeRoot = find(group,firNode);
        int secNodeRoot = find(group,secNode);
        group[firNodeRoot] = secNodeRoot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 숫자 수 & 연산 수 입력
        int numbers = scanner.nextInt();
        int opCount = scanner.nextInt();

        // 각 집합 초기화
        int group[] = new int[numbers+1];
        for(int idx=0; idx<numbers+1; idx++) {
            group[idx] = idx;
        }

        // 연산 수행
        for(int idx=0; idx<opCount; idx++) {
            int op = scanner.nextInt();
            int firNode = scanner.nextInt();
            int secNode = scanner.nextInt();
            // 합집합
            if(op==0) {
                union(group,firNode,secNode);
            }
            // 집합 확인
            else {
                int firGroup = find(group,firNode);
                int secGroup = find(group,secNode);
                if(firGroup==secGroup)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
