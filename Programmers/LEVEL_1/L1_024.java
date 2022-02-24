package Programmers.LEVEL_1;

import java.util.*;

// 문자열 내 마음대로 정렬하기
// input        : String[]
// output       : String[]
// solution     : 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬
// ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬
// ["abce", "abcd", "cdx"] , n=2  ->  ["abcd", "abce", "cdx"]

// https://programmers.co.kr/learn/courses/30/lessons/12915
public class L1_024 {
    public static void main(String[] args) {
        // String[] strings = {"abce", "abcd", "cdx"};
        String[] strings = 	{"ae", "be", "ce", "ae"};
        int n = 1;

        Arrays.sort(strings, new Comparator<String>() {
           
            @Override
            public int compare(String s1, String s2) {
                if(s1.charAt(n) < s2.charAt(n)) {
                    return -1;
                } else if (s1.charAt(n) > s2.charAt(n)) {
                    return 1;
                } else {
                    if(s1.compareTo(s2) < 0) {
                        return -1;
                    } else if (s1.compareTo(s2) > 0) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        for(int i = 0 ; i < strings.length ; i++) {
            System.out.print(strings[i]+", ");
        }

        /* Integer.compare은 단순히 첫번째 매개변수와 두번째 매개변수가 오름차순으로 유지될 수 있도록 값을 비교해 주는 메서드
        public int compare(int x, int y) {
            return (x < y) ? -1 : ( (x == y) ? 0 : 1 );
        }
        */
    }
}
