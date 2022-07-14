package com.yerin.BaekJoon.SolvingStepbyStep.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComparingTwoNums {
        //https://www.acmicpc.net/problem/1330

        public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        if (a > b) {
            System.out.println(">");
        }

        else if (a < b){
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }
    }
}
