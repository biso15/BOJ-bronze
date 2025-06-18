package bronze3.day7;

import java.util.Scanner;

// [문제]
// 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
// 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
// 입력 :
// 첫째 줄에 단어가 주어진다.
// 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않는다.
// 길이가 0인 단어는 주어지지 않는다.
// 출력 :
// 입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다.
// 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.
// 예제 입력 : BaekjoonOnlineJudge
// 예제 출력 :
// BaekjoonOn
// lineJudge

public class BOJ11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        char[] N = sc.nextLine().toCharArray();
        String str = "";
        for (int i = 0; i < N.length; i++) {
            str += String.valueOf(N[i]);
            if (i % 10 == 9 || i == N.length - 1) {
                System.out.println(str);
                str = "";
            }
        }

        // 방법 2
        String N2 = sc.nextLine();
        for(int i = 0; i < N2.length(); i = i + 10) {
            String temp;
            if(i + 10 < N2.length()) {
                temp = N2.substring(i, i + 10);
            } else {
                temp = N2.substring(i);
            }
            System.out.println(temp);
        }
    }
}
