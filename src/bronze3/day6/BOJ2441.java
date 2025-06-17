package bronze3.day6;

import java.util.Scanner;

// [문제]
// 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
// 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
// 입력 : 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
// 출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
// 예제 입력 : 5
// 예제 출력 :
// *****
//  ****
//   ***
//    **
//     *

public class BOJ2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // 방법 1
        for(int i = 0; i < N; i++) {
            for(int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int y = N - i; y > 0; y--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 방법 2
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}