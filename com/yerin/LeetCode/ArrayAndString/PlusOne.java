package com.yerin.LeetCode.ArrayAndString;

import java.util.Arrays;

public class PlusOne {
//    https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/

    public int[] plusOne(int[] digits) {

        String str = "";
        long num = 0;
        String plusOneNum = "";


        for (int i = 0; i < digits.length; i++) {
            str += Integer.toString(digits[i]);
        }

        System.out.println(str);

        num = Long.parseLong(str) + 1;

        plusOneNum = Long.toString(num);
        int[] plusOneArr = new int[plusOneNum.length()];

        for (int i = 0; i < plusOneNum.length(); i++) {
            plusOneArr[i] = plusOneNum.charAt(i)-'0';
        }

        return plusOneArr;
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
