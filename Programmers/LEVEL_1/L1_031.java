package Programmers.LEVEL_1;

//  부족한 금액 계산하기
//  input    : int(price, money, count)
//  output   : int
//  solution : 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
//  놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 return 하도록 solution 함수를 완성하세요. 단, 금액이 부족하지 않으면 0을 return 하세요.

//  https://programmers.co.kr/learn/courses/30/lessons/82612
public class L1_031 {
    public static void main(String[] args) {
        long answer = -1;

        int price = 3;
        int money = 20;
        int count = 4;

        long payment = 0;
        for(int i = 1 ; i <= count ; i++) {
            long up_price = price * i;
            payment += up_price;
        }
        
        if(money > payment)
            answer = 0;
        else
            answer = payment - money;

        System.out.println(answer);
    }
}
