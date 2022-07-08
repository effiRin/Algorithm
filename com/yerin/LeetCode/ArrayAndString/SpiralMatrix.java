package com.yerin.LeetCode.ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    // https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1168/

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;
        int total = row * col;

        int cycleNum = 0;
        int i = 0;
        int j = 0;

        result.add(matrix[i][j]);

        while (result.size() < total) {

                // to right
                for (int k = 1; k < col-cycleNum; k++) { // to right
                    if(result.size() == total){return result;}
                    j++;
                    result.add(matrix[i][j]);
                    System.out.println("[right] i : " + i + "/ j : " + j);
                }

                // to down
                for (int k = 1; k < row-cycleNum; k++) {
                    if(result.size() == total){return result;}
                    i++;
                    result.add(matrix[i][j]);
                    System.out.println("[down] i : " + i + "/ j : " + j);
                }

                // to left
                for (int k = 1; k < col-cycleNum; k++) {
                    if(result.size() == total){return result;}
                    j--;
                    result.add(matrix[i][j]);
                    System.out.println("[left] i : " + i + "/ j : " + j);
                }

                // to up
                for (int k = 1; k < row-cycleNum; k++){
                    if(result.size() == total){return result;}
                    i--;
                    if(result.contains(matrix[i][j])){
                        System.out.println("[up] i : " + i + "/ j : " + j + "one cylce!");
                        i++;
                        break;
                    }
                    result.add(matrix[i][j]);
                    System.out.println("i : " + i + "/ j : " + j);
                }

                cycleNum ++;
            }

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