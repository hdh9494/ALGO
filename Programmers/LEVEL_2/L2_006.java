package Programmers.LEVEL_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


//  기능개발
//  input    : int[]
//  output   : int[]
//  solution : 단순 구현
//  List 활용

//  https://programmers.co.kr/learn/courses/30/lessons/42586
public class L2_006 {

    public static void main(String[] args) {

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        List<Integer> p = Arrays.stream(progresses).boxed().collect(Collectors.toList());
        List<Integer> s = Arrays.stream(speeds).boxed().collect(Collectors.toList());

        List<Integer> answer = new ArrayList<>();

        while(p.size() > 0)
        {
            int idx = 0;
            
            while(p.get(idx) < 100)
            {
                for(int i = 0 ; i < p.size() ; i++) 
                    p.set(i, p.get(i) + s.get(i));
            }

            List<Integer> endIdxList = new ArrayList<>();
            int answer_cnt = 0;
            for(int i = 0 ; i < p.size() ; i++) {
                if(p.get(i) >= 100) {
                    answer_cnt++;
                    endIdxList.add(i);
                } else {
                    break;
                }
            }

            List<Integer> temp1 = new ArrayList<>();
            List<Integer> temp2 = new ArrayList<>();

            for(int i = 0 ; i < p.size() ; i++)
            {
                if(!endIdxList.contains(i)) {
                    temp1.add(p.get(i));
                    temp2.add(s.get(i));
                }
            }

            p = temp1;
            s = temp2;

            answer.add(answer_cnt);
        }

        for(int i = 0 ; i < answer.size() ; i++)
            System.out.print(answer.get(i)+" ");

        int[] answer_arr = new int[answer.size()];
        for(int i = 0 ; i < answer.size() ; i++)
            answer_arr[i] = answer.get(i).intValue();
        
    }
}
