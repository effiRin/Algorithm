package com.yerin.Programmers.HighScoreKit.Brute_Force;

public class MinRectangle {

    public int solution(int[][] sizes) {

        int max = 0;        // 가로, 세로 통틀어서 가장 긴 변
        int maxIndexI = 0;  // 그 변의 인덱스 i (몇 번째 명함인지)
        int maxIndexJ = 0;  // 그 변의 인덱스 j (가로, 세로)

        // 가로, 세로 통틀어서 최댓값 구하기
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizes[i].length; j++) {
                if (sizes[i][j] > max) {
                    max = sizes[i][j];
                    maxIndexI = i;
                    maxIndexJ = j;
                }
            }
        }// for

        int standard = 0;       // 비교 기준

        if (maxIndexJ == 0) {  // 만약 그 최댓값이 가로의 것이었다면
            standard = sizes[maxIndexI][maxIndexJ + 1];    // 기준은 그 최댓값의 세로값

            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i][0] > standard && sizes[i][1] > standard) {     // 만약 어떤 값이 기준보다 크고 & 명함을 돌려봤을 때도 크다면
                    standard = Math.min(sizes[i][0], sizes[i][1]);      // 그 값의 가로, 세로 중 가장 작은 값을 기준으로 넣는다.
                }                                                   // 왜냐하면 가로, 세로 중 큰 값은 max(가장 긴 변)쪽으로 돌리면 되니까.
            }// for
        }// if

        else {       // 만약 그 최댓값이 세로의 것이었다면
            standard = sizes[maxIndexI][maxIndexJ - 1];

            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i][0] > standard && sizes[i][1] > standard) {
                    standard = Math.min(sizes[i][0], sizes[i][1]);
                }
            }
        }// else

        return max * standard;
    }

//     < 다른 풀이 >
//
//          int max = 0;
//        int min = 0;
//        for (int[] size : sizes) {
//            int paramMax = Math.max(size[0], size[1]);
//            int paramMin = Math.min(size[0], size[1]);
//
//            if (paramMax > max) {
//                max = paramMax;
//            }
//
//            if (paramMin > min) {
//                min = paramMin;
//            }
//        }
//        return max * min;

    public static void main(String[] args) {

        int[][] s1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};    //4000
        int[][] s2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};    // 120
        int[][] s3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};    // 133

        MinRectangle s = new MinRectangle();
        System.out.println(s.solution(s1));
        System.out.println(s.solution(s2));
        System.out.println(s.solution(s3));

    }

}
