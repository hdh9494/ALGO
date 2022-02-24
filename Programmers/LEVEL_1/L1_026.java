package Programmers.LEVEL_1;

import java.util.Arrays;

// 나누어 떨어지는 숫자 배열
// input        : int[]
// output       : int[]
// solution     : 배열의 각 요소 중, divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 return / 단, 하나도없다면 -1
// [5, 9, 7, 10] / 5 -> [5, 10]
// [3,2,6] / 10 -> [-1]

// https://programmers.co.kr/learn/courses/30/lessons/12910
public class L1_026 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6};
        int divisor = 10;

        int cnt = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            if(arr[i] % divisor == 0) {
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];

        if(cnt == 0) {
            int[] answer_2 = new int[1];
            answer_2[0] = -1;
            //return answer_2;
            
        } else {
            int cnt_2 = 0;
            for(int i = 0 ; i < arr.length ; i++) {
                if(arr[i] % divisor == 0) {
                    answer[cnt_2++] = arr[i];
                }
            }

            Arrays.sort(answer);

            //return answer;
        }
    }
}
