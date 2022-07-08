package com.yerin.LeetCode.ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    // https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1168/

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length-1;

        while(result.size() < matrix.length * matrix[0].length) {

            //right
            for (int j = colBegin; j <= colEnd; j++) {
                result.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            // down
            for (int i = rowBegin; i <= rowEnd; i++) {
                result.add(matrix[i][colEnd]);
            }
            colEnd--;

            // left
            if(rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    result.add(matrix[rowEnd][j]);
                }
            }

            rowEnd--;

            // up
            if(colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    result.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }// while문

        return result;
    }

    public static void main (String[] args){

        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};       // [1,2,3,6,9,8,7,4,5]
        int[][] mat2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};      // [1,2,3,4,8,12,11,10,9,5,6,7]

        SpiralMatrix s = new SpiralMatrix();
        System.out.println(s.spiralOrder(mat1));
        System.out.println(s.spiralOrder(mat2));
    }

}