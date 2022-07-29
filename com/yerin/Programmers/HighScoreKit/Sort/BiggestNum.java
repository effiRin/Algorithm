package com.yerin.Programmers.HighScoreKit.Sort;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNum {

    public String solution(int[] numbers) {
        // 가장 큰 수는 앞자리가 클수록 크다. -> 문자열로 변경해서 내림차순으로 정렬 후, 문자열을 합치면 가장 큰 수가 된다.

        String[] stringNumbers = new String[numbers.length];

        //int형 배열을 String형 배열로 바꿈
        for (int i = 0; i < numbers.length; i++) {
            stringNumbers[i] = Integer.toString(numbers[i]);
        }

        //두 수를 번갈아가며 합친 수 중 큰 값을 앞으로 정렬(내림차순 정렬)
        Arrays.sort(stringNumbers, new Comparator<String>() {   //Comparator 인스턴스 생성과 동시에 compare() 메소드 오버라이드
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        System.out.println(stringNumbers);

        //0값이 중복일 경우 ex){0,0,0}
        //답이 000이 나오면 안되므로 첫 번째 값이 0이면 0을 리턴
        if (stringNumbers[0].equals("0")) return "0";

        //문자열을 delimiter("") 기준으로 합침
        return String.join("", stringNumbers);
    }

    public static void main(String[] args) {

        int[] num1 = {6, 10, 2};    // "6210"
        int[] num2 = {3, 30, 34, 5, 9}; // "9534330"

        BiggestNum s = new BiggestNum();
        System.out.println(s.solution(num1));
        System.out.println(s.solution(num2));

    }

}
