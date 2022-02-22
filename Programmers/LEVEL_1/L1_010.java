package Programmers.LEVEL_1;


//  정수 제곱근 판별
//  input    : long
//  output   : long
//  https://programmers.co.kr/learn/courses/30/lessons/12934
public class L1_010 {
    public static void main(String[] args) {
        long n = 125;
        
        // Math.sqrt는 return값이 Double형 이다.
        Double d = Math.sqrt(n);

        if(d == d.intValue()) {
            System.out.println((long)Math.pow(d+1, 2)); 
        } else {
            System.out.println("-1");
        }

        // 제곱근 (d = 루트n)
        // Double d = Math.sqrt(n);

        // 제곱 (d = a^b)
        // Double d = Math.pow(a,b);

        // 절대값
        // Double d = Math.abs(a);
    }
}
