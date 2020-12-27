package com.hitaek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algorithmexam5 {

    public static void main(String[] args) {

        // 문제3
        // 숫자 N개 중에서 최대값 찾기를 재귀함수로 구현하시오
        int[] numArr = {1,2,3,4,5};
        System.out.print(max(numArr));
        List nums = new ArrayList();
        Scanner sc = new Scanner(System.in);
    }

    public static int max(int[] arr){
       /* int len = arr.length;
        int max = arr[0];
        for(int n=1; n<len; n++){
            if (max < arr[n])
                max = arr[n];
        }
        return max;*/
       int max = arr[0];

       //return recursiveMax(arr, 0, max);
        return recursiveMax2(arr, 4);
    }

    public static int recursiveMax(int[] arr, int offSet, int max){
        if(offSet==arr.length)
            return max;
        else{
            if(arr[offSet] > max){
                return recursiveMax(arr, offSet+1, arr[offSet]);
            }
            else
                return recursiveMax(arr, offSet+1, max);
        }
    }

    public static int recursiveMax2(int[] arr, int num){
        if(num == 0)
            return arr[0];
        else{
            int maxNum = recursiveMax2(arr, num-1);

            if(arr[num] > maxNum)
                maxNum = arr[num];
            else
                maxNum = arr[num-1];

            return maxNum;
        }
    }


}
