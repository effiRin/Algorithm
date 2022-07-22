package com.yerin.BaekJoon.DoIt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfSection2 {
    // https://www.acmicpc.net/problem/11660

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());  // 표의 크기 n
        int m = Integer.parseInt(st.nextToken());  // 합을 구해야 하는 횟수 m

        // 인덱스 1부터 쓰기 위해
        int[][] nums = new int[n + 1][n + 1];
        int[][] sum = new int[n + 1][n + 1];

        // 입력한 숫자 배열 만들기 + 구간 합 배열 만들기
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for (int j = 1; j <= n; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + nums[i][j];
            }
        }

        // 입력된 구간 합 구하기
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int result = sum[c][d] - sum[a - 1][d] - sum[c][b - 1] + sum[a - 1][b - 1];
            sb.append(result + "\n");
        }
        System.out.println(sb);
    }
}
