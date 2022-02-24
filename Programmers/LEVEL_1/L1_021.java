package Programmers.LEVEL_1;


//  문자열 다루기 기본
//  input    : String
//  output   : boolean
//  solution : "a123" -> false(문자) / "1234" -> true(숫자)


//  1. String -> char[] 변환 시켜주는 함수
//     char[] charArr = s.toCharArray();           

//  2. 문제 꼼꼼하게 읽기... 문자열 길이가 4 or 6이고!!!
//     문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수

//  https://programmers.co.kr/learn/courses/30/lessons/12918
public class L1_021 {
    public static void main(String[] args) {

        boolean answer = true;

        String input = "2345";

        char[] charArr = input.toCharArray();

        if(charArr.length == 4 || charArr.length == 6) {
            for(int i = 0 ; i < charArr.length ; i++) {
                if('a' <= charArr[i] && charArr[i] <= 'z'){
                    answer = false;
                    break;
                }
            }
        } else {
            answer = false;
        }

        

        System.out.print(answer);

    }
}
