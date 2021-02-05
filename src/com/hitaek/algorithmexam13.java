package com.hitaek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algorithmexam13 {

    public static void main(String[] args) {
        // 문제 11
        // 퀵정렬 알고리즘2
        // 리스트 [1,5,3,9,7], [2,8,6,4,10] 병합정렬(오름차순)하는 과정을 적으시오
        List<Integer> rows = new ArrayList<Integer>(Arrays.asList(1, 5, 3, 9, 7, 4, 6, 2, 10, 8));

        System.out.println("before : " + rows);

        rows = quickSort(rows);

        System.out.println("after : " + rows);
    }

    private static List<Integer> quickSort(List<Integer> rows) {

        //종료 시점
        if(rows.size()<=1)
            return rows;

        int centreNumber= rows.get(rows.size()/2);
        System.out.println("centreNumber : " + centreNumber);

        List<Integer> group1 = new ArrayList<>();
        List<Integer> group2 = new ArrayList<>();



        for(int n = 0 ; n<rows.size(); n++){
            if(rows.get(n) == centreNumber)
                continue;

            if(rows.get(n) <= centreNumber)
                group1.add(rows.get(n));
            else
                group2.add(rows.get(n));
        }

        System.out.println("group1 : " + group1);
        System.out.println("group2 : " + group2);

        // group1 재귀함수로 정렬
        group1 = quickSort(group1);

        // group2 재귀함수로 정렬
        group2 = quickSort(group2);

        List<Integer> result = new ArrayList<>();

        result.addAll(group1);
        result.add(centreNumber);
        result.addAll(group2);

        return result;

    }
}