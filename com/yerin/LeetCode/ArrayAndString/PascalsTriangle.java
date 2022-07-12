package com.yerin.LeetCode.ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        Integer[] temp = new Integer[1];
        temp[0] = 1;
        list.add(0, List.of(temp));

        // 첫 번째 줄 = list[0]
        if (numRows == 1) {
            return list;
        }

        // 그 이후
        int countRow = 1;

        while (countRow < numRows) {
            Integer[] temp2 = new Integer[countRow + 1];
            temp2[0] = 1; // 처음
            temp2[countRow] = 1; // 끝

            for (int i = 1; i < countRow; i++) {
                Integer num = list.get(countRow - 1).get(i - 1) + list.get(countRow - 1).get(i);
                temp2[i] = num;
            }// for

            list.add(countRow, List.of(temp2));

            countRow++;

        } // while

            return list;

        }// method

    public static void main(String[] args) {

        PascalsTriangle s = new PascalsTriangle();
        System.out.println(s.generate(5));
        System.out.println(s.generate(1));

    }

}
