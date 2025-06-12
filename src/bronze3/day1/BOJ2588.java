package bronze3.day1;

import java.util.Scanner;

// [문제]
// (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
// https://www.acmicpc.net/upload/images/f5NhGHVLM4Ix74DtJrwfC97KepPl27s%20(1).png
// (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
// 출력 : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
// 예제 입력 :
// 472
// 385
// 예제 출력 :
// 2360
// 3776
// 1416
// 181720

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        char[] n2 = sc.next().toCharArray();
        int sum = 0;
        int flag = 1;
        for(int i = n2.length - 1; i >= 0; i--) {
            int intN2 = Integer.parseInt(String.valueOf(n2[i]));
            System.out.println(n1 * intN2);
            sum += n1 * intN2 * flag;
            flag *= 10;
        }
        System.out.println(sum);
    }
}