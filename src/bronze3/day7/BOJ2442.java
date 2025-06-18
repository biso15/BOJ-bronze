package bronze3.day7;

import java.util.Scanner;

// [문제]
// 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
// 별은 가운데를 기준으로 대칭이어야 한다.
// 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
// 예제 입력 : 5
// 예제 출력 :
//     *
//    ***
//   *****
//  *******
// *********

public class BOJ2442 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 방법 1
        for(int i = 1; i <= N; i++) {
            for(int j = N; j > 0; j--) {
                if(i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            for(int j = 1; j <= N; j++) {
                if(i > j) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 방법 2
        for(int i = 0; i < N; i++) {
            for(int j = 1; j <= N + i; j++) {
                if(N - i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 방법 3
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N + i; j++) {
                if(N - i - j <= 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
