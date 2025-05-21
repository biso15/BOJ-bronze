package bronze5.day11;

import java.util.Scanner;

// [문제]
// 0보다 크거나 같은 정수 N이 주어진다.
// 이때, N!을 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 정수 N(0 ≤ N ≤ 12)이 주어진다.
// 출력 : 첫째 줄에 N!을 출력한다.
// 예제 입력 : 10
// 예제 출력 : 3628800

public class BOJ10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 팩토리얼 : 1 ~ N까지의 곱. 단, 0!은 1
        int result = 1;
        if(N != 0) {
            for(int i = 1; i <= N; i++) {
                result *= i;
            }
        }
        System.out.println(result);
    }
}
