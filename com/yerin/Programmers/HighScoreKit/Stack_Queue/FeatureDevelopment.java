package com.yerin.Programmers.HighScoreKit.Stack_Queue;

import java.util.*;

public class FeatureDevelopment {

    public int[] solution(int[] progresses, int[] speeds) {
        int featureCount = 0;
        int index = 0;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        // 진도율 담긴 queue 만들기
        for (int i = 0; i < progresses.length; i++) {
            queue.offer(progresses[i]);
        }
        while (queue.size() != 0) {     // queue에 있는 거 다 배포할 떄까지 반복
            // 작업 진행 시켜주기
            for (int i = 0 + index; i < speeds.length; i++) {
                int temp = 0;
                temp = queue.poll() + speeds[i];
                queue.offer(temp);
            }
            // 진도율 100프로인지 체크
            for (int i = 0; i < speeds.length; i++) {
                if(queue.peek()==null || queue.peek() < 100){break;}
                else {                              // 100프로이면 queue 지우고 featureCount++;
                    queue.poll();
                    featureCount++;
                }
            }
            if (featureCount != 0) {     // featureCount 있으면 list에 넣어주기
                list.add(featureCount);
                index += featureCount;
                featureCount = 0;
            }
        }// while
        return list.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {

        int[] p1 = {93, 30, 55};
        int[] s1 = {1, 30, 5};      //	{2, 1}

        int[] p2 = {95, 90, 99, 99, 80, 99};
        int[] s2 = {1, 1, 1, 1, 1, 1};  //	{1, 3, 2}

        FeatureDevelopment s = new FeatureDevelopment();
//        System.out.println(Arrays.toString(s.solution(p1, s1)));
        System.out.println(Arrays.toString(s.solution(p2, s2)));
    }

}
