package com.hitaek;

import javax.swing.*;
import java.util.*;

public class algorithmexam18 {

    public static void main(String[] args) {

        // 문제 18
        // 주식 최대 수익 알고리즘
        // 다음과 같이 특정기간동안의 가격변화가 주어 졌을때 그 주식 한주를 한 번 사고 팔아 얻을 수 있는 최대 수익을 계산 하시오
        /*
        * 6/1 : 10,300
        * 6/2 : 9,600
        * 6/3 : 9,800
        * 6/4 : 8,200
        * 6/5 : 7,800
        * 6/7 : 8,300
        * 6/9 : 9,500
        * 6/10 : 9,800
        * 6/11: 10,200
        * 6/12 : 9,500
        *
        * */

        List<Integer> prices = Arrays.asList(
                10300, 9600, 9800, 8200, 7800, 8300, 9500, 9800, 10200, 9500);

        System.out.println(findMaxEarning2(prices));
    }

    private static int findMaxEarning(List<Integer> prices) {
        // 느린 알고리즘 0(n*n)
        int max = 0;
        for(int i = 0; i<prices.size()-1; i++){
            for(int j=i+1; j<prices.size(); j++){
                //System.out.println(String.format("i : %s , j: %s " , i , j));
                if(prices.get(j)-prices.get(i) > max)
                    max = prices.get(j)-prices.get(i);
            }
        }

        return max;

    }

    private static int findMaxEarning2(List<Integer> prices) {

        // 빠른 알고리즘 O(N)
        int maxProfit = 0;
        int minPrice = prices.get(0);

        for(int n = 0; n<prices.size(); n++){
            if(prices.get(n) - minPrice > maxProfit)
                maxProfit = prices.get(n) - minPrice;

            if(prices.get(n) < minPrice)
                minPrice = prices.get(n);

        }
        return maxProfit;

    }

}