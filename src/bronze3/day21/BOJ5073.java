package bronze3.day21;

import java.util.Arrays;
import java.util.Scanner;

// [문제]
// 삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.
// Equilateral :  세 변의 길이가 모두 같은 경우
// Isosceles : 두 변의 길이만 같은 경우
// Scalene : 세 변의 길이가 모두 다른 경우
// 단 주어진 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우에는 "Invalid" 를 출력한다.
// 예를 들어 6, 3, 2가 이 경우에 해당한다.
// 가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
// 세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.
// 입력 :
// 각 줄에는 1,000을 넘지 않는 양의 정수 3개가 입력된다.
// 마지막 줄은 0 0 0이며 이 줄은 계산하지 않는다.
// 출력 : 각 입력에 맞는 결과 (Equilateral, Isosceles, Scalene, Invalid) 를 출력하시오.
// 예제 입력 :
// 7 7 7
// 6 5 4
// 3 2 5
// 6 2 6
// 0 0 0
// 예제 출력 :
// Equilateral
// Scalene
// Invalid
// Isosceles

public class BOJ5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        while(true) {
            int[] arr = new int[3];
            for(int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
            }
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }
            Arrays.sort(arr);
            if(arr[0] + arr[1] > arr[2]) {
                if (arr[0] == arr[1] && arr[1] == arr[2]) {
                    System.out.println("Equilateral");
                } else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[2] == arr[0]) {
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }
            } else {
                System.out.println("Invalid");
            }
        }

        // 방법 2
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if(A == B && B == C && C == 0) break;
            int max = Math.max(A, Math.max(B, C));
            int sum = A + B + C - max;
            if(sum <= max) {
                System.out.println("Invalid");
            } else if (A == B && B == C) {
                System.out.println("Equilateral");
            } else if (A == B || B == C || C == A) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}