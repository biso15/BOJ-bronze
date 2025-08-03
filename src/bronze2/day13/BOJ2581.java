package bronze2.day13;

import java.io.IOException;
import java.util.Scanner;

// [문제]
// 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
// 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
// 입력 :
// 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
// M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
// 출력 :
// M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
// 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
// 예제 입력 :
// 60
// 100
// 예제 출력 :
// 620
// 61

public class BOJ2581 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = N;
        boolean flag = false;
        for(int i = M; i <= N; i++) {
            for(int j = 2; j <= i / 2 + 1; j++) {
                if(i % j == 0) {
                   break;
                }
                if(j == i / 2 + 1) {
                    flag = true;
                }
            }
            if(flag) {
                sum += i;
                if(min > i) min = i;
                flag = false;
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

        // 방법 2
        int[] arr = new int[10001];
        for(int i = 2; i < 10001; i++) {
            arr[i] = i;
        }
        // 10000 이하의 소수 구하기
        // 소수면 그 자리에 자기 값을 그대로 가지고 있고, 소수가 아니면 0으로 변경
        for(int i = 2; i < Math.sqrt(10001); i++) {
            if(arr[i] == i) {  // 소수 확인
                for(int j = i + i; j < 10001; j = j + i) {
                    arr[j] = 0;
                }
            }
        }
        M = sc.nextInt();
        N = sc.nextInt();
        sum = 0;
        min = 0;
        for(int i = N; i >= M; i--) {
            sum += arr[i];
            if(arr[i] != 0) {
                min = arr[i];
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}