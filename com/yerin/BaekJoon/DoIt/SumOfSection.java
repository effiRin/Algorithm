package com.yerin.BaekJoon.DoIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfSection {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        int[] nums = new int[n];
        int[] sum = new int[n];

        String[] temp = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(temp[i]);

            if(i != 0){sum[i] = sum[i - 1] + nums[i];}
            else {sum[i] = nums[i];}
        } // for

        for(int a = 0; a < m; a++) {
            String[] section = br.readLine().split(" ");

            int i  = Integer.parseInt(section[1])-1;
            int j  = Integer.parseInt(section[0])-2;

            if (i != j && j >= 0){
                System.out.println(sum[i]-sum[j]);
            }
            else if(j == -1){
                System.out.println(sum[i]);
            }
            else {
                System.out.println(nums[i]);
            }
        } // for

    }// main
}