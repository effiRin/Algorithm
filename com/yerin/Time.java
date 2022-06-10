package com.yerin;

public class Time {

    public static void main(String[] args) {

        int count = 0;
        int N = 5;

        for (int i = 0; i < 60; i++) {
            if(String.valueOf(i).contains("3")){
                count++;
            }
        }// 3이 포함된 개수 계산 (m, s)

        int contain3 = 3600 - (60 - count) * (60 - count);
        int result = 0;

            if(N<3){
                result = ((N+1) * contain3);
        }
            else if(N < 13){
                result = (N * contain3) + 3600;
            }

            else if(N <23){
                result = ((N-1) * contain3) + (3600 * 2) ;
            }
            else{
                result = ((N-2) * contain3) + (3600 * 3);
            }

        System.out.println(result);
    }

}
