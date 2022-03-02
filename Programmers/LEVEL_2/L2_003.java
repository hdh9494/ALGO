package Programmers.LEVEL_2;

import java.util.*;

//  카카오프렌즈 컬러링북
//  input    : int, int, int[][]
//  output   : int[][]
//  solution : 그림에 몇 개의 영역이 있는지 / 가장 큰 영역의 넓이는 얼마인지

//  https://programmers.co.kr/learn/courses/30/lessons/1829
public class L2_003 {

    public static final int[] dx = {1, -1,  0,  0};
    public static final int[] dy = {0,  0,  1, -1};

    public static int m = 6;
    public static int n = 4;
    public static void main(String[] args) {
        int[] answer = new int[2];

        // int[][] picture = {{1, 1, 1, 0},
        //                     {1, 2, 2, 0},
        //                     {1, 0, 0, 1},
        //                     {0, 0, 0, 1},
        //                     {0, 0, 0, 3},
        //                     {0, 0, 0, 3}};

        int[][] picture = {{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}};

        int[][] visited = new int[m][n];

        // bfs를 위한 queue 선언
        Queue<Pair> q = new LinkedList<>();
        int totalCnt = 0;
        int maxCnt = 0;
        int zeroCnt = 0;
        
        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {

                // 지도 0 개수 확인
                if(picture[i][j] == 0)
                    zeroCnt++;

                // 방문안했으면, bfs 돌리기
                if(visited[i][j] == 0) {
                    bfs(q, picture, visited, i, j);

                    // 새로운 영역탐색 시, cnt 체크
                    totalCnt++;
                }
            }
        }
        
        maxCnt = maxChk(visited, m, n);

        answer[0] = totalCnt - zeroCnt;
        answer[1] = maxCnt;

        System.out.println(answer[0]+", "+answer[1]);
    }

    public static void bfs(Queue<Pair> q, int[][] picture, int[][] visited, int x, int y)
    {
        // 방문하지 않은 좌표 기준으로 queue에 add(offer)
        int target = picture[x][y];
        visited[x][y] = 1;
        q.offer(new Pair(x, y)); 

        while(!q.isEmpty())
        {
            int qx = q.peek().first();
            int qy = q.peek().second();
            q.poll();

            // 상하좌우로 bfs 돌리기
            for(int i = 0 ; i < 4 ; i++)
            {
                int nx = qx + dx[i];
                int ny = qy + dy[i];

                // 색칠하지 않은 영역 제외, 방문하지 않았고, 색칠한 영역이 같은 곳이면 queue에 add
                if(0 <= nx && nx < m && 0 <= ny && ny < n)
                {
                    if(picture[nx][ny] != 0 && visited[nx][ny] == 0 && picture[nx][ny] == target)
                    {
                        q.offer(new Pair(nx, ny));

                        // 방문한 위치는 -1 설정
                        visited[nx][ny] = -1;

                        // bfs로 퍼진 영역 total cnt 구하기
                        visited[x][y]++;
                    }
                }
            }
        }
    }

    public static int maxChk(int[][] visited, int m, int n)
    {
        int max = 0;
        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(max < visited[i][j])
                    max = visited[i][j];
            }
        }
        
        return max;
    }

    public static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int first() {
            return x;
        }

        public int second() {
            return y;
        }
    }
}
