package bronze3.day4;

import java.util.Arrays;
import java.util.Scanner;

// [문제]
// 세 정수 A, B, C가 주어진다.
// 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
// 출력 : 두 번째로 큰 정수를 출력한다.
// 예제 입력 : 20 30 10
// 예제 출력 : 20

public class BOJ10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        for(int i = 0; i < 3; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);  // A 배열을 오름차순으로 정렬
        System.out.println(A[1]);
    }
}