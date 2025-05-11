package day10;

import java.util.Scanner;

// [문제]
// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
// 입력 : 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
// 출력 : 입력으로 주어진 글자의 아스키 코드 값을 출력한다.
// 예제 입력 : A
// 예제 출력 : 65

public class BOJ11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char ch = text.charAt(0);  // char로 변경
        System.out.println((int)ch);
        // char를 int로 형변환 해서 출력하면 아스키 코드로 변환되서 출력됨
        // int를 chat로 형변환 해서 출력하면 문자로 변환되서 출력됨
    }
}
