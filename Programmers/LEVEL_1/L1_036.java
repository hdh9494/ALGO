package Programmers.LEVEL_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  3진법 뒤집기
//  input    : int
//  output   : int
//  solution :   (10진법)	n (3진법)	앞뒤 반전(3진법)	10진법으로 표현
//                  45	      1200	        0021	            7
//  45 -> 7

//  https://programmers.co.kr/learn/courses/30/lessons/68644
public class L1_036 {
    public static void main(String[] args) {
        int n = 45;
        int answer = 0;

        int[] third_pow = new int[17];
        List<Integer> resultList = new ArrayList<Integer>();

        // 100,000,000 미만의 3진수 값 배열 구하기
        for(int i = 0 ; i < 17 ; i++) {
            third_pow[i] = (int) Math.pow(3, 16-i);
        }
        
        // 3진법 n 만들기
        int idx = 0;
        boolean flag = false;
        for(int i = 0 ; i < 17 ; i++) {
            if(n >= third_pow[i]) {
                flag = true;
                if(n >= third_pow[i] * 2) {
                    n = n - (third_pow[i] * 2);
                    resultList.add(idx++, 2);
                } else {
                    n = n - third_pow[i];
                    resultList.add(idx++, 1);
                }
            } else if (flag == true) {
                resultList.add(idx++, 0);
            }
        }

        // 3진법 뒤집기
        Collections.reverse(resultList);

        int[] third_arr = new int[resultList.size()];
        for(int i = 0 ; i < resultList.size() ; i++) {
            third_arr[i] = resultList.get(i).intValue();
        }


        int pow_val = 0;
        for(int i = resultList.size() - 1 ; i >= 0 ; i--) {
            int val = (int) Math.pow(3, pow_val++);
            answer = answer + third_arr[i] * val;
        }

        //return answer;
        System.out.println(answer);
    }
}
