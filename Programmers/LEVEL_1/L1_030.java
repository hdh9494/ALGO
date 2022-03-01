package Programmers.LEVEL_1;

//  [1차] 비밀지도
//  input    : n(int), arr1(int[]), arr2(int[])
//  output   : String[]
//  solution : 10진수 -> 2진수 변환하여 map 그리기
//             20 -> 10100(2), 28 -> 11100(2)

//  https://programmers.co.kr/learn/courses/30/lessons/17681
public class L1_030 {
    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        String[] answer = new String[n];

        int[] binary_num = new int[n];
        binary_num[n-1] = 1;
        for(int i = n-2 ; i >= 0 ; i--){
            binary_num[i] = binary_num[i+1] * 2;
        }

        boolean[][] map_chk = new boolean[n][n];

        for(int i = 0 ; i < n ; i++) {
            int val = arr1[i];

            for(int j = 0 ; j < n ; j++) {
                if(val >= binary_num[j]) {
                    if(map_chk[i][j] == false) {
                        map_chk[i][j] = true;
                    }
                    val -= binary_num[j];
                }
            }
        }

        for(int i = 0 ; i < n ; i++) {
            int val = arr2[i];
            
            for(int j = 0 ; j < n ; j++) {
                if(val >= binary_num[j]) {
                    if(map_chk[i][j] == false) {
                        map_chk[i][j] = true;
                    }
                    val -= binary_num[j];
                }
            }
        }
        
        for(int i = 0 ; i < n ; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < n ; j++){
                if(map_chk[i][j]) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }

        //return answer;
        System.out.println(answer);
    }
}
