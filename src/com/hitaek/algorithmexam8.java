package com.hitaek;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algorithmexam8 {

    public static void main(String[] args) {

        // 문제 8
        // 탐색정렬 구현
        // 찾는 값이 있는 모든 위치를 리스트로 돌려주는 탐색알고리즘을 만드시오
        List<Integer> nums = new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(4);
                add(5);
                add(6);
                add(5);
                add(4);
                add(3);
                add(2);
                add(1);
            }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the number you are looking for : ");
        int searchNum = scanner.nextInt();

        List<Integer> results = new ArrayList<>();

        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) == searchNum)
                results.add(i);
        }

        System.out.println("\nresults : " + results);
    }


}
