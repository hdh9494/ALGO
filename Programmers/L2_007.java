package Programmers;

//  타겟 넘버
//  input    : int[]
//  output   : int

//  solution (DFS)
//  n개의 음이 아닌 정수들이 있습니다. 이 정수들을 순서를 바꾸지 않고 적절히 더하거나 빼서 타겟 넘버를 만들려고 합니다.
//  예를 들어 [1, 1, 1, 1, 1]로 숫자 3을 만들려면 다음 다섯 방법을 쓸 수 있습니다.
//  https://programmers.co.kr/learn/courses/30/lessons/43165
public class L2_007 {

    public static int answer = 0;
    public static void main(String[] args) {
        answer = 0;
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        dfs(numbers, target, 0, 0);

        //return answer;
        System.out.println(answer);
    }

    public static void dfs(int[] numbers, int target, int idx, int sum)
    {
        if(idx == numbers.length) {
            if(sum == target)
                answer++;
            return;
        }

        sum = sum + numbers[idx];
        dfs(numbers, target, idx+1, sum);
        sum = sum - numbers[idx];

        sum = sum + (numbers[idx] * -1);
        dfs(numbers, target, idx+1, sum);
    }


    /* A. 재귀 방법인데, For에 DFS가 포함되어 시간초과 발생
    
    public static void main(String[] args) {
        answer = 0;
        int[] numbers = {4, 1, 2, 1};
        int target = 4;

        boolean[] visited = new boolean[numbers.length];
        List<Integer> resultList = new ArrayList<>();

        dfs(numbers, visited, target, resultList, 0, 0);

        System.out.println(answer);

    }

    public static void dfs(int[] numbers, boolean[] visited, int target, List<Integer> resultList, int n, int r)
    {
        if(r == numbers.length)
        {
            if(chk(resultList, target))
                answer++;
            return;
        }

        for(int i = n ; i < numbers.length ; i++)
        {
            if(!visited[i])
            {
                visited[i] = true;
                resultList.add(numbers[i]);
                dfs(numbers, visited, target, resultList, i + 1, r + 1);
                resultList.remove(resultList.size()-1);
                
                resultList.add(numbers[i] * -1);
                dfs(numbers, visited, target, resultList, i + 1, r + 1);
                resultList.remove(resultList.size()-1);

                visited[i] = false;
            }

        }
    }

    public static boolean chk(List<Integer> resultList, int target)
    {
        int value = 0;
        for(int i = 0 ; i < resultList.size() ; i++) {
            value += resultList.get(i);
        }

        if(value != target)
            return false;

        return true;
    }
    */
}
