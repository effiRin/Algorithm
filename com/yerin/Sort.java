package com.yerin;

public class Sort {

    // 10개의 숫자 데이터 Array 가 주어진다.
    // 오름차순(Array Index 가 작은 숫자에 '작은 숫자'가 오도록) 으로 정렬하는 기능을 "코딩" 또는 "말" 또는 "슈도코드"로 설명하여라.

    public static void main(String[] args) {

        Integer[] array = new Integer[]{4, 9, 5, 6, 7, 8, 1, 2, 3, 0};

        // Sorting
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            int min = array[minIndex];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int tempVal = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tempVal;
        }

        // Show result
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        } // for

    } // main

}// class
