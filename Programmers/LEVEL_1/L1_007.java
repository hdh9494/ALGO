package Programmers.LEVEL_1;

//  콜라츠 추측
//  input    : long
//  output   : int

//  1-1. 입력된 수가 짝수라면 2로 나눕니다. 
//  1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//  2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
//  예를 들어, 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야하는지 반환하는 함수, solution을 완성해 주세요.
//  단, 작업을 500번을 반복해도 1이 되지 않는다면 –1을 반환해 주세요.

//  https://programmers.co.kr/learn/courses/30/lessons/12943
public class L1_007 {
    public static void main(String[] args) {
        long num = 626331;
        long tmp = num;
        int cnt = 0;
        int answer = 0;
        
        for(int i = 0 ; i<500 ; i++)
        {
            if(tmp == 1)
                break;
            
            if(tmp % 2 == 0){
                tmp = tmp / 2;
                cnt++;
            }
            
            else if(tmp % 2 != 0){
                tmp = tmp * 3;
                tmp = tmp + 1;
                cnt++;
            }
        }
        
        if(tmp != 1)
            answer = -1;
        else
            answer = cnt;
        
        System.out.println(answer);
    }
}
