package Programmers.LEVEL_1;

//  행렬의 덧셈
//  input    : int[]
//  output   : int[]
//  solution : [[1,2],[2,3]] + [[3,4],[5,6]] = [[4,6],[7,9]]
//  https://programmers.co.kr/learn/courses/30/lessons/12950
public class L1_003 {
    public static void main(String[] args) {

        int[][] arr1 = {
            {1, 2},
            {2, 3}
        };

        int[][] arr2 = {
            {3, 4},
            {5, 6}
        };

        int row_len = arr1.length;
        int col_len = arr1[0].length;
        
        int[][] answer = new int[row_len][col_len];

        for(int i = 0 ; i < row_len ; i++) {
            for(int j = 0 ; j < col_len ; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        // print
        for(int i = 0 ; i < row_len ; i++) {
            for(int j = 0 ; j < col_len ; j++) {
                System.out.print(answer[i][j]+" ");
            }
            System.out.println("");
        }        
    }
}
