package com.yerin.BaekJoon.SolvingStepbyStep.step2;

import java.util.Scanner;

public class AlarmClock {
    //https://www.acmicpc.net/problem/2884

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] clock = scanner.nextLine().split(" ");

        Integer hour = Integer.parseInt(clock[0]);
        Integer min = Integer.parseInt(clock[1]);

        System.out.println(hour);
        System.out.println(min);

    }
}
