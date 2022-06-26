package com.yerin.LeetCode.ArrayAndString;

public class FindPivotIndex {
    //https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/

    public int pivotIndex(int[] nums) {

        // 오른쪽 합 = 전체 - 해당 인덱스의 값 - 왼쪽합
        // if (오른쪽 합 = 왼쪽합) -> if((sum - nums[i] - leftSum) == leftsum)

        int sum = 0;
        int leftSum = 0;

        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == sum - nums[i] - leftSum) {
                return i;
            }
            leftSum += nums[i];
        } // for

        return -1;
    }

    public static void main(String[] args) {
        int[] num1 = {1,7,3,6,5,6};
        int[] num2 = {1,2,3};
        int[] num3 = {2,1,-1};

        FindPivotIndex s = new FindPivotIndex();
        System.out.println(s.pivotIndex(num1));  // 3
        System.out.println(s.pivotIndex(num2));  // -1
        System.out.println(s.pivotIndex(num3));  // 0
    }

}
// 이전 풀이
//
//    public int pivotIndex(int[] nums){
//
//        int pivotIndex = -1;
//
//        for (int pi = 0; pi < nums.length; pi++) {
//
//            int leftSum = 0;
//            int rightSum = 0;
//
//            for (int i = 0; i < pi; i++) {
//                leftSum += nums[i];
//            }
//
//            for (int j = pi + 1; j < nums.length; j++) {
//                rightSum += nums[j];
//            }
//
//            if(leftSum == rightSum) {
//                pivotIndex = pi;
//                break;
//            }
//        }
//
//        return pivotIndex;
//    }

