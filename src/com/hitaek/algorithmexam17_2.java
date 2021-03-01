package com.hitaek;

import java.util.*;

public class algorithmexam17_2 {

    public static void main(String[] args) {

        // 문제 17
        // 미로 찾기 알고리즘 2 (모범답안)
        Map<String, List<String>> dInfo = new HashMap<String, List<String>>();

        dInfo.put("a", new ArrayList<>(Arrays.asList("e")));
        dInfo.put("b", new ArrayList<>(Arrays.asList("c", "f")));
        dInfo.put("c", new ArrayList<>(Arrays.asList("b", "d")));
        dInfo.put("d", new ArrayList<>(Arrays.asList("c")));
        dInfo.put("e", new ArrayList<>(Arrays.asList("a", "i")));
        dInfo.put("f", new ArrayList<>(Arrays.asList("b", "g", "j")));
        dInfo.put("g", new ArrayList<>(Arrays.asList("f", "h")));
        dInfo.put("h", new ArrayList<>(Arrays.asList("g", "l")));
        dInfo.put("i", new ArrayList<>(Arrays.asList("e", "m")));
        dInfo.put("j", new ArrayList<>(Arrays.asList("f", "k", "n")));
        dInfo.put("k", new ArrayList<>(Arrays.asList("j", "o")));
        dInfo.put("l", new ArrayList<>(Arrays.asList("h", "p")));
        dInfo.put("m", new ArrayList<>(Arrays.asList("i", "n")));
        dInfo.put("n", new ArrayList<>(Arrays.asList("m", "j")));
        dInfo.put("o", new ArrayList<>(Arrays.asList("k")));
        dInfo.put("p", new ArrayList<>(Arrays.asList("l")));

        System.out.println(solve_maze(dInfo, "a", "p"));

    }

    private static String solve_maze(Map<String, List<String>> dInfo, String start, String end) {

        List<String> qu = new ArrayList<String>();
        Set<String> done = new HashSet<String>();

        qu.add(start);
        done.add(start);

        while (!qu.isEmpty()) {

            String node = qu.remove(0);

            String v = node.substring(node.length()-1, node.length());
            if (v.equals(end)) {
                done.add(node);
                return node;
            } else {
                for (String subNode : dInfo.get(v)) {
                    if (!done.contains(subNode)) {
                        qu.add(node + subNode);
                        done.add(subNode);
                    }
                }
            }

        }

        return "????";
    }

}