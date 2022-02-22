package Programmers.LEVEL_1;

//  최대공약수, 최소공배수 구하기
//  input    : int, int
//  output   : int[]
//  https://programmers.co.kr/learn/courses/30/lessons/12940
public class L1_008 {
    public static void main(String[] args) {
        int n = 20;
        int m = 12;
        int min = 1;
        int max = 1;

        boolean flag = true;

        while(flag)
        {
            for(int i = 2 ; i <= (n > m ? n : m) ; i++) {
                if(n % i == 0 && m % i == 0) {
                    n = n / i;
                    m = m / i;
                    max = max * i;
                    min = min * i;
                    break;
                }
            }

            int check_cnt = 0;
            for(int i = 2 ; i <= (n > m ? n : m) ; i++) {
                if(n % i == 0 && m % i == 0)
                    check_cnt++;
            }

            if(check_cnt > 0)
                flag = true;
            else
                flag = false;
        }

        max *= n;
        max *= m;

        System.out.println("최소공배수 : "+max);
        System.out.println("최대공약수 : "+min);
    }
}
