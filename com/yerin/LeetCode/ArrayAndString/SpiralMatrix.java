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

        String[] direction = {"right","down","left","up"};
        int a = 0;
        int i = 0;
        int j = 0;


        while(result.size() < total){
            result.add(matrix[i][j]);

            if(direction[a] == "right"){// right
                j++;
            }
            else if(direction[a] == "down"){
                i++;
            }
            else if(direction[a] == "left"){
                j--;
            }
            else{ // up
                i--;
            }

            if(result.contains(matrix[i][j])){
                continue;
            }

            if(){
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};       // [1,2,3,6,9,8,7,4,5]
        int[][] mat2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};      // [1,2,3,4,8,12,11,10,9,5,6,7]

        SpiralMatrix s = new SpiralMatrix();
        System.out.println(s.spiralOrder(mat1));
        System.out.println(s.spiralOrder(mat2));
    }

}
