package bronze3.day7;

import java.util.Scanner;

// [문제]
// 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
// 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 출력 : 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
// 예제 입력 : 5
// 예제 출력 :
//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *

public class BOJ2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 방법 1
        for(int i = 0; i < N; i++) {
            for(int j = N - i; j > 1; j--) {
                System.out.print(" ");
            }
            for(int y = 1; y <= (2 * i + 1); y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = N; i > 1; i--) {
            for(int j = N - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for(int y = (2 * (i - 1) - 1); y > 0; y--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 방법 2
        for(int i = 0; i < (2 * N - 1); i++) {
            for(int j = 1; j <= (2 * N - 1); j++) {
                if(i < N) {
                    if(j < N - i) {
                        System.out.print(" ");
                    } else if(j <= i + N) {
                        System.out.print("*");
                    }
                } else{
                    if(j <= i - N + 1) {
                        System.out.print(" ");
                    } else if(j < (2 * N - 1) - (i - N)) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }

        // 방법 3
        for(int i = 0; i < N; i++) {
            for(int j = N - 1; j >= 0; j--) {
                if(i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int j = 1; j < N; j++) {
                if(i >= j) System.out.print("*");
            }
            System.out.println();
        }
        for(int i = N - 2; i >= 0; i--) {
            for(int j = N - 1; j >= 0; j--) {
                if(i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for(int j = 1; j < N; j++) {
                if(i >= j) System.out.print("*");
            }
            System.out.println();
        }
    }
}