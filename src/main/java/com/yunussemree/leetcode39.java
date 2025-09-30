package com.yunussemree;

import java.util.ArrayList;
import java.util.List;

public class leetcode39 {

    static int[] candidatesss = {1,2,3};
    static int target = 10;

    public static void main(String[] args) { // ! Score: Runtime: 2 ms (84.32%), Memory 44.56 MB (82.70%)
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidatesss, target, 0);
        System.out.println(result);
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> curr, int[] candidates, int remain, int start){
        if(remain==0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(remain<0) return;


        for (int i = start; i < candidates.length; i++) {
            curr.add(candidates[i]);
            backtrack(result, curr, candidates,remain-candidates[i],i);
            curr.removeLast();
        }
    }

}
