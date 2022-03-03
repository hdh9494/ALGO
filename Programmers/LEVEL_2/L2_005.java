package Programmers.LEVEL_2;

public class L2_005 {

    public static int[] dx = {0, 1, 0};
    public static int[] dy = {1, 0, 1};

    public static int W = 8;
    public static int H = 12;

    public static int cnt = 0;

    public static void main(String[] args) {
        cnt = 0;

        boolean[][] visited = new boolean[W][H];

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


            bfs(x+2, y+3, visited);
            
        } else {
            return;
        }
    }
}
