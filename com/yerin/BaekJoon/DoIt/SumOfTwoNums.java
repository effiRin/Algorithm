package com.yerin.BaekJoon.DoIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTwoNums {

    // 문제 1번 - https://www.acmicpc.net/problem/11720

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countOfNum = Integer.parseInt(br.readLine());
        String sNum = br.readLine();

        // char 배열로 바꾸기
        char[] cNum = sNum.toCharArray();

        int sum = 0;

        for (int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0';
        }

        System.out.println(sum);
    }
}
