package com.hitaek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algorithmexam14 {

    public static void main(String[] args) {
        // 문제 14
        // 이분검색 알고리즘
        // 리스트 [1,4,9,16,25,36,49,64,81]를 이분검색(binary search) 과정을 적으시오
        List<Integer> rows = new ArrayList<Integer>(Arrays.asList(1,4,9,16,25,36,49,64,81));

        System.out.println(binarySearch(rows, 64, 0, rows.size()-1));

    }

    private static int binarySearch(List<Integer> rows, int findNum, int startIdx, int endIdx) {

        if (startIdx==endIdx)
            return -1;

        // 종료조건
        int midIdx = (startIdx+endIdx) / 2;

        if(rows.get(midIdx) == findNum)
            return midIdx;

        if(findNum > rows.get(midIdx)){
            startIdx = ++midIdx;
            return binarySearch(rows, findNum, startIdx, endIdx);
        }
        else {
            endIdx = --midIdx;
            return binarySearch(rows, findNum, startIdx, endIdx);
        }
    }


}