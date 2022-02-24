package Programmers.LEVEL_1;

import java.util.ArrayList;

// 같은 숫자는 싫어
// input        : int[]
// output       : int[]
// solution     : 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거
// [1,1,3,3,0,1,1]	->  [1,3,0,1]
// [4,4,4,3,3]  ->  [4,3]

//  https://programmers.co.kr/learn/courses/30/lessons/12906
public class L1_027 {
    public static void main(String[] args) {
        int arr[] = {1,1,3,3,0,1,1};
        
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        
        resultList.add(arr[0]);
        int target = arr[0];

        for(int i = 1 ; i < arr.length ; i++) {
            if(target != arr[i]) {
                resultList.add(arr[i]);
                target = arr[i];
            }
        }

        int[] answer = new int[resultList.size()];
        for(int i = 0 ; i < resultList.size() ; i++) {
            answer[i] = resultList.get(i).intValue();
        }

        /*
        Integer[] answer_Integer = resultList.toArray(new Integer[resultList.size()]);
        int[] answer = Arrays.stream(answer_Integer).mapToInt(Integer::intValue).toArray();
        */

        for(int i = 0 ; i < resultList.size() ; i++){
            System.out.print(answer[i] + ", ");
        }
    }
}
