package Programmers.LEVEL_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//  실패율
//  input    : int, int[]
//  output   : int[]

//  solution
//  실패율 : 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
//  전체 스테이지의 개수 N, 게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때,
//  실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 하도록 solution 함수를 완성

//  https://programmers.co.kr/learn/courses/30/lessons/42889
public class L1_039 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] unclear = new int[N+2];
        int[] inStageTotal = new int[N+2];

        //Double[] score = new Double[stages.length+2];

        // 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수
        for(int i = 0 ; i < stages.length ; i++)
            unclear[stages[i]]++;

        for(int i = 0 ; i < stages.length ; i++) {
            for(int j = 1 ; j <= stages[i] ; j++) {
                inStageTotal[j]++;
            }
        }


        ///////////////////////////////////////////////////////////////////
        /////////////////             HashMap               ///////////////
        ///////////////////////////////////////////////////////////////////
        
        // Map<Integer, Double> scoreMap = new HashMap<>();

        // // 나눗셈 계산 시, 소수점까지 표현하기 위해서 (double) 형 변환 필요
        // for(int i = 1 ; i < N + 1 ; i++) {
        //     //score[i] = (double) (unclear[i] / inStageTotal[i]);
        //     double target = (double) unclear[i] / inStageTotal[i];
        //     scoreMap.put(i, target);    
        // }

        // /*// Map 전체 출력
        // for (Map.Entry<Integer, Double> entry : scoreMap.entrySet()) {
        //     System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
        // }
        // */

        // List<Integer> keySetList = new ArrayList<>(scoreMap.keySet());
        // Collections.sort(keySetList, (o1, o2) -> (scoreMap.get(o2).compareTo(scoreMap.get(o1))));
        
        // // List -> Array(Integer) -> Array(int)
        // Integer[] answer_integer = keySetList.toArray(new Integer[keySetList.size()]);
        // int[] answer = Arrays.stream(answer_integer).mapToInt(Integer::intValue).toArray();

        // /*
        // for(int i = 0 ; i < answer.length ; i++)
        //     System.out.println(answer[i]+" ");
        // */



        ///////////////////////////////////////////////////////////////////
        //////////////////             Class               ////////////////
        ///////////////////////////////////////////////////////////////////

        List<Rate> resultList = new ArrayList<>();
        for(int i = 1 ; i <= N; i++)
        {
            if(inStageTotal[i] == 0) {
                resultList.add(new Rate(i, 0));
                continue;
            }

            double target = (double) unclear[i] / inStageTotal[i];
            resultList.add(new Rate(i, target));
        }

        Collections.sort(resultList, ((o1, o2) -> Double.compare(o2.rate, o1.rate)));

        int[] answer2 = new int[N];
        for(int i = 0 ; i < resultList.size() ; i++)
            answer2[i] = resultList.get(i).idx;
        
        for(int i = 0 ; i < answer2.length ; i++)
            System.out.print(answer2[i]+" ");
    }

    public static class Rate {
        int idx;
        double rate;

        public Rate(int idx, double rate) {
            this.idx = idx;
            this.rate = rate;
        }
    }
}
