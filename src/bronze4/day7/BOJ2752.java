package bronze4.day7;

import java.util.Arrays;
import java.util.Scanner;

// [문제]
// 동규는 세수를 하다가 정렬이 하고 싶어졌다.
// 정수 세 개를 생각한 뒤에, 이를 오름차순으로 정렬하고 싶어졌다.
// 정수 세 개가 주어졌을 때, 가장 작은 수, 그 다음 수, 가장 큰 수를 출력하는 프로그램을 작성하시오.
// 입력 :
// 정수 세 개가 주어진다.
// 이 수는 1보다 크거나 같고, 1,000,000보다 작거나 같다.
// 이 수는 모두 다르다.
// 출력 : 제일 작은 수, 그 다음 수, 제일 큰 수를 차례대로 출력한다.
// 예제 입력 : 3 1 2
// 예제 출력 : 1 2 3

public class BOJ2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] result = new int[3];
        for(int i = 0; i < 3; i++) {
            result[i] = sc.nextInt();
        }
        Arrays.sort(result);  // 배열을 오름차순 정렬
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        // 배열을 내림차순 정렬하는 법
        // 방법 1
        // 오름차순 정렬 후 뒤부터 출력
        // 방법 2
        // Arrays.sort(arr, Collections.reverseOrder()) 사용. 단, Integer[] 필요
    }
}