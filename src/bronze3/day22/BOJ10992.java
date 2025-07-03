package bronze3.day22;

import java.util.Scanner;

// [문제]
// 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
// 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
// 예제 입력 : 4
// 예제 출력 :
//    *
//   * *
//  *   *
// *******

public class BOJ10992 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 방법 1
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N + i; j++) {
                if(i < N - 1) {
                    if(j == N + i - 1 || j == N - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 방법 2
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N + i; j++) {
                if(i == 0) {
                    if(j == N - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if(i != N - 1) {
                    if(j == N - i - 1 || j == N + i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}