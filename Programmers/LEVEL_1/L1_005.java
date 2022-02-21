package Programmers.LEVEL_1;

//  하샤드 수
//  input    : int
//  output   : boolean
//  solution : 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수
//  https://programmers.co.kr/learn/courses/30/lessons/12947
public class L1_005 {
    public static void main(String[] args) {
        int x = 11;
        boolean answer = true;
        int tmp1 = x;
        int sum = 0;
        
        while(tmp1 > 10){
            int cnt = 0;
            
            cnt = tmp1 % 10;
            tmp1 = tmp1 / 10;
            
            sum += cnt;
        }
        
        sum += tmp1;
        
        if(x % sum == 0)
            answer = true;
        else
            answer = false;
 
        System.out.println(answer);
    }
}
