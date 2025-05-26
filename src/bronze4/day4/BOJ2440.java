package bronze4.day4;

import java.util.Scanner;

// [문제]
// 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
// 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
// 예제 입력 : 5
// 예제 출력 :
// *****
// ****
// ***
// **
// *

public class BOJ2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 방법 1
        for (int i = N; i > 0; i--) {
            for (int j = N; j > 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 방법 2
        for(int i = N; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}