
package Programmers.LEVEL_1;

//  최소 직사각형
//  input    : int[][]
//  output   : int
//  solution : [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]
//  명함들을 적절히 회전시켜 겹쳤을 때, 3번째 명함(가로: 8, 세로: 15)이 다른 모든 명함보다 크기가 큽니다. 따라서 지갑의 크기는 3번째 명함의 크기와 같으며, 120(=8 x 15)을 return 합니다.

//  https://programmers.co.kr/learn/courses/30/lessons/86491
public class L1_033 {
    public static void main(String[] args) {
        int answer = 0;

        int[][] sizes = {{60,50}, {30,70}, {60,30}, {80,40}};

        int[][] intArr = sizes;

        for(int i = 0 ; i < intArr.length ; i++) {
            int val_1 = intArr[i][0];
            int val_2 = intArr[i][1];

            if(val_1 > val_2) {
                int temp = val_2;
                intArr[i][1] = val_1;
                intArr[i][0] = val_2;
            }
        }

        int x_max = 0;
        int y_max = 0;
        for(int i = 0 ; i < intArr.length ; i++) {
            if(x_max < intArr[i][0]) {
                x_max = intArr[i][0];
            }
        }

        for(int i = 0 ; i < intArr.length ; i++) {
            if(y_max < intArr[i][1]) {
                y_max = intArr[i][1];
            }
        }

        answer = x_max * y_max;

        //return answer;
        System.out.println(answer);
    }
}
