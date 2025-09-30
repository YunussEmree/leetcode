package com.yunussemree;

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {

    static List<Integer> testcase = List.of(1, 2, 3);

    public static void main(String[] args) { // ! Score: Runtime: 0 ms (100.00%), Memory 43.23 MB (5.45%)
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), testcase, 0);
        System.out.println(result);
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> curr, List<Integer> nums, int start) {

        result.add(new ArrayList<>(curr));

        for (int i = start; i < nums.size(); i++) {
            curr.add(nums.get(i));
            backtrack(result, curr, nums, i+1);
            curr.removeLast();
        }
    }
}
