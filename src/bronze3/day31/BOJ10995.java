package bronze3.day31;

import java.util.Scanner;

// [문제]
// 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
// 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다. (1 ≤ T ≤ 10, 1 ≤ n ≤ 106)
// 출력 : 첫째 줄부터 차례대로 별을 출력한다.
// 예제 입력 : 3
// 예제 출력 :
// * * *
//  * * *
// * * *

public class BOJ10995 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            if(i % 2 == 1) {
                System.out.print(" ");
            }
            for(int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 방법 2
        N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 2 * N; j++) {
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