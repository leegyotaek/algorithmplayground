package com.hitaek;

import java.util.*;

public class algorithmexam16_3 {

    public static void main(String[] args) {

        // 문제 16-3
        // 그래프 탐색 알고리즘 구현


        Map<Integer, List<Integer>> gInfo = new HashMap<Integer, List<Integer>>();

        gInfo.put(1, new ArrayList<>(Arrays.asList(2,3)));
        gInfo.put(2, new ArrayList<>(Arrays.asList(4,5)));
        gInfo.put(4, new ArrayList<>(Arrays.asList(6,8)));
        gInfo.put(5, new ArrayList<>(Arrays.asList(7,9)));



        printAllDirection(new ArrayList<>() , gInfo, 1);

    }

    private static void printAllDirection(List<Integer>result, Map gInfo, int startPoint) {

        result.add(startPoint);

        //System.out.print(startPoint);
        if(!gInfo.containsKey(startPoint)) {
            System.out.println(result);
            return;
        }
        List<Integer> node = (List<Integer>) gInfo.get(startPoint);

        while(!node.isEmpty()) {
            int num = node.remove(0);
            printAllDirection(result, gInfo, num);
            result.remove(new Integer(num));
        }

    }






}