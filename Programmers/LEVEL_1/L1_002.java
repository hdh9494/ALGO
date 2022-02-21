package Programmers.LEVEL_1;

//  x만큼 간격이 있는 n개의 숫자
//  input    : long, int
//  output   : long[]
//  solution : x=2, n=5 -> [2,4,6,8,10] / x = -4, n = 2 -> [-4, -8]
//  https://programmers.co.kr/learn/courses/30/lessons/12954
public class L1_002 {
    public static void main(String[] args) {
        long x = -4;
        int n = 2;

        long[] answer = new long[n];
        
        for(int i = 1 ; i <= n ; i++) {
            answer[i-1] = x * i;
        }

        // print
        for(int i = 0 ; i < answer.length ; i++) {
            System.out.print(answer[i]+" ");
        }
        System.out.println("");

    }
}
