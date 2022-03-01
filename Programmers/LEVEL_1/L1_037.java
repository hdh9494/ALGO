package Programmers.LEVEL_1;

import java.util.Arrays;

//  예산
//  input    : int[], int
//  output   : int
//  solution : 물품을 구매해 줄 때는 각 부서가 신청한 금액만큼을 모두 지원해 줘야 합니다. 예를 들어 1,000원을 신청한 부서에는 정확히 1,000원을 지원해야 하며,
//             1,000원보다 적은 금액을 지원해 줄 수는 없습니다.
//  d : [1,3,2,5,4] / budget : 9
//  A. 1원, 2원, 3원을 신청한 부서의 물품을 구매해주려면 6원이 필요합니다.
//  B. 1원, 2원, 5원을 신청한 부서의 물품을 구매해주려면 8원이 필요합니다.
//  C. 1원, 3원, 4원을 신청한 부서의 물품을 구매해주려면 8원이 필요합니다.
//  D. 1원, 3원, 5원을 신청한 부서의 물품을 구매해주려면 9원이 필요합니다.

//  3개 부서보다 더 많은 부서의 물품을 구매해 줄 수는 없으므로 최대 3개 부서의 물품을 구매해 줄 수 있습니다.

//  https://programmers.co.kr/learn/courses/30/lessons/12982
public class L1_037 {
    public static void main(String[] args) {
        int answer = 0;
        int[] d = {1,3,2,5,4};
        int budget = 9;

        Arrays.sort(d);

        int sum = 0;
        for(int i = 0 ; i < d.length ; i++) {
            sum += d[i];
            if(sum > budget) {
                answer = i;
                //return answer;
                System.out.println(answer);
            }
        }
        answer = d.length;
        //return answer;
        System.out.println(answer);
    }
}
