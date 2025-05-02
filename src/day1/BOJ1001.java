package day1;

import java.util.Scanner;

// [문제]
// 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
// 예제 입력 : 3 2
// 예제 출력: 1

public class BOJ1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A - B);
    }
}