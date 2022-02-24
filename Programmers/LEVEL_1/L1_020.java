package Programmers.LEVEL_1;

//  서울에서 김서방 찾기
//  input    : String[]
//  output   : String
//  solution : 배열Seoul ["Jane", "Kim"] -> 김서방은 1에 있다
//             배열Seoul ["Jane", "jab", "Park", "Kim"] -> 김서방은 3에 있다

//  https://programmers.co.kr/learn/courses/30/lessons/12919
public class L1_020 {
    public static void main(String[] args) {
        
        String[] seoul = new String[1001];

        seoul[0] = "hi";
        seoul[1] = "ksd";
        seoul[2] = "Kim";

        Integer idx = 0;
        for(String s : seoul) {
            if("Kim".equals(s))
                break;
            idx++;
        }

        String answer ="김서방은 "+idx+"에 있다";

        System.out.println(answer);
    }
}
