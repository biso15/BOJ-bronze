package bronze4.day19;

import java.util.Scanner;

// [문제]
// 세연이네 학교 운동장은 아래와 같다.
// 위의 그림에서 영역 A와 B는 반원이며, 영역 C는 직사각형이다.
// 영역 C의 가로의 길이를 d₁, 영역 A의 반지름의 길이 d₂의 값이 주어지면 운동장의 한 바퀴 둘레를 알아내는 프로그램을 작성하시오.
// (단, 이 문제에서는 π (원주율)의 값을 3.141592라고 한다.)
// 입력 :
// 첫째 줄에 d₁의 값이 주어진다.
// 둘째 줄에는 d₂의 값이 주어진다. (d₁, d₂의 값은 100,000 이하의 양의 정수)
// 출력 :
// 첫째 줄에 문제에서 요구하는 정답을 출력한다.
// 절대/상대 오차는 10⁻⁶ 까지 허용한다.
// 예제 입력 :
// 13
// 8
// 예제 출력 : 76.265472

public class BOJ16486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        System.out.println(2 * 3.141592 * d2 + 2 * d1);
    }
}