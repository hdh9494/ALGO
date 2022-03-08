package Programmers.LEVEL_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L2_008 {
    public static void main(String[] args) {
        
        int answer = 1;
        List<String> lists = new ArrayList<>();
        String s = "baabaaw";

        String[] arr = s.split("");
        lists = new ArrayList<>(Arrays.asList(arr));

        List<String> temp = lists;
        int deleteIdx = 0;
        boolean deleteChk = false;

        while(lists.size() > 0)
        {
            deleteChk = false;
            for(int i = 0 ; i < lists.size() - 1 ; i++)
            {
                String target = lists.get(i);
                if(target.equals(lists.get(i+1))) {
                    deleteIdx = i;
                    deleteChk = true;
                    break;
                }
            }

            if(deleteChk == true) {
                temp.remove(deleteIdx);
                temp.remove(deleteIdx);
                lists = temp;
            } else {
                answer = 0;
                break;
            }
        }

        System.out.println(answer);

    }
}
