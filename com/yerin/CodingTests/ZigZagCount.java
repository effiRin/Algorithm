package com.yerin.CodingTests;

public class ZigZagCount {

    public long solution(int n, int r, int c) {

        // <개선한 코드>

        int row = 1;      // 행
        int col = 1;      // 열

        int count = 1;

        outer:
        while (count <= n * n) {

            if (col < n) {    //  '→'
                col++;
            } else {        // col = n일 때 (꼭짓점 도달했을 때) 규칙 변경  '↓'
                row++;
            }

            count++;

            if (row == r & col == c) {
                break outer;
            }

            while (col > 1 && row < n) {   // 열(col)이 1이 아니면서, 행(row)이 n되기 전까지 = 행의 변에 부딪히기 전까지 '↙'
                // 참고로 행(row)가 n이 될 때 = 변에 부딪혔을 때로, 규칙이 바뀐다.
                row++;
                col--;
                count++;
                if (row == r & col == c) {
                    break outer;
                }
            }

            if (row < n) {    // '↓'
                row++;
            } else {        // col = n일 때 (꼭짓점 도달했을 때) 규칙 변경  '→'
                col++;
            }

            count++;

            if (row == r & col == c) {
                break outer;
            }

            while (row > 1 && col < n) {   // (행(row)가 1이 아니면서, 열(col)가 n되기 전까지 = 열의 변에 닿기 전까지 '↗'
                // 참고로 열(col)가 n이 될 때 = 변에 부딪혔을 때로, 규칙이 바뀐다.
                row--;
                col++;
                count++;
                if (row == r & col == c) {
                    break outer;
                }
            }
        }// outer while

        return count;       //  break가 있는 if문에 걸려 나왔을 때의 count가 (r,c)의 숫자이다.
    } // solution




    public static void main(String[] args) {

        ZigZagCount s = new ZigZagCount();
        System.out.println(s.solution(5, 3, 2));  // 9
        System.out.println(s.solution(6, 5, 4));  // 29

    }
}
