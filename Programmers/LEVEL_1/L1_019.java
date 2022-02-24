package Programmers.LEVEL_1;

//  소수 찾기
//  input    : int
//  output   : int
//  solution : 10 -> 4
//             1 ~ 10 사이의 소수는 [2,3,5,7] 4개가 존재

//  https://programmers.co.kr/learn/courses/30/lessons/12921
//  에라토스테네스의 체
public class L1_019 { 
    public static void main(String[] args) {

        int answer = 0;

        // 구하고자 하는 숫자 범위
        int input = 10;
        boolean[] prime = new boolean[input+1];
        
        // 소수는 false
        // 1은 소수가 아니므로 제외
        prime[0] = prime[1] = true;
        
        for(int i = 2; i * i <= input; i++){
            // prime[i]가 소수라면
            if(!prime[i]){
                // prime[j] 소수가 아닌 표시
                for(int j = i * i; j <= input; j = j + i)
                    prime[j] = true;                
            }        
        }    
        
        // 소수 출력
        for(int i = 1; i <= input ; i++){
            if(!prime[i])
                answer++;
        }
        
        System.out.println(answer);

    }

}
