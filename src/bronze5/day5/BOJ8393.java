package bronze5.day5;

import java.util.Scanner;

// [문제]
// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
// 출력 : 1부터 n까지 합을 출력한다.
// 예제 입력 : 3
// 예제 출력 : 6

public class BOJ8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
