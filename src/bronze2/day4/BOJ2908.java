package bronze2.day4;

import java.io.IOException;
import java.util.Scanner;

// [문제]
// 상근이의 동생 상수는 수학을 정말 못한다.
// 상수는 숫자를 읽는데 문제가 있다.
// 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
// 상근이는 세 자리 수 두 개를 칠판에 써주었다.
// 그 다음에 크기가 큰 수를 말해보라고 했다.
// 상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
// 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
// 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
// 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
// 입력 :
// 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다.
// 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다.
// 출력 : 첫째 줄에 상수의 대답을 출력한다.
// 예제 입력 : 734 893
// 예제 출력 : 437

public class BOJ2908 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        String A = sc.next();
        String B = sc.next();
        String A2 = "";
        String B2 = "";
        for(int i = 2; i >= 0; i--) {
            A2 += A.charAt(i);
            B2 += B.charAt(i);
        }
        System.out.println(Math.max(Integer.parseInt(A2), Integer.parseInt(B2)));

        // 방법 2
        char[] A1 = sc.next().toCharArray();
        char[] B1 = sc.next().toCharArray();
        char temp = A1[0];
        A1[0] = A1[2];
        A1[2] = temp;
        temp = B1[0];
        B1[0] = B1[2];
        B1[2] = temp;
        int revA = Integer.parseInt(new String(A1));  // new String() : char[]를 String으로 변환
        int revB = Integer.parseInt(new String(B1));
        System.out.println(Math.max(revA, revB));
    }
}