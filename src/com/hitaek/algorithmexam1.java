package com.hitaek;

import java.util.Scanner;

public class algorithmexam1 {

    public static void main(String[] args) {


    // 문제1
    // 1부터 n까지의 연속한 숫자의 제곱의 합 구하기
        int exitNum = 0;
        Scanner sc = new Scanner(System.in);

        while(exitNum!=-1){
            System.out.print("input number N(Exit:-1) : ");
            int num = sc.nextInt();

            int result = getSquareSum2(num);
            System.out.println("Result : " + result);
        }

    }

    private static int getSquareSum(int num) {
        int sum = 0;

        for(int i = 1; i<=num; i++)
            sum += i*i;

        return sum;
    }

    private static int getSquareSum2(int n) {
        return n*(n+1)*(2*n+1)/6;
    }
}
