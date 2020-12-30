package com.hitaek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algorithmexam6 {

    public static void main(String[] args) {

        // 문제6
        // N번째 피보나치 수를 구하는 알고리즘을 재귀 호출을 이용하여 구하기
        System.out.println(getFibonacci(11));
    }

    public static int getFibonacci(int num){

        if(num==1)
            return 0;
        else if(num==2)
            return 1;
        else
            return getFibonacci(num-2)+getFibonacci(num-1);
    }



}
