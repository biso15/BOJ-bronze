package bronze2.day4;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// [문제]
// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
// 입력 :
// 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
// 둘째 줄부터 N개의 줄에는 수가 주어진다.
// 이 수는 절댓값이 1,000보다 작거나 같은 정수이다.
// 수는 중복되지 않는다.
// 출력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
// 예제 입력 :
// 5
// 5
// 2
// 3
// 4
// 1
// 예제 출력 :
// 1
// 2
// 3
// 4
// 5

public class BOJ2750 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        int N = sc.nextInt();
        int[] intArr = new int[N];
        for(int i = 0; i < N; i++) {
            intArr[i] = sc.nextInt();
        }
        Arrays.sort(intArr);  // 자바에서 제공해주는 소팅. nlogn 시간복잡도
        for(int i = 0; i < N; i++) {
            System.out.println(intArr[i]);
        }

        // 방법 2
        for(int i = 1; i < N; i++) {
            for(int j = 0; j < N - i; j++) {
                if(intArr[j] > intArr[j + 1]){
                    int temp = intArr[j];
                    intArr[j] = intArr[j + 1];
                    intArr[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < N; i++) {
            System.out.println(intArr[i]);
        }
    }
}