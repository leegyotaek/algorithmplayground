package com.hitaek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class algorithmexam8_2 {

    public static void main(String[] args) {

        // 문제 8-2
        // 탐색정렬 구현
        // 다음과 같이 학생번호와 이름이 리스트로 주여졌을 때 학생 번호를 입력하면 학생번호에 해당하는 이름을 순차탐색으로 찾아 돌려주는
        // 함수를 만드시오
        // stu_no = [39, 14, 67, 105]
        // stu_name = ["Justin", "John", "Mike", "Summer"]

        List<Integer> stu_no = new ArrayList<Integer>(){{
            add(39);
            add(14);
            add(67);
            add(105);
        }};

        List<String> stu_name = new ArrayList<String>(){{
            add("Justin");
            add("John");
            add("Mike");
            add("Summer");
        }};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the number of student : " );

        int stu_num = scanner.nextInt();

        for(int n=0; n<stu_no.size(); n++){
            if(stu_no.get(n) == stu_num){
                System.out.println(stu_name.get(n));
                return;
            }
        }


        System.out.print("?");
        return;

    }


}
