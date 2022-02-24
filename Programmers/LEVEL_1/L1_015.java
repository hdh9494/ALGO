package Programmers.LEVEL_1;

//  약수의 합
//  input    : int
//  output   : int
//  solution : 12 -> 28
//  https://programmers.co.kr/learn/courses/30/lessons/12928
public class L1_015 {
    public static void main(String[] args) {
        
        int answer = 0;
        int input = 12;
        
        // 입력값이 0이면, return 0
        if(input == 0) {
            answer = 0;
        }

        for(int i = 1 ; i <= input ; i++) {
            if(input % i == 0) {
                System.out.println(i);
                answer += i;
            }
        }

        System.out.println("값 : "+answer);
        
    }
}
