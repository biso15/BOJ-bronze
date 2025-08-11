package bronze2.day21;

import java.util.Scanner;

// [문제]
// 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
// 입력 :
// 첫째 줄에 8진수가 주어진다.
// 주어지는 수의 길이는 333,334을 넘지 않는다.
// 출력 :
// 첫째 줄에 주어진 수를 2진수로 변환하여 출력한다.
// 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
// 예제 입력 : 314
// 예제 출력 : 11001100

public class BOJ1212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        char[] N = sc.next().toCharArray();
        String result = "";
        for(int i = 0; i < N.length; i++) {
            int n = N[i] - '0';
            if(n >= 4) {
                result += "1";
                n -= 4;
            } else {
                result += "0";
            }
            if(n >= 2) {
                result += "1";
                n -= 2;
            } else {
                result += "0";
            }
            if(n >= 1) {
                result += "1";
            } else {
                result += "0";
            }
        }
        System.out.println(Integer.parseInt(result));

        // 방법 2
        char[] number = sc.next().toCharArray();
        for(int i = 0; i < number.length; i++) {
            if(i == 0) {
                if(number[i] == '1') System.out.print("1");
                else if(number[i] == '2') System.out.print("10");
                else if(number[i] == '3') System.out.print("11");
            } else {
                if(number[i] == '0') System.out.print("000");
                else if(number[i] == '1') System.out.print("001");
                else if(number[i] == '2') System.out.print("010");
                else if(number[i] == '3') System.out.print("011");
            }
            if(number[i] == '4') System.out.print("100");
            else if(number[i] == '5') System.out.print("101");
            else if(number[i] == '6') System.out.print("110");
            else if(number[i] == '7') System.out.print("111");
        }
    }
}