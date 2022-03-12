package Programmers.LEVEL_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class L2_010 {
    public static void main(String[] args) {
        String[] orders = {"XYZ", "XWY", "WXA"};
        int[] course = {2,3,4};

        List<String> alphaAll = new ArrayList<>();

        for(int i = 0 ; i < orders.length ; i++) {
            int idx = 0;
            for(int j = 0 ; j < orders[i].length() ; j++) {
                alphaAll.add(String.valueOf(orders[i].charAt(idx++)));
            }
        }

        List<String> alpha = alphaAll.stream()
                                    .distinct()
                                    .sorted()
                                    //.sorted(Collections.reverseOrder())
                                    .collect(Collectors.toList());

        for(int i = 0 ; i < course.length ; i++)
        {
            int size = course[i];
            //dfs()
        }
    }

    //public static void dfs()
}
