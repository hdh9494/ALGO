package Programmers.LEVEL_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//  오픈채팅방
//  input    : String[]
//  output   : String[]
//  solution : ["Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"]
//          -> ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]

//  https://programmers.co.kr/learn/courses/30/lessons/42888
public class L2_002 {
    public static void main(String args[]) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        // 상수 선언
        final String income = "님이 들어왔습니다.";
        final String outcome = "님이 나갔습니다.";

        Integer len = record.length;
        HashMap<String, String> idMap = new HashMap<String, String>();
        Integer changeCnt = 0;

        for(int i = 0 ; i < len ; i++) {
            String[] temp = record[i].split(" ");

            // 이름 변경
            if("Change".equals(temp[0])) {
                changeCnt++;
                String uid = temp[1];
                String nameChange = temp[2];
                idMap.put(uid, nameChange);

            // 나가기
            } else if ("Leave".equals(temp[0])) {
                // idMap.remove(temp[1]);
            
            // 들어오기
            } else {
                idMap.put(temp[1], temp[2]);
            }
        }

        /* Map 전체 출력
        for (Map.Entry<String, String> entry : idMap.entrySet()) {
            System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
        }
        */

        List<String> resultList = new ArrayList<String>();
        // result값
        for(int i = 0 ; i < len ; i++) {
            String[] temp = record[i].split(" ");
            
            if("Enter".equals(temp[0])) {
                String ret = idMap.get(temp[1]) + income;
                resultList.add(ret);
            } else if ("Leave".equals(temp[0])) {
                String ret = idMap.get(temp[1]) + outcome;
                resultList.add(ret);
            }
        }

        String[] answer = resultList.toArray(new String[resultList.size()]);

        for(int i = 0 ; i < answer.length ; i++)
        {
            System.out.println(answer[i]);
        }
    }
}
