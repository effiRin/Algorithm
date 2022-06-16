package com.company;

public class CountUntilOne {

        public int operationCountUntilOne(int N, int K) {
            int count = 0;
            int num = N;

            for (int i = 0; i < N && num!=0; i++) {
                int remainder = num % K;

                if (remainder == 0) {
                    num = num / K;
                    count++;

                } else {
                    num = num - remainder;
                    count += remainder;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            CountUntilOne s = new CountUntilOne();

            System.out.println(s.operationCountUntilOne(25, 7)); // 7
            System.out.println(s.operationCountUntilOne(25, 5)); // 2
        }
    }

//    public static void main(String[] args) {
//
//        int n = 25;
//        int k = 5;
//
//        int num = (n-1);
//        int count = 0;
//
//        for (int i = 0; i < n; i++) {
//
//            num = (num/k);
//            count++;
//
//            if(num < 1){
//                break;
//            }
//        }
//
//        System.out.println(count);
//
//                }
//            }
