package bronze3.day5;

import java.util.Arrays;
import java.util.Scanner;

// [문제]
// 한수는 지금 (x, y)에 있다.
// 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
// 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 x, y, w, h가 주어진다.
// 출력 : 첫째 줄에 문제의 정답을 출력한다.
// 제한 :
// 1 ≤ w, h ≤ 1,000
// 1 ≤ x ≤ w-1
// 1 ≤ y ≤ h-1
// x, y, w, h는 정수
// 예제 입력 : 6 2 10 3
// 예제 출력 : 1

public class BOJ1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        // 방법 1
        int[] arr = new int[4];
        arr[0] = x;
        arr[1] = y;
        arr[2] = w - x;
        arr[3] = h - y;
        Arrays.sort(arr);
        System.out.println(arr[0]);

        // 방법 2
        int min = x;
        if(min > y) min = y;
        if(min > w - x) min = w - x;
        if(min > h - y) min = h - y;
        System.out.println(min);
    }
}