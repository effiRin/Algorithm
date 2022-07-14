package com.yerin.BaekJoon.SolvingStepbyStep.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestScore {
    // https://www.acmicpc.net/status?user_id=effirin&problem_id=9498&from_mine=1

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        if (score >= 90) {
            System.out.println("A");
        }
        else if (score >= 80) {
            System.out.println("B");
        }
        else if (score >= 70) {
            System.out.println("C");
        }
        else if (score >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
