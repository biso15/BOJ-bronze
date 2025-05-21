package bronze5.day2;

import java.util.Scanner;

// [문제]
// 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
// 출력 : 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
// 예제 입력 : 1 3
// 예제 출력 : 0.33333333333333333333333333333333

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextInt();
        double B = sc.nextInt();
        System.out.println(A / B);
        // float과 doule은 정밀도에서 차이가 있다.
        // float : 소수점 6~7자리 정도까지 표현 가능
        // double : 소수점 15~16자리 정도까지 표현 가능
        // TODO 코딩 테스트에서는 float보다 double 사용을 지향
    }
}
