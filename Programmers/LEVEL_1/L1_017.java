package Programmers.LEVEL_1;

//  문자열을 정수로 바꾸기
//  input    : String
//  output   : int
//  solution : 1234 -> 1234
//             -1234 -> -1234

// https://programmers.co.kr/learn/courses/30/lessons/12925
public class L1_017 {
    public static void main(String[] args) {
        
        String input = "-1234";
        StringBuilder sb = new StringBuilder(input);

        char mark = input.charAt(0);
        boolean flag = true;

        if(mark == '+') {
            sb.delete(0, 0);
        } else if (mark == '-') {
            sb.deleteCharAt(0);
            flag = false;
        }

        int answer = 0;

        if(flag == true) {
            answer = answer + Integer.parseInt(sb.toString());
        } else {
            answer = answer - Integer.parseInt(sb.toString());
        }
            
        System.out.println("값 : "+answer);

    }
}
