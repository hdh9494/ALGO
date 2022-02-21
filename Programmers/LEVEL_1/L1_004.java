package Programmers.LEVEL_1;

//  핸드폰 번호 가리기
//  input    : String
//  output   : String
//  solution : 01033334444 -> *******4444
//              뒷자리 4개를 제외한 모든 숫자는 *로 처리
//  https://programmers.co.kr/learn/courses/30/lessons/12948
public class L1_004 {
    public static void main(String[] args) {
        String phone_number = "01034235552";
        
        int str_len = phone_number.length();

        StringBuilder sb = new StringBuilder(phone_number);
        sb.replace(0, str_len-4, "");

        for(int i = 0 ; i < str_len - 4 ; i++) {
            sb.insert(0, "*");
        }
        
        System.out.println(sb.toString());
        
    }
}
