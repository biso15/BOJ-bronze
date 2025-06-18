package bronze3.day7;

import java.util.Arrays;
import java.util.Scanner;

// [문제]
// 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
// 주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.
// 입력 :
// 입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
// 각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
// 출력 : 각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
// 예제 입력 :
// 6 8 10
// 25 52 60
// 5 12 13
// 0 0 0
// 예제 출력 :
// right
// wrong
// right

public class BOJ4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            // 방법 1
            int[] arr = new int[3];
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }
            Arrays.sort(arr);
            int a = arr[0] * arr[0];
            int b = arr[1] * arr[1];
            int c = arr[2] * arr[2];
            if(a + b == c) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

            // 방법 2
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            boolean flag = false;
            if(B < A && C < A) {
                if(A * A == B * B + C * C) flag = true;
            } else if(A < B && C < B) {
                if(B * B == A * A + C * C) flag = true;
            } else {
                if(C * C == A * A + B * B) flag = true;
            }
            if(flag) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
