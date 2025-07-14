 package bronze3.day33;

import java.util.Scanner;

// [문제]
// 2차원 좌표 상의 여러 점의 좌표 (x,y)가 주어졌을 때, 각 사분면과 축에 점이 몇 개 있는지 구하는 프로그램을 작성하시오.
// https://www.acmicpc.net/upload/images/quad.png
// 입력 :
// 첫째 줄에 점의 개수 n (1 ≤ n ≤ 1000)이 주어진다.
// 다음 n개 줄에는 점의 좌표 (xi, yi)가 주어진다. (-106 ≤ xi, yi ≤ 106)
// 출력 : 각 사분면과 축에 점이 몇 개 있는지를 예제 출력과 같은 형식으로 출력한다.
// 예제 입력 :
// 5
// 0 0
// 0 1
// 1 1
// 3 -3
// 2 2
// 예제 출력 :
// Q1: 2
// Q2: 0
// Q3: 0
// Q4: 1
// AXIS: 2

public class BOJ9610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Q1 = 0;
        int Q2 = 0;
        int Q3 = 0;
        int Q4 = 0;
        int AXIS = 0;
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x == 0 || y == 0) {
                AXIS++;
            } else if(x > 0 && y > 0) {
                Q1++;
            } else if(x < 0 && y > 0) {
                Q2++;
            } else if(x < 0 && y < 0) {
                Q3++;
            } else {
                Q4++;
            }
        }
        System.out.println("Q1: " + Q1);
        System.out.println("Q2: " + Q2);
        System.out.println("Q3: " + Q3);
        System.out.println("Q4: " + Q4);
        System.out.println("AXIS: " + AXIS);
    }
}