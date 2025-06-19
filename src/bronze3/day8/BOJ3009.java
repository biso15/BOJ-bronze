package bronze3.day8;

import java.util.Scanner;

// [문제]
// 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
// 입력 :
// 세 점의 좌표가 한 줄에 하나씩 주어진다.
// 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
// 출력 : 직사각형의 네 번째 점의 좌표를 출력한다.
// 예제 입력 :
// 5 5
// 5 7
// 7 5
// 예제 출력 :
// 7 7

public class BOJ3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        String[] A = sc.nextLine().split(" ");
        String[] B = sc.nextLine().split(" ");
        String[] C = sc.nextLine().split(" ");
        String[] D = new String[2];
        if(A[0].equals(B[0])) {
            D[0] = C[0];
        } else if(A[0].equals(C[0])) {
            D[0] = B[0];
        } else {
            D[0] = A[0];
        }
        if(A[1].equals(C[1])) {
            D[1] = B[1];
        } else if(A[1].equals(B[0])) {
            D[1] = C[1];
        } else {
            D[1] = A[1];
        }
        System.out.println(D[0] + " " + D[1]);

        // 방법 2
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4;
        int y4;
        if(x1 == x2) x4 = x3;
        else if(x1 == x3) x4 = x2;
        else x4 = x1;
        if(y1 == y2) y4 = y3;
        else if(y1 == y3) y4 = y2;
        else y4 = y1;
        System.out.println(x4 + " " + y4);
    }
}
