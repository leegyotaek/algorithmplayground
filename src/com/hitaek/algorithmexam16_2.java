package com.hitaek;

import java.util.*;

public class algorithmexam16_2 {

    public static void main(String[] args) {

        // 문제 16
        // 그래프로 친구찾기 알고리즘2
        // 친밀도 계산 추가하기


        Map frInfo = new HashMap<String, List<String>>();

        frInfo.put("Summer", Arrays.asList("John", "Justin", "Mike"));
        frInfo.put("John", Arrays.asList("Summer", "Justin"));
        frInfo.put("Justin", Arrays.asList("John", "Summer", "Mike", "May"));
        frInfo.put("Mike", Arrays.asList("Summer", "Justin"));
        frInfo.put("May", Arrays.asList("Justin", "Kim"));
        frInfo.put("Kim", Arrays.asList("May"));
        frInfo.put("Tom", Arrays.asList("Jerry"));
        frInfo.put("Jerry", Arrays.asList("Tom"));


        printAllFriends(frInfo, "Summer");

    }

    private static void printAllFriends(Map frInfo, String name) {
        List<String> list = new ArrayList();
        Set done = new HashSet();

        list.add(name);
        done.add(name);

        while(!list.isEmpty()){
            String p = list.remove(0);
            System.out.println(p);

            for(String x : (List<String>)frInfo.get(p)){
                if(!done.contains(x)){
                    list.add(x);
                    done.add(x);
                }

            }

        }

    }


}