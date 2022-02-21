package Programmers.LEVEL_1;

//  평균 구하기
//  input    : int[]
//  output   : double
//  https://programmers.co.kr/learn/courses/30/lessons/12944
public class L1_006 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        double answer = 0;
        double sum = 0;
        int cnt = arr.length;
        
        for(int i = 0 ; i<cnt ; i++)
        {
            sum += (double)arr[i];
        }
        
        answer = sum / cnt;
        
        System.out.println(answer);

    }
}
