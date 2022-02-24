package Programmers.LEVEL_1;

// 자연수 뒤집어 배열로 만들기
// input        : long
// output       : int[] 배열
// solution     : 12345 -> [5,4,3,2,1] 
//  https://programmers.co.kr/learn/courses/30/lessons/12932
public class L1_012 {
    public static void main(String[] args) {
        
        long input = 12345;

        String s = String.valueOf(input);
        StringBuilder sb = new StringBuilder(s);
        Integer len = s.length();
        
        System.out.println("len : "+len);

        sb.reverse();

        String[] stringArr = sb.toString().split("");
        
        Integer[] answer = new Integer[len];

        for(int i = 0 ; i < len ; i++) {
            answer[i] = Integer.parseInt(stringArr[i]);
        }
        
        for(int i = 0 ; i < len; i++) {
            System.out.print(answer[i]+", ");
        }

    }
}
