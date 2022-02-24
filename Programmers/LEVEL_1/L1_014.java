package Programmers.LEVEL_1;

// 이상한 문자 만들기
// input        : String
// output       : String
// solution     : "try hello world" -> "TrY HeLlO WoRlD"
// https://programmers.co.kr/learn/courses/30/lessons/12930
public class L1_014 {
    public static void main(String[] args) {
        String answer = "";
        String input = "TrAINiNg CENTEr is tHe MOSt imPORTaNt tHIng tHAt I SAW it";

        String[] stringArr = input.split("");

        int idx = 0;
        for(int i = 0 ; i < stringArr.length ; i++) {
            String val = stringArr[i];

            if(val.equals(" ")){
                System.out.println("공백 / idx : "+i);
                idx = 0;
                answer = answer + " ";
            } else if(idx % 2 == 0) {
                String tmp_1 = val.toUpperCase();
                answer = answer + tmp_1;
                idx++;
            } else {
                String tmp_2 = val.toLowerCase();
                answer = answer + tmp_2;
                idx++;
            }
        }

        System.out.println(answer);
    }
}
