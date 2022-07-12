package com.yerin.LeetCode.ArrayAndString;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    // https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1170/

    // 잘못된 풀이
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        temp.add(0, 1);
        list.add(temp);

        // 첫 번째 줄
        if (numRows == 1) {
            return list;
        }

        // 그 이후
        int countRow = 1;

        while (countRow < numRows) {

            temp.clear();
            System.out.println(temp);

            temp.add(0, 1);  // 처음

                for (int i = 1; i < countRow; i++) {
                    Integer num = list.get(countRow-2).get(i-1) + list.get(countRow-2).get(i);
                    temp.add(num);
                }// for

            temp.add(countRow, 1); // 끝
            list.add(temp);

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
