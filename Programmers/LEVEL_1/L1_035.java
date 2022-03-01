package Programmers.LEVEL_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//  두 개 뽑아서 더하기
//  input    : int[]
//  output   : int[]
//  solution : [5,0,2,7] -> [2,5,7,9,12]

//  https://programmers.co.kr/learn/courses/30/lessons/68644
public class L1_035 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        boolean[] visited = new boolean[201];

        List<Integer> resultList = new ArrayList<Integer>();
        
        for(int i = 0 ; i < numbers.length - 1 ; i++) {
            for(int j = i + 1 ; j < numbers.length ; j++) {
                int sum = numbers[i] + numbers[j];
                if(!visited[sum]) {
                    visited[sum] = true;
                    resultList.add(sum);
                }
            }
        }

        Collections.sort(resultList);
        
        int[] answer = new int[resultList.size()];
        for(int i = 0 ; i < resultList.size() ; i++) {
            answer[i] = resultList.get(i).intValue();
        }

        //return answer;
        for(int i = 0 ; i < answer.length ; i++)
            System.out.print(answer[i]+" ");
    }
}
