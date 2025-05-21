package bronze5.day15;

import java.util.Scanner;

// [문제]
// 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다.
// 이제 A + B + C를 계산할 차례이다!
// 입력 : 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10¹²)이 공백을 사이에 두고 주어진다.
// 출력 : A+B+C의 값을 출력한다.
// 예제 입력 : 77 77 7777
// 예제 출력 : 7931

public class BOJ11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();  // int의 범위는 -2,147,483,648부터 2,147,483,647이므로 long을 사용
        long B = sc.nextLong();
        long C = sc.nextLong();
        System.out.println(A + B + C);
    }
}