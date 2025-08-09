package bronze2.day19;

import java.util.Scanner;

// [문제]
// 16진수 수를 입력받아서 10진수로 출력하는 프로그램을 작성하시오.
// 입력 :
// 첫째 줄에 16진수 수가 주어진다.
// 이 수의 최대 길이는 6글자이다.
// 16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15를 뜻한다.
// 또, 이 수는 음이 아닌 정수이다.
// 출력 : 첫째 줄에 입력으로 주어진 16진수 수를 10진수로 변환해 출력한다.
// 예제 입력 : A
// 예제 출력 : 10

public class BOJ1550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] N = sc.nextLine().toCharArray();
        int result = 0;
        for(int i = N.length - 1; i >= 0; i--) {
            int temp = (int)Math.pow(16, N.length - 1 - i);
            if((int)N[i] >= 'A') {
                result += (N[i] - 55) * temp;
            } else {
                result += (N[i] - '0') * temp;
            }
        }
        System.out.println(result);
    }
}