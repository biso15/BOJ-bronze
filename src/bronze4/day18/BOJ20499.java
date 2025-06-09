package bronze4.day18;

import java.util.Scanner;

// [문제]
// 아무래도 우리 팀 다리우스가 고수인 것 같다. 그의 K/D/A를 보고 그가 「진짜」인지 판별해 보자.
// K+A < D이거나, D = 0이면 그는 「가짜」이고, 그렇지 않으면 「진짜」이다.
// 입력 : K/D/A가 주어진다.
// 출력 : 그가 「진짜」이면 gosu, 「가짜」이면 hasu를 출력한다.
// 제한 : 0 ≤ K, D, A ≤ 2
// 예제 입력 : 0/5/3
// 예제 출력 : hasu

public class BOJ20499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] KDA = sc.nextLine().split("/");
        int K = Integer.parseInt(KDA[0]);
        int D = Integer.parseInt(KDA[1]);
        int A = Integer.parseInt(KDA[2]);
        if((K + A < D) || (D == 0)) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}