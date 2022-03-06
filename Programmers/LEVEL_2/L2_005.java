package Programmers.LEVEL_2;

//  멀쩡한 사각형
//  input    : int, int
//  output   : int

//  solution
//  가로가 8, 세로가 12인 직사각형을 대각선 방향으로 자르면 총 16개 정사각형을 사용할 수 없게 됩니다.
//  원래 직사각형에서는 96개의 정사각형을 만들 수 있었으므로, 96 - 16 = 80 을 반환합니다.
//  https://programmers.co.kr/learn/courses/30/lessons/62048

//  https://velog.io/@ajufresh/프로그래머스-멀쩡한-사각형-문제풀이-Java
//  https://taesan94.tistory.com/55 (문제 풀이 방법)
public class L2_005 {

    public static void main(String[] args) {
        
        int w = 8;
        int h = 12;

        long big = w > h ? w : h;
        long small = w > h ? h : w;

        while (small != 0) {
            long r = big % small;
            big = small;
            small = r;
        }

        //return ((long) w * (long) h) - ((((long) w / big) + ((long) h / big) - 1) * big);
        System.out.println(((long) w * (long) h) - ((((long) w / big) + ((long) h / big) - 1) * big));
    }


    /* A. 완전 잘못 생각함. 쪼개지는 숫자가 정해져있다고 생각함.
    public static int[] dx = {1, 0, 1};
    public static int[] dy = {0, 1, 0};

    public static int W = 5;
    public static int H = 4;

    public static long cnt = 0;

    public static void main(String[] args) {
        cnt = 0;

        boolean[][] visited = new boolean[H][W];

        bfs(0, 0, visited);

        int answer = W * H;
        answer -= cnt;

        System.out.println(answer);
        
    }

    public static void bfs(int x, int y, boolean[][] visited)
    {
        if(0 <= x && x < H && 0 <= y && y < W) {
            visited[x][y] = true;
            cnt++;

            int nx = x;
            int ny = y;
            for(int i = 0 ; i < 3 ; i++)
            {
                nx += dx[i];
                ny += dy[i];

                if(0 <= nx && nx < H && 0 <= ny && ny < W) {
                    visited[nx][ny] = true;
                    cnt++;
                } else {
                    return;
                }
            }

            for(int i = 0 ; i < H ; i++) {
                for(int j = 0 ; j < W ; j++) {
                    if(visited[i][j])
                        System.out.print("1");
                    else
                        System.out.print("0");
                }
                System.out.println("");
            }
            System.out.println("--------------------------");


            bfs(x+3, y+2, visited);
            
        } else {
            return;
        }
    }
    */
}
