package bronze2.day24;

import java.util.Scanner;

// [문제]
// 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
// 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 출력 : 첫째 줄부터 차례대로 별을 출력한다.
// 예제 입력 : 3
// 예제 출력 :
// * *
//  *
// * *
//  *
// * *
//  *

public class BOJ10996 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            for(int j = 1; j <= N; j++) {
                if(j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            for(int j = 1; j <= N; j++) {
                if(j % 2 == 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 방법 2
        N = sc.nextInt();
        for(int i = 0; i < 2 * N; i++) {
            for(int j = 0; j < N; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}