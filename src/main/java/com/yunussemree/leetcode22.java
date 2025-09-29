package com.yunussemree;

import java.util.ArrayList;
import java.util.List;

public class leetcode22 {

    static int testcase = 3;

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, testcase);
        System.out.println(result);
    }

    public static void backtrack(List<String> result, String curr, int open, int close, int max) { // ! Score: Runtime: 1 ms (80.72%), Memory 43.3 MB (45.23%)
        if(curr.length() == max * 2 ){
            result.add(curr);
            return;
        }

        if(open<max){
            backtrack(result,curr + "(", open+1, close, max);
        }

        if(close<open){
            backtrack(result, curr + ")", open, close+1, max);
        }
    }
}
