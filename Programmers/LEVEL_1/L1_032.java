package Programmers.LEVEL_1;

//  나머지가 1이 되는 수 찾기
//  input    : int
//  output   : int
//  solution : 10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return

//  https://programmers.co.kr/learn/courses/30/lessons/87389
public class L1_032 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 10;
        int input = n;

        for(int i = 1 ; i <= input ; i++) {
            if(input % i == 1){
                answer = i;
                break;
            }
        }

        //return answer;
        System.out.println(answer);
    }
}
