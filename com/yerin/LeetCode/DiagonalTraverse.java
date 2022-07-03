package com.yerin.LeetCode;

public class DiagonalTraverse {
    // https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1167/

    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int diagonalNum = (m + n) - 1 ; // 대각선의 개수 = 총 실행횟수

        int[] result = new int[m * n]; // 새로 담을 배열

        int num = 0;

            for (int a = 0; a <= m-1; a++) {
                if(a == 0) {
                    result[num] = mat[0][0];
                }
                if(a == 1) {
                    
                }

                num++;
                result[num] = mat[i][];
            }


        return result;
    }

    public static void main(String[] args) {

        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};       // [1,2,4,7,5,3,6,8,9]
        int[][] mat2 = {{1,2},{3,4}};      // [1,2,3,4]



    }
}
