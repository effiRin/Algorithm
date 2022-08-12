package com.yerin.Codility;

import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        int[] arr = new int[A.length];

        for (int i = 0; i < A.length; i++) {
                arr[((i + K) % A.length)] = A[i];
            }

        return arr;
    }

    public static void main(String[] args) {
        CyclicRotation cr = new CyclicRotation();
        System.out.println(Arrays.toString(cr.solution(new int[]{3, 8, 9, 7, 6}, 3)));  //  [9, 7, 6, 3, 8]
        System.out.println(Arrays.toString(cr.solution(new int[]{0,0,0}, 1)));           // [0, 0, 0]
        System.out.println(Arrays.toString(cr.solution(new int[]{1,2,3,4}, 4)));        // [1, 2, 3, 4]
    }// main
}
