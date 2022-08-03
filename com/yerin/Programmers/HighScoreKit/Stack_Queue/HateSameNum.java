package com.yerin.Programmers.HighScoreKit.Stack_Queue;

import java.util.*;

public class HateSameNum {

    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                stack.push(arr[i]);
            }
            if(stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }// for

        int[] answer = new int[stack.size()];
        Object[] temp = stack.toArray();

        for (int i = 0; i < stack.size(); i++) {
            answer[i] = (int) temp[i];
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};    //	[1,3,0,1]
        int[] arr2 = {4, 4, 4, 3, 3};    // [4,3]

        HateSameNum s = new HateSameNum();
        System.out.println(Arrays.toString(s.solution(arr1)));
        System.out.println(Arrays.toString(s.solution(arr2)));

    }

}
