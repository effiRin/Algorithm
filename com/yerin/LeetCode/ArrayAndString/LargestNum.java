package com.yerin.LeetCode.ArrayAndString;

public class LargestNum {
    //https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/

    public int dominantIndex(int[] nums) {

        int largestNum = 0;
        int secondLargestNum = 0;
        int largestNumIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestNum) {
                largestNum = nums[i];
                largestNumIndex = i;
            }
        }//  가장 큰 수 구하기

            for (int num : nums) {
                if (num > secondLargestNum && num < largestNum) {
                    secondLargestNum = num;
                }
            } // 두번째로 큰 수 구하기

            if (largestNum >= secondLargestNum * 2) {
                return largestNumIndex;
        } // 비교했을 때 2배 크면 해당 인덱스 반환

        return -1;
    }


    public static void main(String[] args) {
        int[] num1 = {3,6,1,0};
        int[] num2 = {1,2,3,4}; 
        int[] num3 = {1};  

        LargestNum s = new LargestNum();
        System.out.println(s.dominantIndex(num1));  // 1
        System.out.println(s.dominantIndex(num2));  // -1
        System.out.println(s.dominantIndex(num3));  // 0
    }
}
