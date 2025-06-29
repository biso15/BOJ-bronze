package bronze4.day10;

import java.util.Scanner;

// [문제]
// 상근이는 초등학교에 다닐 때, 방학 숙제를 남들보다 먼저 미리 하고 남은 기간을 놀았다.
// 방학 숙제는 수학과 국어 문제 풀기이다.
// 방학은 총 L일이다.
// 수학은 총 B페이지, 국어는 총 A페이지를 풀어야 한다.
// 상근이는 하루에 국어를 최대 C페이지, 수학을 최대 D페이지 풀 수 있다.
// 상근이가 겨울 방학동안 숙제를 하지 않고 놀 수 있는 최대 날의 수를 구하는 프로그램을 작성하시오.
// 입력 :
// 한 줄에 하나씩 총 다섯 줄에 걸쳐 L, A, B, C, D가 주어진다. (2 ≤ L ≤ 40, 1 ≤ A, B ≤ 1000, 1 ≤ C, D ≤ 100)
// 항상 방학 숙제를 방학 기간내에 다 할 수 있는 경우만 입력으로 주어진다.
// 출력 : 첫째 줄에 상근이가 놀 수 있는 날의 최댓값을 출력한다.
// 예제 입력 :
// 20
// 25
// 30
// 6
// 8
// 예제 출력 : 15

public class BOJ5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int periodA = A / C;
        int periodB = B / D;
        if(A % C != 0) periodA++;
        if(B % D != 0) periodB++;
        int day = L - Math.max(periodA, periodB);
        System.out.println(day);
    }
}