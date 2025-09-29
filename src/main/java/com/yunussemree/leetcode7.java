package com.yunussemree;

public class leetcode7 {

    static int testcase = 123;
    static int testcase2 = -123;

    public static void main(String[] args) {
        System.out.println(reverse(testcase2));
    }

    public static int reverse(int x) { // ! Score: Runtime: 1 ms (%81.29), Memory 40.87 MB (%72.83)
        long newnumber = 0;
        boolean isNegative = false;

        if(x < 0){
            isNegative = true;
            x *= -1;
        }

        while (x >= 1) {
            int y = x % 10;
            newnumber = newnumber * 10 + y;
            x = x / 10;
        }

        if(Integer.MAX_VALUE < newnumber) return 0; //testcase bug

        if (isNegative) newnumber *= -1;

        return (int) newnumber;
    }
}