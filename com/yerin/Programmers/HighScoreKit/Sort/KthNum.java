package com.yerin.Programmers.HighScoreKit.Sort;

import java.util.Arrays;

public class KthNum {

    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
        int[] temp = new int[3];
        int[] result = {};

        for (int a = 0; a < commands.length; a++) {

            // i,j,k 값 담긴 배열 temp 구하기
            for (int b = 0; b <commands[a].length ; b++) {
                temp[b] = commands[a][b];
            }

            result = new int[temp[1]-temp[0]+1];
            int i = 0;

            for (int b = temp[0]-1; b < temp[1]; b++) {
                result[i] = array[b];
                i++;
            }

            Arrays.sort(result);
            answer[a] = result[temp[2]-1];

        } // for

        return answer;
    }

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};   // 5,6,3

        KthNum s = new KthNum();
        System.out.println(Arrays.toString(s.solution(array, commands)));
    }

}
