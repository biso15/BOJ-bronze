package bronze3.day16;

import java.util.Scanner;

// [문제]
// 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
// 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 출력 : 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
// 예제 입력 : 3
// 예제 출력 :
//   *
//  **
// ***
//  **
//   *

public class BOJ2522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 방법 1
        for(int i = 2 * N - 1; i > 0; i--) {
            for(int j = 0; j < N; j++) {
                if((i >= N && i - j > N) || (i < N && i + j < N)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 방법 2
        for(int i = 0; i < 2 * N - 1; i++) {
            for(int j = 0; j < N; j++) {
                if((i < N && i + j >= N - 1) || (i >= N && i - j <= N - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}