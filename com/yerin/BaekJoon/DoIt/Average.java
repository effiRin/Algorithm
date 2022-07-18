package com.yerin.BaekJoon.DoIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {

    // https://www.acmicpc.net/problem/1546
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numOfSubject = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");

        // 현재 성적
        double scores[] = new double[numOfSubject];

        for (int i = 0; i < temp.length; i++) {
            scores[i] = Double.parseDouble(temp[i]);
        }

        // 점수 중 최댓값
        double m = 0;

        for (double num : scores){
            if(num > m){
                m = num;
            }
        }

        // 조작한 점수의 평균
        double sum = 0;

        for (int i = 0; i < temp.length; i++) {
            sum += scores[i]/m*100;
        }

        System.out.println(sum / numOfSubject);

    }
}
