package com.yerin.LeetCode.ArrayAndString;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {

        String str = null;
        int num = 0;
        String plusOneNum = null;

        for (int i = 0; i < digits.length; i++) {
            str += Integer.toString(digits[i]);

        }

        num = Integer.parseInt(str) + 1;

        plusOneNum = Integer.toString(num);
        int[] arr = new int[plusOneNum.length()];

        for (int i = 0; i < plusOneNum.length(); i++) {
            arr[i] = plusOneNum.charAt(i)-'0';
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        int[] digits2 = {4, 3, 2, 1};
        int[] digits3 = {9};

        PlusOne s = new PlusOne();
        System.out.println(Arrays.toString(s.plusOne(digits1)));
        System.out.println(Arrays.toString(s.plusOne(digits2)));
        System.out.println(Arrays.toString(s.plusOne(digits3)));
    }
}
