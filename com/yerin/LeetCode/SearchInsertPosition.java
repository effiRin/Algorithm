package com.yerin.LeetCode;

public class SearchInsertPosition {
    // 35번 (https://leetcode.com/problems/search-insert-position/)

    public int searchInsert(int[] nums, int target) {

        int start = 0;
        int end = nums.length;
        int mid = (start + end) / 2;

        while (start < end) {

            if (target > nums[mid]) {  // mid 전을 지움
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid;
            } else {
                break;
            }

            mid = (start + end) / 2;

        } // while

        return mid;

    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6, 8};
        int target = 6;

        SearchInsertPosition sip = new SearchInsertPosition();
        sip.searchInsert(nums, target);

    } // main

} // class
