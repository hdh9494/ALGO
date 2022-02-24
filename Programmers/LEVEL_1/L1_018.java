package Programmers.LEVEL_1;

//  수박수박수박수박수?
//  input    : int
//  output   : String
//  solution : 3 -> "수박수" / 4 -> "수박수박"
//             n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴

//  https://programmers.co.kr/learn/courses/30/lessons/12922
public class L1_018 {
    public static void main(String[] args) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        int input = 4;

        String val_1 = "수";
        String val_2 = "수박";

        int cnt = input / 2;
        for(int i = 0 ; i < cnt ; i++)
            sb.append(val_2);

        if(input % 2 != 0)
            sb.append(val_1);

        answer = sb.toString();
        
        System.out.println(answer);
    }
}
