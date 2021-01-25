package com.hitaek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algorithmexam12 {

    public static void main(String[] args) {
        // 문제 11
        // 병합정렬 알고리즘2
        // 리스트 [1,5,3,9,7], [2,8,6,4,10] 병합정렬(오름차순)하는 과정을 적으시오
        List<Integer> rows = new ArrayList<Integer>(Arrays.asList(1,5,3,9,7,2,6,4,10,8));

        System.out.println("before : " + rows);

        rows = mergeSort(rows);

        System.out.println("after : " + rows);
    }

    private static List<Integer> mergeSort(List<Integer> rows) {

        int len = rows.size();

        if(len<=1)
            return rows;

        int half = len / 2;

        List<Integer> group1 = mergeSort(new ArrayList<>(rows.subList(0, half)));
        List<Integer> group2 = mergeSort(new ArrayList<>(rows.subList(half, len)));

        List result = new ArrayList();

        while (group1.size() > 0 && group2.size() > 0) {
            if(group1.get(0) > group2.get(0)){
                result.add(group2.remove(0));

            }else{
                result.add(group1.remove(0));
            }
        }

       if(group1.size()>0){
            result.addAll(group1);
        }else if(group2.size()>0){
            result.addAll(group2);
        }
        return result;
    }

}