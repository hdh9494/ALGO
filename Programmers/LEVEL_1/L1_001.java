package Programmers.LEVEL_1;

//  직사각형 별 찍기
//  input    : int, int(n, m) 행,렬
//  output   : String
//  https://programmers.co.kr/learn/courses/30/lessons/12969
public class L1_001 {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;

        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
