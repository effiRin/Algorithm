package com.yerin.Programmers.HighScoreKit.Brute_Force;

import java.util.ArrayList;
import java.util.List;

public class FindingPrimeNum {

    static List<Integer> result;   // 결과값
    static char[] papers; // 종이조각

    public int solution(String numbers) {
        result = new ArrayList<>();     // static이라서 첫 번째 soulution 메소드 이후 실행할 때를 위해 초기화 필요
        papers = numbers.toCharArray();

        boolean[] visited = new boolean[papers.length];
        char[] output = new char[papers.length];

        for (int i = 1; i < papers.length + 1; i++) {
            per(papers, output, visited, 0, papers.length, i);    // i는 자리수 - i자리 수 일때 경우의 수 구하기
        }

        return result.size();
    }// solution

    static void per(char[] arr, char[] output, boolean[] visited, int depth, int n, int r) {
        // 순열 알고리즘을 이용해 조합할 수 있는 경우의 수 만들기
        // n은 전체 개수, r은 구하려는 개수(자리수)

        String str = "";
        int resultNum = 0;

        if (depth == r) {
            for (int i = 0; i < r; i++) {
                str += output[i];
            }

            resultNum = Integer.valueOf(str);

            if (result.contains(resultNum) == false && is_primeNum(resultNum) == true) { // 중복이 아니고, 소수일 경우에
                result.add((Integer.valueOf(str)));
            }
            return;
        }// if

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                per(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
            }
        }
    }// per

    static boolean is_primeNum(int number) {

        if (number < 2) { // 0과 1은 소수가 아니다.
            return false;
        }
        if (number == 2) { // 2는 소수다
            return true;
        }

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {    // 1과 number(자기 자신)을 제외한 다른 수로 나눠떨어진다면 소수가 아니다.
                return false;
            }
        }// for - 첫번째 if, 두번째 if, for문을 지난(약수를 가지지 않았기 때문) 숫자는 소수이다.
        return true;
    }

    public static void main(String[] args) {

        String n1 = "17";
        String n2 = "011";

        FindingPrimeNum s = new FindingPrimeNum();
        System.out.println(s.solution(n1));
        System.out.println(s.solution(n2));

    }

}

