package Programmers.LEVEL_1;

import java.util.*;

//  문자열 내림차순으로 배치하기
//  input    : String
//  output   : String
//  solution : "Zbcdefg" -> "gfedcbZ"
//  s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주

//  https://programmers.co.kr/learn/courses/30/lessons/12917
public class L1_022 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String input = s;
        char[] charArr = input.toCharArray();

        for(int i = 0 ; i < charArr.length; i++) {
            if('a' <= charArr[i] && charArr[i] <= 'z')
                sb1.append(charArr[i]);
            else
                sb2.append(charArr[i]);
        }

        String[] stringArr1 = sb1.toString().split("");
        String[] stringArr2 = sb2.toString().split("");

        Arrays.sort(stringArr1, Collections.reverseOrder());
        Arrays.sort(stringArr2, Collections.reverseOrder());

        String answer_1 = "";
        String answer_2 = "";

        for(int i = 0 ; i < stringArr1.length ; i++) {
            answer_1 = answer_1 + stringArr1[i];
        }

        for(int i = 0 ; i < stringArr2.length ; i++) {
            answer_2 = answer_2 + stringArr2[i];
        }

        String answer = answer_1 + answer_2;

        System.out.println(answer);
    }
}
