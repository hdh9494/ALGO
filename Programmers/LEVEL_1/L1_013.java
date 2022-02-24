package Programmers.LEVEL_1;

// 자릿수 더하기
// input        : int
// output       : int
// solution     : 9842 -> 23
// https://programmers.co.kr/learn/courses/30/lessons/12931
public class L1_013 {
    public static void main(String[] args) {
        int input = 48233745;
        
        int sum = 0;
        while(input >= 10) {
            int val = input % 10;
            sum = sum + val;
            input = input / 10;
        }

        sum = sum + input;

        System.out.println("값 : "+sum);
    }
}
