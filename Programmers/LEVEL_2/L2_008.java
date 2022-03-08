package Programmers.LEVEL_2;

import java.util.Stack;

//  짝지어 제거하기
//  input    : String
//  output   : int

//  solution : 먼저 문자열에서 같은 알파벳이 2개 붙어 있는 짝을 찾습니다. 그다음, 그 둘을 제거한 뒤, 앞뒤로 문자열을 이어 붙입니다.
//  이 과정을 반복해서 문자열을 모두 제거한다면 짝지어 제거하기가 종료됩니다. 성공적으로 수행할 수 있으면 1을, 아닐 경우 0 리턴
//  https://programmers.co.kr/learn/courses/30/lessons/12973
public class L2_008 {
    public static void main(String[] args) {
        
        int answer = -1;
        String str = "baabaaw";
        Stack<String> s = new Stack<>();

        String[] arr = str.split("");

        for(int i = 0 ; i < arr.length ; i++)
        {
            // 스택이 비워져있으면,
            if(s.empty()) {
                s.push(arr[i]);

            // 스택에 값이 있고,
            } else {
                // top()값과 새로 뽑은 값이 같으면
                if(s.peek().equals(arr[i])) {
                    // top() 제거 & 턴 넘기기
                    s.pop();
                } else {
                    s.push(arr[i]);
                }
            }
        }

        if(s.empty()) {
            answer = 1;
        } else {
            answer = 0;
        }

        System.out.println(answer);

        /* A. 단순 구현 But,, 시간초과

        int answer = 1;
        List<String> lists = new ArrayList<>();
        String s = "baabaaw";

        String[] arr = s.split("");
        lists = new ArrayList<>(Arrays.asList(arr));

        List<String> temp = lists;
        int deleteIdx = 0;
        boolean deleteChk = false;

        while(lists.size() > 0)
        {
            deleteChk = false;
            for(int i = 0 ; i < lists.size() - 1 ; i++)
            {
                String target = lists.get(i);
                if(target.equals(lists.get(i+1))) {
                    deleteIdx = i;
                    deleteChk = true;
                    break;
                }
            }

            if(deleteChk == true) {
                temp.remove(deleteIdx);
                temp.remove(deleteIdx);
                lists = temp;
            } else {
                answer = 0;
                break;
            }
        }

        System.out.println(answer);
        */
    }
}
