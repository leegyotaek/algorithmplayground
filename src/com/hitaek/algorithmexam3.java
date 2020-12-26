package com.hitaek;

import java.util.Scanner;

public class algorithmexam3 {

    public static void main(String[] args) {
        // 문제3
        // 1부터 n까지의 곱을 재귀함수로 구현하시오
        int result = factorial(4);
        System.out.println(result);
    }

    public static int factorial(int num){
        if(num==1)
            return num;
        else
            return num*factorial(num-1);
    }
}
