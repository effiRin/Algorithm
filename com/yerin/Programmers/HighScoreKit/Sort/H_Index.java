package com.yerin.Programmers.HighScoreKit.Sort;

import java.util.Arrays;

public class H_Index {

    public int solution(int[] citations) {

        int answer = 0;

        Arrays.sort(citations);                 // 오름차순으로 정렬

        for (int i = 0; i < citations.length; i++) {

            int h = citations.length - i;
            // H-Index = 인용 횟수가 h 이상인 h개 이상의 논문일 때, h의 최댓값
            // 절대 조건 : h는 citations.length보다 클 수 없다. (h <= citations.length)
            // => 따라서 h가 될 수 있는 가장 큰 수(c.length)부터 i만큼 빼면서 h의 최댓값을 찾는다.

            if(citations[i] >= h){
                answer = h;
                // h보다 크거나 같은 인용 횟수를 작은 순서부터 찾는다.
                // 처음으로 조건을 만족하는 순간이 h(H-Index) 최댓값이다.
                // 이후로는 무조건 h값보다 작아지기 때문이 이후의 차례는 체크할 필요 없음.
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        H_Index s = new H_Index();

        int[] c1 = new int[]{3, 0, 6, 1, 5};
        int[] c2 = new int[]{0};
        int[] c3 = new int[]{1};
        int[] c4 = new int[]{2};
        int[] c5 = new int[]{4,3};
        int[] c6 = new int[]{0,0,0,0,1,0,0,0};

        System.out.println(s.solution(c1));    // 3
        System.out.println(s.solution(c2));    // 0
        System.out.println(s.solution(c3));    // 1
        System.out.println(s.solution(c4));    // 1
        System.out.println(s.solution(c5));    // 2
        System.out.println(s.solution(c6));    // 1
    }

}
