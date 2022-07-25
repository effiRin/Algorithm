package com.yerin.Programmers.HighScoreKit.Hash;

import java.util.*;

public class Camouflage {
    // https://school.programmers.co.kr/learn/courses/30/lessons/42578

    public int solution(String[][] clothes) {

        HashMap<String, Integer> map = new HashMap<>();
        int answer = 1;

        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];     // 옷 종류를 key로 사용

            if(!map.containsKey(key)){      // key가 중복이 아닌 경우, key와 함께 1 넣기
                map.put(key, 1);
            }
            else{                           // key가 중복인 경우, 해당 키에 있던 값에서 +1 해서 총 개수 구하기
                map.put(key, map.get(key) + 1);
            }
        } // for

        Iterator<Integer> it = map.values().iterator();

        while(it.hasNext()){
            answer *= it.next().intValue() + 1;
            // next()는 Integer라는 Object를 반환하므로, 객체를 int로 변환해주는 intValue() 사용
            // +1은 해당 종류를 착용하지 않았을 경우
            // 예1) headgear : 2 -> (yellow 모자 착용, green 터번 착용, 둘다 미착용(모자X) -> 총 3가지 경우)
            // 따라서 값에 +1 해주며 곱해주기
        }
        return answer - 1;   // 아무 것도 착용하지 않았을 경우 빼기 -1
    }

    public static void main(String[] args) {

        String[][] c1 = new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] c2 = new String[][]{{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

        Camouflage s = new Camouflage();
        System.out.println(s.solution(c1));
        System.out.println(s.solution(c2));
    }

}
