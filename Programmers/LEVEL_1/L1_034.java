package Programmers.LEVEL_1;


//  2016년
//  input    : int, int
//  output   : String
//  solution : a -> 5 / b -> 24 : 5월 24일은 'TUE' 화요일

//  https://programmers.co.kr/learn/courses/30/lessons/12901
public class L1_034 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String answer = "";

        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int sum = 0;
        for(int i = 0 ; i < a - 1 ; i++) {
            sum += months[i];
        }

        int n = (sum + b) % 7;

        // 1월 1일은 금요일 (0-일 / 1-월 / 2-화 / 3-수 / 4-목 / 5-금 / 6-토)
        answer = days[ (n+4) % 7 ];

        //return answer;
        System.out.println(answer);
    }
}
