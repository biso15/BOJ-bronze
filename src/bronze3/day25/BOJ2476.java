package bronze3.day25;

import java.util.Scanner;

// [문제]
// 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
// 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
// 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
// 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
// 예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
// 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
// 3개의 눈이 6, 2, 5로 주어지면 그 중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
// N(2 ≤ N ≤ 1,000)명이 주사위 게임에 참여하였을 때, 가장 많은 상금을 받은 사람의 상금을 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에는 참여하는 사람 수 N이 주어지고 그 다음 줄부터 N개의 줄에 사람들이 주사위를 던진 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
// 출력 : 첫째 줄에 가장 많은 상금을 받은 사람의 상금을 출력한다.
// 예제 입력 :
// 3
// 3 3 6
// 2 2 2
// 6 2 5
// 예제 출력 : 12000

public class BOJ2476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int max = 0;
        for(int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int total;
            if(A == B && B == C) {
                total = 10000 + A * 1000;
            } else if(A == B || A == C) {
                total = 1000 + A * 100;
            } else if(B == C) {
                total = 1000 + B * 100;
            } else {
                total = Math.max(A, Math.max(B, C)) * 100;
            }
            if(total > max) {
                max = total;
            }
        }
        System.out.println(max);
    }
}