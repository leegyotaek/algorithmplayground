package com.hitaek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algorithmexam10 {

    public static void main(String[] args) {
        // 문제 9
        // 삽입정렬 알고리즘
        // 리스트 [5,4,3,2,1]을 삽입정렬(오름차순)하는 과정을 적으시오
        int[] nums = {5,4,3,2,1,3};

        System.out.println("before : " + Arrays.toString(nums));
        insertSort2(nums);
        //System.out.println(insertSort(nums));
    }

    public static void insertSort(int[] nums){

        for(int i=1; i<nums.length; i++){
            int temp=nums[i]; // 정렬할 값을 temp값으로 저장
            for(int j=0; j<i; j++){
                if(temp<nums[j]){
                    // 첫 번째 숫자부터 temp값 인덱스 전까지 비교하여 작은 이 있을 경우
                    for(int k = i; k>j; k--){
                        nums[k] = nums[k-1]; // temp값이 삽일될 인덱스 부터 한칸씩 우측(+1인덱스)으로 이
                    }
                    nums[j] = temp; // Temp값을 정렬할 위치에 삽
                    break;
                }

            }
        }

        System.out.println("After : " + Arrays.toString(nums));

    }

    public static void insertSort2(int[] nums){
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

        System.out.println("After : " + Arrays.toString(nums));

    }




}