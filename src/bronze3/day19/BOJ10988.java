package bronze3.day19;

import java.util.Scanner;

// [문제]
// 알파벳 소문자로만 이루어진 단어가 주어진다.
// 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
// 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다.
// level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
// 입력 :
// 첫째 줄에 단어가 주어진다.
// 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
// 출력 : 첫째 줄에 팰린드롬이면 1, 아니면 0을 출력한다.
// 예제 입력 : level
// 예제 출력 : 1

public class BOJ10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();

        // 방법 1
        int palindrome = 1;
        for(int i = 0; i < str.length / 2; i++) {
            if(str[i] != str[str.length-1-i]) {
                palindrome = 0;
                break;
            }
        }
        System.out.println(palindrome);

        // 방법 2
        int start_index = 0;
        int end_index = str.length - 1;
        boolean isF = true;
        while(start_index < end_index) {
            if(str[start_index] != str[end_index]) {
                isF = false;
                break;
            }
            start_index++;
            end_index--;
        }
        if(isF) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}