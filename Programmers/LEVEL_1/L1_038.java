package Programmers.LEVEL_1;

//  약수의 개수와 덧셈
//  input    : int, int
//  output   : int
//  solution : left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return

//  https://programmers.co.kr/learn/courses/30/lessons/77884
public class L1_038 {
    public static void main(String[] args) {
        int answer = 0;
        int left = 13;
        int right = 17;

        for(int i = left ; i <= right ; i++) {
            if(divisor_cnt(i) % 2 == 0)
                answer += i;
            else
                answer -= i;
        }

        //return answer;
        System.out.println(answer);
    }

    public static int divisor_cnt(int input) {
        int cnt = 0;
        for(int i = 1 ; i <= input ; i++) {
            if(input % i == 0)
                cnt++;
        }

        return cnt;
    }
}
