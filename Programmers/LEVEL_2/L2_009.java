package Programmers.LEVEL_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//  행렬 테두리 회전하기
//  input    : int, int, int[][]
//  output   : int[]
//  solution :  queries[] 배열에는 x1,x2,y1,y2 좌표 존재
//              x1 행 y1 열부터 x2 행 y2 열까지의 영역에 해당하는 직사각형에서 테두리에 있는 숫자들을 한 칸씩 시계방향으로 회전
//              회전에 의해 위치가 바뀐 숫자들 중 가장 작은 숫자들을 순서대로 배열에 담아 return 하도록 solution 함수

//  https://programmers.co.kr/learn/courses/30/lessons/77485
public class L2_009 {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2,2,5,4},{3,3,6,6},{5,1,6,3}};
        int[] answer = new int[queries.length];


        int[][] map = new int[rows+1][columns+1];
        int[][] temp_map = new int[rows+1][columns+1];
        
        int tmp = 1;
        for(int i = 1 ; i <= rows ; i++) {
            for(int j = 1 ; j <= columns ; j++) {
                map[i][j] = tmp;
                temp_map[i][j] = tmp++;
            }
        }
        
        int idx = 0;
        for(int i = 0 ; i < queries.length ; i++) {

            int x1 = queries[i][0];
            int y1 = queries[i][1];
            int x2 = queries[i][2];
            int y2 = queries[i][3];

            // 가장 작은 수 담기위한 List , xy좌표 순서용 list
            List<Integer> intList = new ArrayList<>();
            List<Pair> arrList = new ArrayList<>();

            int abs_x = Math.abs(x1-x2);
            int abs_y = Math.abs(y1-y2);

            
            for(int t = y1 ; t <= y1+abs_y ; t++) {
                arrList.add(new Pair(x1, t));
            }

            for(int t = x1 + 1 ; t <= x1+abs_x ; t++) {
                arrList.add(new Pair(t, y2));
            }

            for(int t = y2 - 1 ; t >= y2-abs_y ; t--) {
                arrList.add(new Pair(x2, t));
            }

            for(int t = x2 -1 ; t >= x2-abs_x ; t--) {
                arrList.add(new Pair(t, y1));
            }

            for(int k = 0 ; k < arrList.size() - 1 ; k++) {
                int after_x = arrList.get(k+1).x;
                int after_y = arrList.get(k+1).y;

                int before_x = arrList.get(k).x;
                int before_y = arrList.get(k).y;

                temp_map[after_x][after_y] = map[before_x][before_y];
                intList.add(map[before_x][before_y]);                
            }
            
            Collections.sort(intList);
            answer[idx++] = intList.get(0);

            // A. 주소값만 복사(얇은 복사)
            // map = temp_map;

            // B. 실제 값 복사
            for(int ia = 0 ; ia < map.length; ia++) {
                for(int ib = 0; ib < map[ia].length; ib++) {
                    map[ia][ib] = temp_map[ia][ib];  
                }
            }
        }

        for(int i = 0 ; i < answer.length ; i++)
            System.out.print(answer[i]+" ");
    }
    
    public static class Pair{
        int x;
        int y;
        
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    /*
    public static void print() {
        System.out.println("####### 처음 MAP #######");
        for(int s = 1 ; s <= rows ; s++) {
            for(int d = 1 ; d <= columns ; d++) {
                System.out.print(map[s][d]+" ");
            }
            System.out.println("");
        }
        System.out.println("");System.out.println("");
    }
    */
}
