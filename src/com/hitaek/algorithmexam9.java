package com.hitaek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class algorithmexam9 {

    public static void main(String[] args) {
        // 문제 9
        // 선택정렬 알고리즘
        // 리스트 [2,4,5,1,3]을 정렬(오름차순)하는 과정을 적으시오
        List<Integer> nums = new ArrayList<Integer>(){{
            add(2);
            add(4);
            add(5);
            add(1);
            add(3);
        }};
        System.out.println(selectionSort(nums));
    }

    public static List selectionSort(List<Integer> list){
        List<Integer> result = new ArrayList<Integer>();
       while(list.size()!=0){
           int min = list.get(0);
           for(int i=0; i<list.size(); i++){
               if(list.get(i) < min) {
                   System.out.println("\n["+min+"]=>["+list.get(i)+"]");
                   min = list.get(i);
               }
           }
           result.add(min);
           list.remove(list.indexOf(min));
           System.out.println(list);
       }
       return result;
    }
}
