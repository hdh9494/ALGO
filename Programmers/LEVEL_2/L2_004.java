package Programmers.LEVEL_2;


//  단체사진 찍기
//  input    : String[]
//  output   : int

//  solution
//  실패율 : 각 프렌즈가 원하는 조건을 입력으로 받았을 때 모든 조건을 만족할 수 있도록 서는 경우의 수를 계산
//  ["N~F=0", "R~T>2"] -> 네오는 프로도와의 간격이 0이기를 원하고 라이언은 튜브와의 간격이 2보다 크기를 원하는 상황이다.
//  해당 문제는 순열 -> 순서있게 배열 (조합 : 순서상관없이 뽑은 유무만 판단)

//  https://programmers.co.kr/learn/courses/30/lessons/1835
public class L2_004 {

    public static String[] friends = {"A", "C", "F", "J", "M", "N", "R", "T"};
    public static int answer = 0;
    
    public static void main(String[] args) {
        
        String[] data = {"N~F=0", "R~T>2"};
        boolean[] visited = new boolean[8];
        answer = 0; // 전역변수 초기화
        dfs("", visited, data);

        //return answer;
        System.out.println(answer);
    }

    public static void dfs(String names, boolean[] visited, String[] data)
    {
        if(names.length() == 7)
        {
            if(chk(names, data)) {
                answer++;
            }
            return;
        }
        
        for(int i = 0 ; i < 8 ; i++)
        {
            if(!visited[i])
            {
                visited[i] = true;
                String name = names + friends[i];
                dfs(name, visited, data);
                visited[i] = false;
            }
        }
    }

    public static boolean chk(String names, String[] data)
    {
        for(String target : data)
        {
            int pos_1 = names.indexOf(target.charAt(0));
            int pos_2 = names.indexOf(target.charAt(2));
            int idx = target.charAt(4) - '0'; // int 변환
            char op = target.charAt(3);
            
            int temp = Math.abs(pos_1 - pos_2);

            if(op == '=') {                
                if(temp != idx + 1)
                    return false;
            } else if (op == '>') {
                if(temp <= idx + 1)
                    return false;
            } else if (op == '<') {
                if(temp >= idx + 1)
                    return false;
            }

        }
        return true;
    }
}
