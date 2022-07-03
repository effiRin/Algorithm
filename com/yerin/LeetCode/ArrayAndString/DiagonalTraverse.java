package com.yerin.LeetCode.ArrayAndString;

import java.util.Arrays;

public class DiagonalTraverse {
    // https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1167/

    public int[] findDiagonalOrder(int[][] mat) {

        if(mat == null || mat.length == 0){
            return new int[0];
        }

        int row = mat.length;
        int col = mat[0].length;
        int total = row * col;
        int[] result = new int[total];

        int a = 0;
        int i = 0; // row값
        int j = 0; // col값

        boolean diagonal = true;

        while(a < total){
            result[a] = mat[i][j];

            // up (올라가는 대각선) - i값 하락 / j값 상승
            if(diagonal){
                if(i == 0 && j < col-1){    // 대각선 방향 바뀌는 경우 1
                    j++;
                    diagonal = false;
                }
                else if(j == col-1){   // 대각선 방향 바뀌는 경우 2
                    i++;
                    diagonal = false;
                }
                else {      // 그 외 (i값 하락 / j값 상승)
                    i--;
                    j++;
                }
            } // if

            // down (내려가는 대각선) -> i값 상승 / j값 하락
            else {
                if (i < row - 1 && j == 0) {
                    i++;
                    diagonal = true;
                } else if (i == row - 1) {
                    j++;
                    diagonal = true;
                } else {
                    i++;
                    j--;
                }
            } // else

                a++;

            } // while

        return result;

    } // method

    public static void main(String[] args) {

        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};       // [1,2,4,7,5,3,6,8,9]
        int[][] mat2 = {{1,2},{3,4}};      // [1,2,3,4]

        DiagonalTraverse s = new DiagonalTraverse();
        System.out.println(Arrays.toString(s.findDiagonalOrder(mat1)));
        System.out.println(Arrays.toString(s.findDiagonalOrder(mat2)));
    }
}
