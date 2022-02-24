package Programmers.LEVEL_1;

// 두 정수 사이의 합
// input        : int
// output       : int
// solution     : 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수
// a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴

// https://programmers.co.kr/learn/courses/30/lessons/12912
public class L1_025 {
    public static void main(String[] args) {
        long answer = 0;

        int a = 3;
        int b = 5;

        if(a == b) {
            answer = a;
        } else {
            if(a < b) {
                while(a <= b) {
                    answer = answer + a;
                    a++;
                }
            } else {
                while(a >= b) {
                    answer = answer + b;
                    b++;
                }
            }
        }

        System.out.println(answer);
    }
}
