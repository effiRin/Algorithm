package com.yerin.Programmers.HighScoreKit.Brute_Force;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Carpet {

    public int[] solution(int brown, int yellow) {
        int yellowVertical = 1;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap();

        // yellow 가로, 세로 찾기
        for (int yellowCross = 1; yellowCross <= yellow; yellowCross++) { // i는 yellowCross
            yellowVertical = yellow / yellowCross;

            if (yellowCross >= yellowVertical && yellowCross * yellowVertical == yellow) {
                map.put(yellowCross, yellowVertical);
                count++;
            }// if
        }// for

        // yellow 가로, 세로 int[] 배열로 옮겨주기
        int[][] result = new int[count][2];
        int tempCount = 0;

        Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, Integer> entry = entries.next();
            result[tempCount][0] = entry.getKey();
            result[tempCount][1] = entry.getValue();
            tempCount++;
        }

        // brown 가로, 세로 구하기
        int brownCross = 0;
        int brownVertical = 0;

        for (int i = 0; i < result.length; i++) {

            if (brown + yellow == (result[i][0] + 2) * (result[i][1] + 2)) {
                brownCross = result[i][0] + 2;
                brownVertical = result[i][1] + 2;
                break;

            } else {
                continue;
            }
        }// for

        return new int[]{brownCross, brownVertical};

    }// solution

    public static void main(String[] args) {

        Carpet s = new Carpet();
        System.out.println(Arrays.toString(s.solution(10, 2)));
        System.out.println(Arrays.toString(s.solution(8, 1)));
        System.out.println(Arrays.toString(s.solution(24, 24)));

        //     10	2	[4, 3]
        //     8	1	[3, 3]
        //     24	24	[8, 6]


    }

}
