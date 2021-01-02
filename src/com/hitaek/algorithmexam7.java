package com.hitaek;

public class algorithmexam7 {

    public static void main(String[] args) {
        // 문제7
        // 기둥 세개에 N개의 탑을 옮기는 하노이의탑을 구현하시오
        // n=1일때
        System.out.println("N=1");
        hanoi(1,1,3,2);
        System.out.println("N=2");
        hanoi(2,1,3,2);
        System.out.println("N=3");
        hanoi(3,1,3,2);
        System.out.println("N=4");
        hanoi(4,1,3,2);

    }


    public static void hanoi(int n, int fromPos, int toPos, int auxPos){
        //n은 탑의 개수 , fromPos는 시작 기둥 , toPos는 목적지 기둥, auxPos는 목적지 기둥으로 가기 위해 쓰는 기둥
        if(n==1){
            // 1개면 그냥 fromPos에서 toPos로 옮긴다.
            System.out.println(fromPos+" ==> "+ toPos);
            return;
        }
        // n은 1이 아닐경우 n-1개의 탑을 auxPos로 옮긴다
        hanoi(n-1, fromPos, auxPos, toPos);

        // 맨밑에 있는 탑을 toPos로 옮긴다.
        System.out.println(fromPos+ " ==> "+ toPos);

        // N-1개의 탑을 toPos로 옮긴다. (AuxPos ==> fromPos)
        hanoi(n-1, auxPos, toPos, fromPos);

    }
}
