package com.yerin;

public class MinOfMax {

        public int biggestNum(int row, int col, int[][] matrix) {

                 int maxOfMatrix = Integer.MIN_VALUE;

            for (int i = 0; i < row; i++) {

                int minOfRow = Integer.MAX_VALUE;

                for (int j = 0; j < col; j++) {
                    int num = matrix[i][j];

                    if(num < minOfRow){
                        minOfRow = num;
                    }
                } // for

                if(minOfRow > maxOfMatrix){
                    maxOfMatrix = minOfRow;
                }
            }

            return maxOfMatrix;
        }



        public static void main(String[] args) {
            MinOfMax s = new MinOfMax();
            int row1 = 3;
            int col1 = 3;
            int[][] matrix1 = {
                    {3, 1, 2},
                    {4, 1, 4},
                    {3, 2, 5}
            };

            int row2 = 4;
            int col2 = 3;
            int[][] matrix2 = {
                    {3, 1, 2},
                    {4, 1, 4},
                    {3, 2, 5},
                    {3, 7, 4}
            };

            System.out.println(s.biggestNum(row1, col1, matrix1)); // 2
            System.out.println(s.biggestNum(row2, col2, matrix2)); // 3

        }

    }
