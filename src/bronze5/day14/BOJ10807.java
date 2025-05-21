package bronze5.day14;

import java.util.Scanner;

// [문제]
// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
// 입력 :
// 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다.
// 둘째 줄에는 정수가 공백으로 구분되어져있다.
// 셋째 줄에는 찾으려고 하는 정수 v가 주어진다.
// 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
// 출력 : 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
// 예제 입력 :
// 11
// 1 4 1 2 4 2 4 2 3 4 4
// 2
// 예제 출력 : 3

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[201];
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            int index = sc.nextInt();
            number[index + 100]++;
            // index는 음수가 없으므로 100을 더해서 사용한다.
            // -100 -> 0, 100 -> 200
        }
        int v = sc.nextInt();
        System.out.println(number[v + 100]);
    }
}