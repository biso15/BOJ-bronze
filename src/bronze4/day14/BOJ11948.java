package bronze4.day14;

import java.util.Scanner;

// [문제]
// JOI는 물리, 화학, 생물, 지구과학, 역사, 지리 총 6 과목의 시험을 봤다.
// 각 시험의 만점은 100점이다.
// JOI는 물리, 화학, 생물, 지구과학 4과목 중에서 3 과목을 선택하고 역사, 지리 2 과목 중에서 한 과목을 선택한다.
// 시험 점수의 합이 가장 높게 나오도록 과목을 선택할 때, JOI가 선택한 과목의 시험 점수의 합을 구하시오.
// 입력 :
// 입력은 6행으로 되어있으며, 각 행에 1개의 정수가 주어진다.
// 1행에는 JOI의 물리 시험의 점수 A가 주어진다.
// 2행에는 JOI의 화학 시험의 점수 B가 주어진다.
// 3행에는 JOI의 생물 시험의 점수 C가 주어진다.
// 4행에는 JOI의 지구과학의 시험 점수 D가 주어진다.
// 5행에는 JOI의 역사 시험의 점수 E가 주어진다.
// 6행에는 JOI의 지리 시험의 점수 F가 주어진다.
// 입력한 정수 A, B, C, D, E, F는 모두 0이상 100이하이다.
// 출력 : JOI가 선택한 과목의 총 점수를 1행에 출력하시오.
// 예제 입력 :
// 100
// 34
// 76
// 42
// 10
// 0
// 예제 출력 : 228

public class BOJ11948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        int min_a = Math.min(A, Math.min(B, Math.min(C, D)));
        int min_b = Math.min(E, F);
        System.out.println(A + B + C + D + E + F - min_a - min_b);

        // 방법 2
        int sum = 0;
        int min_c = Integer.MAX_VALUE;  // MAX_VALUE : 실제 그 데이터타입이 표현할 수 있는 숫자의 범위 중 가장 큰 숫자값을 할당
        int min_d = Integer.MAX_VALUE;
        for(int i = 0; i < 4; i++) {
            int score = sc.nextInt();
            sum += score;
            if(score < min_c) min_c = score;
        }
        for(int i = 0; i < 2; i++) {
            int score = sc.nextInt();
            sum += score;
            if(score < min_d) min_d = score;
        }
        System.out.println(sum - min_c - min_d);
    }
}