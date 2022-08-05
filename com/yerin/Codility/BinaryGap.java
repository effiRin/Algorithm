package com.yerin.Codility;

public class BinaryGap {

    // 이진수로 바꿨을 때 1 사이에 있는 0이 가장 긴 것을 BinaryGap으로 return

    public int solution(int N) {

        int quotient = N;  // 몫
        String binaryNum = ""; // 이진수

        // 밑이 2인 log 함수로 N값을 계산해서 이진수의 자릿수 구하기
        int arr[] = new int[(int) (Math.log(N) / Math.log(2)) + 1];

        // 이진수 만들기
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = quotient % 2;
            quotient = quotient / 2;
        }

        for (int i = 0; i < arr.length; i++) {
            binaryNum += String.valueOf(arr[i]);
        }

        // 1이 몇 개 포함되어있는지 찾기
        int count = 0;
        for (int i = 0; i < binaryNum.length(); i++) {
            if(arr[i] == 1) {
                count++;
            }
        }

        // 만약 1개밖에 없으면 0으로 바로 return
        if (count == 1) {
            return 0;
        }

        // BinaryGap 찾기
        int fromIndex = 0;
        int binaryGap = 0;
        int temp = 0;

        for (int i = 0; i < count - 1; i++) {
            int startIdx = binaryNum.indexOf("1", fromIndex);
            int endIdx = binaryNum.indexOf("1", fromIndex + 1);

            temp = endIdx - startIdx;
            fromIndex = endIdx;

            if (binaryGap < temp) {
                binaryGap = temp;
            }
        }// for

        return binaryGap - 1;
    }

    public static void main(String[] args) {
        int n1 = 9; // 1001, 2
        int n2 = 529; // 1000010001, 4
        int n3 = 20; // 10100, 1
        int n4 = 15; // 1111,0
        int n5 = 32; // 100000, 0
        int n6 = 1041; // 5

        BinaryGap s = new BinaryGap();
        System.out.println(s.solution(n1));
        System.out.println(s.solution(n2));
        System.out.println(s.solution(n3));
        System.out.println(s.solution(n4));
        System.out.println(s.solution(n5));
        System.out.println(s.solution(n6));

    }
}
