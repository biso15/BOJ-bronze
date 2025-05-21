package bronze5.day2;

import java.util.Scanner;

// [문제]
// 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 출력 : 첫째 줄에 A×B를 출력한다.
// 예제 입력 : 3 4
// 예제 출력 : 12

public class BOJ10998 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A * B);
    }
}
