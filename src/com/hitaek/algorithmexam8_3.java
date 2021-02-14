package com.hitaek;

import java.util.*;

public class algorithmexam8_3 {

    public static void main(String[] args) {

        // 문제 8-2
        // 탐색정렬 구현
        // 다음과 같이 학생번호와 이름이 맵으로 주여졌을 때 학생 번호를 입력하면 학생번호에 해당하는 이름을 순차탐색으로 찾아 돌려주는
        // 함수를 만드시오
        // stu_no = [39, 14, 67, 105]
        // stu_name = ["Justin", "John", "Mike", "Summer"]
        // map = {"Justin" : 39, "John" : 14, "Mike" : 67, "Summer" : 105}

        Map<String , Integer> map = new HashMap<>();

        map.put("Justin", 39);
        map.put("John", 14);
        map.put("Mike", 67);
        map.put("Summer", 105);

        Scanner s = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = s.next();

        if(map.containsKey(name))
            System.out.print(map.get(name));
        else
            System.out.print("?");




    }


}
