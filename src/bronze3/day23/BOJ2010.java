package bronze3.day23;

import java.util.Scanner;

// [문제]
// 선영이의 집에는 플러그를 꽂을 수 있는 콘센트가 하나밖에 없다.
// 선영이는 많은 컴퓨터를 가지고 있는데, 컴퓨터의 전원 문제는 어떻게 해결하는 것일까?
// 하나의 콘센트가 있고, N개의 멀티탭이 있다.
// 각 멀티탭은 몇 개의 콘센트로 이루어져 있다고 한다.
// 최대 몇 대의 컴퓨터를 전원에 연결할 수 있을까?
// 입력 :
// 첫째 줄에 멀티탭의 개수 N이 주어진다. (1 ≤ N ≤ 500,000)
// 이어서 둘째 줄부터 N개의 줄에 걸쳐 각 멀티탭이 몇 개의 플러그를 꽂을 수 있도록 되어 있는지를 나타내는 자연수가 주어진다.
// 이 자연수는 1,000을 넘지 않는다.
// 출력 : 첫째 줄에 최대로 전원에 연결될 수 있는 컴퓨터의 수를 출력한다.
// 예제 입력 :
// 3
// 1
// 1
// 1
// 예제 출력 : 1

public class BOJ2010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        int N = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < N; i++) {
            int P = sc.nextInt();
            if(i < N - 1) {
                sum += P - 1;
            } else {
                sum += P;
            }
        }
        System.out.println(sum);

        // 방법 2
        N = sc.nextInt();
        sum = 0;
        for(int i = 0; i < N; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum - (N - 1));
    }
}