package bronze3.day11;

import java.util.Scanner;

// [문제]
// <그림 1>과 같이 9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는 프로그램을 작성하시오.
// 예를 들어, 다음과 같이 81개의 수가 주어지면
// https://www.acmicpc.net/problem/2566
// 이들 중 최댓값은 90이고, 이 값은 5행 7열에 위치한다.
// 입력 :
// 첫째 줄부터 아홉 번째 줄까지 한 줄에 아홉 개씩 수가 주어진다.
// 주어지는 수는 100보다 작은 자연수 또는 0이다.
// 출력 :
// 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 위치한 행 번호와 열 번호를 빈칸을 사이에 두고 차례로 출력한다.
// 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다.
// 예제 입력 :
// 3 23 85 34 17 74 25 52 65
// 10 7 39 42 88 52 14 72 63
// 87 42 18 78 53 45 18 84 53
// 34 28 64 85 12 16 75 36 55
// 21 77 45 35 28 75 90 76 1
// 25 87 65 15 28 11 37 28 74
// 65 27 75 41 7 89 78 64 39
// 47 47 70 45 23 65 3 41 44
// 87 13 82 38 31 12 29 29 80
// 예제 출력 :
// 90
// 5 7

public class BOJ2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        int[] maxArr = new int[2];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 9; i++) {
            String[] arr = sc.nextLine().split(" ");
            for(int j = 0; j < 9; j++) {
                int num = Integer.parseInt(arr[j]);
                if(num > max) {
                    max = num;
                    maxArr[0] = i + 1;
                    maxArr[1] = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxArr[0] + " " + maxArr[1]);

        // 방법 2
        int max_num = -1;
        int max_row = 1;
        int max_col = 1;
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                int temp = sc.nextInt();
                if(temp > max_num) {
                    max_num = temp;
                    max_row = i;
                    max_col = j;
                }
            }
        }
        System.out.println(max_num);
        System.out.println(max_row + " " + max_col);
    }
}