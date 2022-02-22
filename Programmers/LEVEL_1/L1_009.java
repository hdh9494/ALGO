package Programmers.LEVEL_1;


//  제일 작은 수 제거하기
//  input    : int[]
//  output   : int[]
//  https://programmers.co.kr/learn/courses/30/lessons/12935
public class L1_009 {
    public static void main(String[] args) {

        int[] arr = {4,3,2,1};

        int min = 999;
        int idx = 0;
        int length = arr.length;
        
        if(length == 1){
            int[] answer = new int[1];
            answer[0] = -1;
        } else {
            int[] answer = new int[length-1];
            
            for(int i = 0 ; i<length ; i++)
            {
                if(arr[i] < min){
                    min = arr[i];
                    idx = i;
                }
            }

            for(int k = 0 ; k < idx ; k++)
                answer[k] = arr[k];

            for(int w = idx ; w < length - 1 ; w++)
                answer[w] = arr[w+1];
        }
    }
}
