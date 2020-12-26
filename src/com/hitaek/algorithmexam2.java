package com.hitaek;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class algorithmexam2 {

    public static void main(String[] args) {

        // 문제2
        // n명 중 두명을 뽑아 짝을 짓는다고 할 때 짝을 지을 수 있는 모든 조합을 출력하는 알고리즘을 만드시오
        String namelist = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name list delimited by comma(ex a,b,c) : ");
        namelist = sc.next();

        String[] arrNames = namelist.split(",");
        StringBuffer sb = new StringBuffer("{");

        int n = arrNames.length;
        System.out.println("N: " + n);

        for(int i = 0; i<n; i++){
            for(int j=i+1; j<n; j++){
                sb.append(arrNames[i]+":"+arrNames[j]+",");

                if(i==(n-2)&&j==(n-1))
                    sb.deleteCharAt(sb.length()-1);
            }
        }

        sb.append("}");
        System.out.println("\n"+sb.toString());


    }
}
