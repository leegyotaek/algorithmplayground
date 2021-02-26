package com.hitaek;

import java.awt.*;
import java.util.*;
import java.util.List;

public class algorithmexam17 {

    public static void main(String[] args) {

        // 문제 17
        // 미로 찾기 알고리즘
        Map<String, List<String>> dInfo = new HashMap<String, List<String>>();

        dInfo.put("a", new ArrayList<>(Arrays.asList("e")));
        dInfo.put("b", new ArrayList<>(Arrays.asList("c","f")));
        dInfo.put("c", new ArrayList<>(Arrays.asList("b","d")));
        dInfo.put("d", new ArrayList<>(Arrays.asList("c")));
        dInfo.put("e", new ArrayList<>(Arrays.asList("a","i")));
        dInfo.put("f", new ArrayList<>(Arrays.asList("b","g","j")));
        dInfo.put("g", new ArrayList<>(Arrays.asList("f","h")));
        dInfo.put("h", new ArrayList<>(Arrays.asList("g","l")));
        dInfo.put("i", new ArrayList<>(Arrays.asList("e","m")));
        dInfo.put("j", new ArrayList<>(Arrays.asList("f","k","n")));
        dInfo.put("k", new ArrayList<>(Arrays.asList("j","o")));
        dInfo.put("l", new ArrayList<>(Arrays.asList("h","p")));
        dInfo.put("m", new ArrayList<>(Arrays.asList("i","n")));
        dInfo.put("n", new ArrayList<>(Arrays.asList("m","j")));
        dInfo.put("o", new ArrayList<>(Arrays.asList("k")));
        dInfo.put("p", new ArrayList<>(Arrays.asList("l")));

        findShortcutWay(dInfo, "a", "p", new ArrayList<>(), new ArrayList<>(Arrays.asList("a")) );

    }

    private static void findShortcutWay(Map<String, List<String>> dInfo, String start, String end,  List<String> done , List<String> result) {

        done.add(start);

        // 종료 시점
        if(start.equals(end)){
            System.out.println(result);
            return;
        }

        List<String> spots = dInfo.get(start);

        if(spots.size()==1){
            String spot = spots.get(0);
            result.add(spot);
            findShortcutWay(dInfo, spot, end, done, result);
        }else{ // spots.size()>2
            // undo <= start;
            for(String spot : spots){

                List<String> newResult = new ArrayList<>();
                newResult.addAll(result);

                if(done.contains(spot)==false){
                    newResult.add(spot);
                    findShortcutWay(dInfo, spot, end, done, newResult);
                }

            }
        }








    }


}