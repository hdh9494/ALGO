package Programmers.LEVEL_1;

// 문자열 내 p와 y의 개수
// input        : String
// output       : boolean
// solution     : "pPoooyY" -> true / "Pyy" -> false
// 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return

// https://programmers.co.kr/learn/courses/30/lessons/12916
public class L1_023 {
    public static void main(String[] args) {
        Boolean answer = true;

        int p_cnt = 0;
        int y_cnt = 0;
        String input = "Pyy";
        String input_lower = input.toLowerCase();

        String[] stringArr = input_lower.split("");

        for(int i = 0 ; i < stringArr.length ; i++) {
            if("p".equals(stringArr[i]))
                p_cnt++;
            else if ("y".equals(stringArr[i]))
                y_cnt++;
        }

        if(p_cnt != y_cnt)
            answer = false;

        System.out.println(answer);
    }
}
