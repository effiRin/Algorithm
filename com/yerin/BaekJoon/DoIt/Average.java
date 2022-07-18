package com.yerin.BaekJoon.DoIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {

    // https://www.acmicpc.net/problem/1546
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfSubject = Integer.parseInt(br.readLine()); // 과목수
        String[] temp = br.readLine().split(" "); // 점수들

        int[] scores = new int[numOfSubject];
        int sum = 0;     // 점수의 합
        int m = 0;      // 최댓값

        // 현재 성적
        for (int i = 0; i < temp.length; i++) {
            scores[i] = Integer.parseInt(temp[i]);
            sum += scores[i];
        }

        // 점수 중 최댓값
        for (int num : scores){
            if(num > m){
                m = num;
            }
        }

        // 조작한 점수의 평균
        System.out.println(sum * 100.0 / m / numOfSubject);

    }
}
