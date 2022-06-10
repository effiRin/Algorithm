package com.yerin.BaekJoon;

import java.util.Scanner;

public class AlarmClock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] clock = scanner.nextLine().split(" ");

        Integer hour = Integer.parseInt(clock[0]);
        Integer min = Integer.parseInt(clock[1]);

        System.out.println(hour);
        System.out.println(min);

    }
}
