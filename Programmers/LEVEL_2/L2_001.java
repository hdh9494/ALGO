package Programmers.LEVEL_2;

//  문자열 압축
//  input    : String
//  output   : int
//  solution : "ababcdcdababcdcd"의 경우 문자를 1개 단위로 자르면 전혀 압축되지 않지만, 2개 단위로 잘라서 압축한다면 "2ab2cd2ab2cd"로 표현할 수 있습니다.
//              다른 방법으로 8개 단위로 잘라서 압축한다면 "2ababcdcd"로 표현할 수 있으며, 이때가 가장 짧게 압축하여 표현할 수 있는 방법입니다.

//  https://programmers.co.kr/learn/courses/30/lessons/60057
public class L2_001 {
    public static void main(String args[]) {
        String s = "abcabcabcabcdededededede";
        Integer answer = 999999;
        String str = null;

        Integer s_len = s.length() / 2;
        // split한 length 수 (1부터 s_len/2 까지)
        for(int i = 1 ; i <= s_len ; i++)
        {
            String comp = s.substring(0, i);
            String tmp = null;
            StringBuilder sb = new StringBuilder();
            Integer cnt = 1;
            // 새로운 형식 적용
            for(int j = i ; j < s.length() ; j = j + i)
            {
                if(j+i > s.length()){
                    sb.append(s.substring(j, s.length()));
                    break;
                }
                tmp = s.substring(j, j+i);
                if(comp.equals(tmp)){
                    cnt++;
                } else {
                    if(cnt > 1) {
                        sb.append(Integer.toString(cnt));
                    }
                    sb.append(comp);
                    cnt = 1;
                    comp = tmp;
                }
            }
            
            if(cnt > 1)
                sb.append(Integer.toString(cnt));
            sb.append(comp);

            System.out.println(sb.toString());


            if(answer > sb.length()){
                answer = sb.length();
                str = sb.toString();
            }

        }
        System.out.println(str);
        System.out.println(str.length());
    }
}
