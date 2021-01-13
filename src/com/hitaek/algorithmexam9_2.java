package com.hitaek;

import java.util.ArrayList;
import java.util.List;

public class algorithmexam9_2 {

    public static void main(String[] args) {
        // 문제 9
        // 선택정렬 알고리즘
        // 문자열 리스트을 정렬하는 알고리즘
        List<String> words = new ArrayList<String>(){{
            add("Firework");
            add("apple");
            add("banana");
            add("train");
            add("test");
            add("test");
            add("xenserver");
        }};

        words = sortWord(words);
        System.out.println(words);

    }

    private static List<String> sortWord(List<String> words) {

        for(int i=0; i<words.size(); i++){
            int minIdx=i;
            for(int j=i+1; j<words.size(); j++){
                if(words.get(j).compareToIgnoreCase(words.get(minIdx)) < 0){
                    minIdx = j;
                }
            }
            String temp = words.get(i);
            words.set(i, words.get(minIdx));
            words.set(minIdx, temp);
        }

        return words;
    }


}
