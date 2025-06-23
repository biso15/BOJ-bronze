package bronze3.day12;

import java.util.Scanner;

// [문제]
// 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
// 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 출력 : 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
// 예제 입력 : 5
// 예제 출력 :
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

public class BOJ2445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 방법 1
        for (int i = 1; i <= 2 * N - 1; i++) {
            if (i <= N) {
                for (int j = 1; j <= N; j++) {
                    if (i >= j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                for (int j = N; j > 0; j--) {
                    if (j <= i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = N; j > 0; j--) {
                    if (j <= i - N) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                for (int j = 1; j <= N; j++) {
                    if (i - N >= j) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

        // 방법 2
        for (int i = 0; i < N; i++) {
            for(int j = 0; j < 2 * N; j++) {
                if(j <= i || i + j >= 2 * N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = N; i < 2 * N ; i++) {
            for(int j = 0; j < 2 * N; j++) {
                if(j > i || i + j < 2 * N - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}