package com.yerin.BaekJoon.SolvingStepbyStep.step2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenTimer {

    // https://www.acmicpc.net/problem/2525

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int cookingTime = Integer.parseInt(br.readLine());

        int ovenHour = (hour * 60 + min + cookingTime) / 60;
        int ovenMin = (hour * 60 + min + cookingTime) % 60;

        if(ovenHour >= 24){
            ovenHour = ovenHour - 24;
        }

        System.out.println(ovenHour + " " + ovenMin);

        }
    }
