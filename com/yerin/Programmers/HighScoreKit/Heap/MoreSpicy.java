package com.yerin.Programmers.HighScoreKit.Heap;

import java.util.PriorityQueue;

public class MoreSpicy {

    public int solution(int[] scoville, int K) {

        int count = 0;

        PriorityQueue<Integer> spicy = new PriorityQueue<>();

        for(int s : scoville){
            spicy.offer(s);
        }

        while(spicy.peek() < K && spicy.size() != 1) {

            int first = spicy.poll();
            int second = spicy.poll();

            spicy.offer(first + (second * 2));

            count++;
        }

        if(spicy.peek() < K && spicy.size() == 1){
            return -1;
        }

        return count;
    }

//    public static void heapSort(int[] arr, int size) {
//
//        if (size < 2) {  // 예외 처리 - 크기카 0이거나 1인 경우엔 정렬을 할 필요가 없음
//            return;
//        }
//
//        // 가장 마지막 노드(size-1)의 부모 노드부터 힙정렬 시작하여 위로 올라가면서 힙정렬.
//        int parentIdx = getParentIdx(size - 1);
//
//        // 1. 최대 힙 만들기
//        for (int i = parentIdx; i >= 0; i--) {  // 아래에서 위로 올라가며 힙정렬하므로, 반대로 for문 돌려줌
//            heapify(arr, i, size - 1);    // 여기서 i는 힙정렬을 할 부모 노드
//        }
//
//        // 2. 정렬하여 최소힙 만들기기
//        for (int i = size-1; i > 0; i--) {
//            // 최대힙의 root node(가장 큰 수)를 맨 마지막 node(제일 작은 수)와 swap한다.
//            // 제일 작은 수가 된 root node를 기준으로 한번 더 힙정렬을 해준다.
//            // 이를 반복하면서 위로 올라가면 최소힙으로 정렬이 완료 된다.
//            swap(arr, i, size-1);
//            heapify(arr, 0, i-1);
//        }
//    }// heapSort
//
//    private static int getParentIdx(int childIdx) {   // 자식 인덱스를 이용해 부모 인덱스를 구하는 메서드
//        return (childIdx - 1) / 2;
//    }
//
//    // 두 인덱스(i와 j)의 원소를 교환하는 메서드
//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[j] = arr[i];
//        arr[i] = temp;
//    }
//
//    public static void heapify(int[] arr, int parentIdx, int lastIdx) {
//
//        int leftChildIdx;
//        int rightChildIdx;
//        int largestIdx;
//
//        // 현재 부모 인덱스의 자식 노드 인덱스가 마지막 인덱스를 넘지 않을 때까지 반복한다.
//        // 이때 왼쪽 자식 노드를 기준으로 한다.
//        // 오른쪽을 기준으로 하면 마지막 부모 인덱스가 왼쪽 자식만 가지고 있을 경우, 비교, 교환을 못하기 때문
//
//        while ((parentIdx * 2) + 1 <= lastIdx) {
//            leftChildIdx = parentIdx * 2 + 1;
//            rightChildIdx = parentIdx * 2 + 2;
//            largestIdx = parentIdx;  // 현재 부모 인덱스가 가장 큰 값을 가지고 있다고 가정
//
//            // left child node와 현재 인덱스(=부모) 값 비교
//            if (arr[leftChildIdx] > arr[largestIdx]) {
//                largestIdx = leftChildIdx;              // 왼쪽 자식 노드의 값이 부모의 값보다 더 크면, '인덱스'를 서로 바꾼다.
//            }
//
//            // right child node와 현재 인덱스(= 부모) 값 비교
//            // 오른쪽 자식 노드는 범위 체크 필요 -> 왼쪽 자식 노드만 있고 오른쪽 자식 노드는 없을 가능성도 있으므로 -> 따라서 lastIdx보다 넘으면 안됨
//            if (rightChildIdx <= lastIdx && arr[rightChildIdx] > arr[largestIdx]) {
//                largestIdx = rightChildIdx;     //
//            }
//
//            // 부모 노드(largestIdx)와 자식 노드의 교환이 발생했을 시,
//            // 둘의 '값'도 서로 교환해줘야 함
//            if (largestIdx != parentIdx) {
//                // 현재 인덱스가 처음에 받았던 parentIdx가 아니라면 = 자식 노드와 교환이 일어났다면
//
//                swap(arr, parentIdx, largestIdx);  // parentIdx와 largestIdx의 값을 바꿔라 = 자식 노드가 부모가 되게 바꿔라
//                parentIdx = largestIdx;         // parentIdx도 largestIdx 넣어 변경
//            }
//
//            else{
//                return;
//            }
//        }
//    }//heapify


    public static void main(String[] args) {

        MoreSpicy s = new MoreSpicy();
        System.out.println(s.solution(new int[]{3, 9, 1, 2, 10, 12}, 7));    // 2

    }

}
