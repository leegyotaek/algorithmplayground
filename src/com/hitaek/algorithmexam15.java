package com.hitaek;

import java.lang.reflect.Array;
import java.util.*;

public class algorithmexam15 {

    public static void main(String[] args) {
        // 문제 15
        // 회문인지 아닌지 판단하는 알고리즘

        System.out.println(palindrome2("testtttset"));
        System.out.println(palindrome("wow"));
        System.out.println(palindrome("madam"));





    }

    public static boolean palindrome(String s){
        int endIdx = s.length()-1;

        for(int n=0 ; n<=endIdx; n++){
            if (s.charAt(n) != s.charAt(endIdx-n))
                return false;
        }

        return true;
    }

    public static boolean palindrome2(String s){
        // 리스트 스택을 이용하여 구현하기

        List list = new ArrayList();
        Stack stack= new Stack();

        for(int n = 0; n < s.length(); n++){
            list.add(s.charAt(n));
            stack.push(s.charAt(n));
        }

        for(int n = 0; n < s.length(); n++){
            if(list.get(n)!=stack.pop())
                return false;
        }

        return true;







    }




}