package com.yerin.Programmers.HighScoreKit.Brute_Force;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MockExam {

    public int[] solution(int[] answers) {
        int[] answer = {};

        int[][] student = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int j = 0; j < 3; j++) {

            int count = 0;

            for (int i = 0; i < answers.length; i++) {
                if (i == 0 && student[j][i] == answers[i]) {
                    count++;
                }
                else if (student[j][i % student[j].length] == answers[i]) {
                    count++;
                }
            }// for

            if (j == 0) {
                count1 = count;
            } else if (j == 1) {
                count2 = count;
            } else {
                count3 = count;
            }

        }// for

        int[] scores = new int[]{count1, count2, count3};
        int max = 0;
        int maxIndex = 0;
        List<Integer> overlapMax = new ArrayList<Integer>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                maxIndex = i+1;
            }
        }// for

        for (int i = 0; i < scores.length; i++) {
            if(i != maxIndex-1 && scores[i] == max){
                overlapMax.add(i+1);
            }
        }

        if (overlapMax.size() == 0) {
            answer = new int[]{maxIndex};
        } else {
            overlapMax.add(maxIndex);
            Collections.sort(overlapMax);
            answer = overlapMax.stream().mapToInt(Integer::intValue).toArray();
        }

        return answer;
    }

    public static void main(String[] args) {

//        int[] a1 = {1, 2, 3, 4, 5}; // 1
//        int[] a2 = {1, 3, 2, 4, 2}; // 1,2,3
        int[] a3 = {3, 3, 2, 1, 5};

        MockExam s = new MockExam();
//        System.out.println(Arrays.toString(s.solution(a1)));
//        System.out.println(Arrays.toString(s.solution(a2)));
        System.out.println(Arrays.toString(s.solution(a3)));

    }
}
