package Programmers.LEVEL_1;

// [1차] 다트게임
// input        : String
// output       : int
// solution     : 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
// 1S2D*3T	->  1^1 * 2 + 2^2 * 2 + 3^3 = 37

//  https://programmers.co.kr/learn/courses/30/lessons/17682
public class L1_028 {
    public static void main(String[] args) {

        int[] ret = new int[3];

        String dartResult = "1D2S#10S";
         int answer = 0;

        StringBuilder sb = new StringBuilder();
        int temp = 0;
        int idx = 0;
        for(int i = 0 ; i < dartResult.length() ; i++)
        {
            if(dartResult.charAt(i) == 'S') {
                temp = (int) Math.pow(Integer.valueOf(sb.toString()), 1);
                ret[idx++] = temp;
                sb = new StringBuilder();
            } else if (dartResult.charAt(i) == 'D') {
                temp = (int) Math.pow(Integer.valueOf(sb.toString()), 2);
                ret[idx++] = temp;
                sb = new StringBuilder();
            } else if (dartResult.charAt(i) == 'T') {
                temp = (int) Math.pow(Integer.valueOf(sb.toString()), 3);
                ret[idx++] = temp;
                sb = new StringBuilder();
            } else if (dartResult.charAt(i) == '*') {
                if(idx-2 >= 0) {
                    ret[idx-2] *= 2;
                }
                ret[idx-1] *= 2;
            } else if (dartResult.charAt(i) == '#') {
                ret[idx-1] *= -1;
            } else {
                sb.append(dartResult.charAt(i));
            }
        }   

        answer = ret[0] + ret[1] + ret[2];
        
        System.out.println(answer);



        /* Case 1 - 잘못 구현.. 앞에서 계산된 값을 더한다음 다음 수를 계산함.
        int answer = 0;
        String dartResult = "1D2S3T*";
        
        String[] dart_arr = dartResult.split("");

        int temp = 0;
        for(int i = 0 ; i < dart_arr.length ; i++)
        {
            if("*".equals(dart_arr[i])) {
                answer *= 2;
                temp *= 2;
            } else if ("#".equals(dart_arr[i])) {
                temp *= -1;
            } else if ("S".equals(dart_arr[i])) {
                temp = (int) Math.pow(temp, 1);
            } else if ("D".equals(dart_arr[i])) {
                temp = (int) Math.pow(temp, 2);
            } else if ("T".equals(dart_arr[i])) {
                temp = (int) Math.pow(temp, 3);
            } else {
                answer += temp;
                temp = Integer.valueOf(dart_arr[i]);
            }
        }
        answer += temp;
        System.out.println(answer);
        */
    }
}
