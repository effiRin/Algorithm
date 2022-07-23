package com.yerin.Programmers.HighScoreKit.Hash;

import java.util.HashSet;

public class Phonekemon {
    // https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java
    // 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아(-> 중복 최소화한 방법), 폰켓몬 종류 번호 개수를 return
    // 중복된 값을 허용하지 않은 HashSet 이용 -> 결과적으로 HashSet의 size가 가장 많은 폰켓못 종류를 골랐을 때의 개수

    public int solution(int[] nums){
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);                        // 반복문으로 HashSet에 폰켓몬 배열 nums 저장해주기
        }

        // 제약조건 : 폰켓몬 배열 nums의 전체 개수의 절반 이상은 못 가져감
        if(hs.size() > nums.length / 2){
            return nums.length / 2;
        }

        return hs.size();
    }

    public static void main(String[] args) {

        int[] nums1 = {3,1,2,3};
        int[] nums2 = {3,3,3,2,2,4};
        int[] nums3 = {3,3,3,2,2,2};

        Phonekemon s = new Phonekemon();
        System.out.println(s.solution(nums1));
        System.out.println(s.solution(nums2));
        System.out.println(s.solution(nums3));
    }
}
