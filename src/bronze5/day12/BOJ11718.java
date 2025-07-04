package bronze5.day12;

import java.util.Scanner;

// [문제]
// 입력 받은 대로 출력하는 프로그램을 작성하시오.
// 입력 :
// 입력이 주어진다.
// 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
// 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다.
// 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
// 출력 : 입력받은 그대로 출력한다.
// 예제 입력 :
// Hello
// Baekjoon
// Online Judge
// 예제 출력 :
// Hello
// Baekjoon
// Online Judge

public class BOJ11718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String text = sc.nextLine();
            // next()는 공백 전까지의 문자열을 출력하므로 한줄씩 출력하는 nextLine()을 사용
            System.out.println(text);
        }
    }
}