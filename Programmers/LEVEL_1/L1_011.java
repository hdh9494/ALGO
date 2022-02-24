package Programmers.LEVEL_1;

import java.util.*;

//  정수 내림차순으로 배치하기
//  input    : long
//  output   : long
//  https://programmers.co.kr/learn/courses/30/lessons/12933
public class L1_011 {
    public static void main(String[] args) {
        
        long input = 1245235;

        String s = String.valueOf(input);
        StringBuilder sb = new StringBuilder(s);

        String[] stringArr = sb.toString().split("");

        Arrays.sort(stringArr, Collections.reverseOrder());

        String answer = "";
        for(int i = 0 ; i < stringArr.length ; i++) {
            answer = answer + stringArr[i];
        }
        
        long ret = Long.parseLong(answer);

        System.out.println(ret);
        
        /////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////
        /*
            
        long n = 118372;
        long answer = 0;

        String s_n = Long.toString(n);

        Integer[] long_arr = new Integer[s_n.length()];

        int idx = 0;
        while(n > 9)
        {
            long_arr[idx++] = (int) (n % 10);
            n /= 10;
        }
        long_arr[idx] = (int) n;

        Arrays.sort(long_arr, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < long_arr.length ; i++)
            sb.append(long_arr[i]);

        answer = Long.parseLong(sb.toString());

        System.out.println(answer);
        */
    }
}
