package bronze2.day5;

import java.util.Scanner;

// [문제]
// 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
// 입력 :
// 첫 줄에 수의 개수 N이 주어진다.
// N은 100이하이다.
// 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
// 출력 : 주어진 수들 중 소수의 개수를 출력한다.
// 예제 입력 :
// 4
// 1 3 5 7
// 예제 출력 : 3

public class BOJ1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        int N = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if(num == 1) continue;
            for(int j = 2; j < num; j++) {
                if(num % j == 0) {
                    break;
                }
                if(j == num - 1) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

        // 방법 2
        N = sc.nextInt();
        cnt = 0;
        for(int i = 0; i < N; i++) {
            int num = sc.nextInt();
            boolean isTrue = true;
            if(num == 1) {  // 1보다 크고 약수가 나 외에 없는 수가 소수이다.
                isTrue =false;
            } else {
                for(int j = 2; j <= Math.sqrt(num); j++) {
                    if(num % j == 0) {
                        isTrue = false;
                        break;
                    }
                }
            }
            if(isTrue) cnt++;
        }
        System.out.println(cnt);
    }
}