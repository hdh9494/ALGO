package Programmers.LEVEL_1;

//  가운데 글자 가져오기
//  input    : String
//  output   : String
//  solution : "abcde" -> c // len가 홀수일 시, 가운데 1개
//             "qwer" -> we // len가 짝수일 시, 중간 2개

//  https://programmers.co.kr/learn/courses/30/lessons/12903
public class L1_029 {
    public static void main(String[] args) {
        String answer = "";
        String input = "qwer";

        int str_len = input.length();

        // 짝수일 시
        if(str_len % 2 == 0) {
            int even_idx = str_len / 2;
            answer = String.valueOf(input.charAt(even_idx-1)) + String.valueOf(input.charAt(even_idx));
        } else {
            int odd_idx = str_len / 2;
            answer = String.valueOf(input.charAt(odd_idx));
        }

        System.out.println(answer);

    }
    
}
