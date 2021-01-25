package com.hitaek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class algorithmexam11 {

    public static void main(String[] args) {
        // 문제 10
        // 병합정렬 알고리즘
        // 리스트 [1,5,3,9,7], [2,8,6,4,10] 병합정렬(오름차순)하는 과정을 적으시오
        Integer[] rows1 = {1,5,3,9,7};
        Integer[] rows2 = {2,8,6,4,10};

        List<Integer> list = new ArrayList<>(Arrays.asList(rows1));


        System.out.println("before : " + Arrays.toString(rows1) + "," + Arrays.toString(rows2));

        List group1 = insertSort(rows1);
        List group2 = insertSort(rows2);

        List result = new ArrayList();

       mergeSort(result, group1, group2);

       System.out.println("after : " + result);

    }

    private static List mergeSort(List<Integer> result, List<Integer> group1, List<Integer> group2) {

        if(group1.size()==0){
            result.addAll(group2);
            return result;
        }else if(group2.size()==0){
            result.addAll(group1);
            return result;
        }else{
            if(group1.get(0) >= group2.get(0)){
                result.add(group2.get(0));
                group2.remove(0);
            }
            else{
                result.add(group1.get(0));
                group1.remove(0);
            }
            return mergeSort(result, group1, group2);
        }


    }



    public static List insertSort(Integer[] nums){
        // 모범 답안 알고리즘
        for(int i=1; i<nums.length; i++){
            int key=nums[i]; // 정렬할 값을 temp값으로 저장
            int j=i-1;
            while(j>=0 && nums[j] > key ){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        return new ArrayList<>(Arrays.asList(nums));

    }




}