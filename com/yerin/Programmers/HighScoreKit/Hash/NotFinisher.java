package com.yerin.Programmers.HighScoreKit.Hash;

import java.util.HashMap;

public class NotFinisher {

    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();
        String answer = "";

        for (int i = 0; i < participant.length; i++) {
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
            // 동명이인 중복체크 - 중복이 아니면 디폴트값 0 + 1 = 1이 들어가고,
            // 중복이면 이전에 들어간 값을 불러와 1 + 1 = 2가 들어간다.
        }

        for (int j = 0; j < completion.length; j++) {
            map.put(completion[j], map.get(completion[j]) - 1);
            // 참가자와 완주자 이름 같음 -> key값으로 활용하여 참가자 중 완주한 사람은 -1을 한다.
            // 결과적으로 완주자는 '0'을 갖고, 완주하지 못한 사람은 1을 가진다.
            // 동명이인이 아닐 경우, 1-1 = 0이 값으로 들어가고
            // 동명이인일 경우, 둘다 완주하면 '0' (completion[j] key값이 두번 들어가 -1이 두번 됨)
            // 둘 중 한명만 완주하면 '1'이 된다.
            // 동명이인이 n명일 경우엔 -1이 n번되어 0이하의 값을 갖는다.
        }

        for (String key : map.keySet()){
            if(map.get(key) != 0){      // 따라서 완주자가 아닌 사람은 0이 아닌 값을 가진 경우다.
                answer = key;
                break;          // 한명만 완주하지 못했으므로, 다 돌릴 필요 없이 찾으면 바로 break;
            }
        }

        return answer;
}

    public static void main(String[] args) {

        String[] p1 = {"leo", "kiki", "eden"};
        String[] c1 = {"eden", "kiki"};
        // "leo"

        String[] p2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] c2 = {"josipa", "filipa", "marina", "nikola"};
        // "vinko"

        String[] p3 = {"mislav", "stanko", "mislav", "ana"};
        String[] c3 = {"stanko", "ana", "mislav"};
        // "mislav"

        NotFinisher s = new NotFinisher();

        System.out.println(s.solution(p1, c1));
        System.out.println(s.solution(p2, c2));
        System.out.println(s.solution(p3, c3));

    }
}