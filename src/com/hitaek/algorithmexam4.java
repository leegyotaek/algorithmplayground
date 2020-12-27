package com.hitaek;

import java.util.Scanner;

public class algorithmexam4 {

    public static void main(String[] args) {
        // 문제3
        // 1부터 n까지의 합을 재귀함수로 구현하시오
        Scanner sc = new Scanner(System.in);

        System.out.print("Input N : " );
        int num = sc.nextInt();

        StringBuffer sb = new StringBuffer();
        for(int i = 1; i<=num; i++){
            sb.append(i+"+");
        }
        int lastIndex = sb.lastIndexOf("+");
        sb.deleteCharAt(lastIndex);
        sb.append(" = "+ sum(num));
        System.out.println(sb.toString());
    }

    public static int sum(int num){
        if (num == 1)
            return 1;
        else
            return sum(num-1) + num;
    }



}
