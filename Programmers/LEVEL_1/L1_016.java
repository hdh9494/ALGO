package Programmers.LEVEL_1;

//  시저 암호
//  input    : String(변환할 문자열) / int (이동시킬 거리)
//  output   : String
//  solution :  "AB" / 1 -> "BC"
//              "z" / 1 -> "a"
//              "a B z" / 4 -> "e F d"


// https://programmers.co.kr/learn/courses/30/lessons/12926
// int, char 간의 형변환, 케이스 예외처리
public class L1_016 {
    public static void main(String[] args){
        String input = "AaZz";
        StringBuilder sb = new StringBuilder();
        String answer = null;
        int n = 25;

        int s_len = input.length();

        for(int i = 0 ; i < s_len ; i++) {
            // 변경 전
            char c_val = input.charAt(i);
            int i_val = (int) c_val;

            // 변경 후
            int next_i_val = i_val + n;
            char next_c_val = (char) next_i_val;

            if('A' <= c_val && c_val <= 'Z') {
                if('Z' < next_c_val){
                    next_i_val = next_i_val - 26;
                    sb.append((char) next_i_val);
                } else {
                    sb.append(next_c_val);
                }
            } else if ('a' <= c_val && c_val <= 'z') {
                if('z' < next_c_val) {
                    next_i_val = next_i_val - 26;
                    sb.append((char) next_i_val);
                } else {
                    sb.append(next_c_val);
                }
            } else if (c_val == ' ') {
                sb.append(" ");
            }
        }

        answer = sb.toString();

        System.out.println(answer);

    }
}
