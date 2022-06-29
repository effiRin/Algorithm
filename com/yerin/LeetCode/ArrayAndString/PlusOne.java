package com.yerin.LeetCode.ArrayAndString;

import java.util.Arrays;

public class PlusOne {
//    https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/

    public int[] plusOne(int[] digits) {

        int theLastNum = digits.length - 1;

        digits[theLastNum] = digits[theLastNum] + 1;

        for (int i = theLastNum; i > 0; i--) {
            if(digits[i] == 10){
                digits[i-1] += 1;
                digits[i] = 0;
            }
        }

        if(digits[0] == 10){
            int[] arr = new int[digits.length + 1];
            arr[0] = 1;
            arr[1] = 0;

            for (int i = 2; i < arr.length; i++) {
                arr[i] = digits[i-1];
            }
            return arr;
        }

        return digits;

    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9,8,7,6,5,4,3,2,1,0};

        PlusOne s = new PlusOne();
        System.out.println(Arrays.toString(s.plusOne(digits1)));
        System.out.println(Arrays.toString(s.plusOne(digits2)));
        System.out.println(Arrays.toString(s.plusOne(digits3)));
    }
}
