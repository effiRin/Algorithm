package com.yerin.Programmers.HighScoreKit.Hash;

import java.util.Arrays;

public class PhoneNumberList {

    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);
        // 오름차순 정렬하면 다음과 같이 됨
        // 119, 1195524421, 97674223
        // 123, 456, 789
        // 12, 123, 1235, 567, 88

        for (int i = 0; i < phone_book.length - 1; i++) {
            if(phone_book[i+1].indexOf(phone_book[i]) == 0){
                // 오름차순이므로 뒤의 것에서 앞의 것을 indexOf 해야함
                // 접두어로 있으면 0 반환, 없으면 -1 나옴
               return false;
            };
        }
        return true;
    }

    public static void main(String[] args) {

        String[] p1 = {"119", "97674223", "1195524421"};
        String[] p2 = {"123","456","789"};
        String[] p3 = {"12","123","1235","567","88"};

        PhoneNumberList s = new PhoneNumberList();

        System.out.println(s.solution(p1));
        System.out.println(s.solution(p2));
        System.out.println(s.solution(p3));

    }

}
