package bronze3.day39;

import java.math.BigInteger;
import java.util.Scanner;

// [문제]
// N개의 정수가 주어지면, 이 정수들의 합 S의 부호를 구하는 프로그램을 작성하시오.
// 입력 :
// 총 3개의 테스트 셋이 주어진다.
// 각 테스트 셋의 첫째 줄에는 N(1 ≤ N ≤ 100,000)이 주어지고, 둘째 줄부터 N개의 줄에 걸쳐 각 정수가 주어진다.
// 주어지는 정수의 절댓값은 9223372036854775807보다 작거나 같다.
// 출력 :
// 총 3개의 줄에 걸쳐 각 테스트 셋에 대해 N개의 정수들의 합 S의 부호를 출력한다.
// S=0이면 "0"을, S>0이면 "+"를, S<0이면 "-"를 출력하면 된다.
// 예제 입력 :
// 3
// 0
// 0
// 0
// 10
// 1
// 2
// 4
// 8
// 16
// 32
// 64
// 128
// 256
// -512
// 6
// 9223372036854775807
// 9223372036854775806
// 9223372036854775805
// -9223372036854775807
// -9223372036854775806
// -9223372036854775804
// 예제 출력 :
// 0
// -
// +

public class BOJ1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            int N = Integer.parseInt(sc.nextLine());
            BigInteger S = new BigInteger("0");  // long으로 처리할 수 없는 매우 큰 수까지 처리해야 하므로 BigInteger 사용. BigInteger는 객체로 생성
            for (int j = 0; j < N; j++) {
                BigInteger n = new BigInteger(sc.nextLine());
                S = S.add(n);  // BigInteger는 불변 객체이기 때문에 값을 직접 바꿀 수 없으므로 S.add(n)으로 작성시 결과값 0. 다시 대입해줘야함
            }
            if(S.compareTo(BigInteger.ZERO) == 0) {
                System.out.println("0");
            } else if(S.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
            // BigInteger는 기본 자료형이 아니므로, 비교 연산자(==, >, <) 대신 compareTo() 메서드를 사용
            // - compareTo(BigInteger.ZERO)는 다음 값을 반환함:
            // - 0: 두 수가 같음
            // - 양수: S가 0보다 큼
            // - 음수: S가 0보다 작음
        }
    }
}