package bronze3.day24;

import java.util.Scanner;

// [문제]
// 백준대학교에서는 대회에 나갈 때 2명의 여학생과 1명의 남학생이 팀을 결성해서 나가는 것이 원칙이다. (왜인지는 총장님께 여쭈어보는 것이 좋겠다.)
// 백준대학교는 뛰어난 인재들이 많아 올해에도 N명의 여학생과 M명의 남학생이 팀원을 찾고 있다.
// 대회에 참여하려는 학생들 중 K명은 반드시 인턴쉽 프로그램에 참여해야 한다.
// 인턴쉽에 참여하는 학생은 대회에 참여하지 못한다.
// 백준대학교에서는 뛰어난 인재들이 많기 때문에, 많은 팀을 만드는 것이 최선이다.
// 여러분은 여학생의 수 N, 남학생의 수 M, 인턴쉽에 참여해야하는 인원 K가 주어질 때 만들 수 있는 최대의 팀 수를 구하면 된다.
// 입력 : 첫째 줄에 N, M, K가 순서대로 주어진다. (0 ≤ M ≤ 100, 0 ≤ N ≤ 100, 0 ≤ K ≤ M+N)
// 출력 : 만들 수 있는 팀의 최대 개수을 출력하면 된다.
// 예제 입력 : 6 3 2
// 예제 출력 : 2

public class BOJ2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int T;
        if(N / 2 >= M) {
            if(M - (N / 2) >= K) {
                T = M;
            } else {
                T = M - 1;
            }
        } else {
            if(M - (N / 2) >= K) {
                T = N / 2;
            } else {
                T = N / 2 - 1;
            }
        }
        System.out.println(T);

        // 방법 2
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        T = 0;
        while(true) {
            if(N - 2 + M - 1 < K || N < 2 || M < 1) {
                break;
            }
            T++;
            N -= 2;
            M -= 1;
        }
        System.out.println(T);
    }
}