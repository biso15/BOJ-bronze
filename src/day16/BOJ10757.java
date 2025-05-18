package day16;

import java.math.BigInteger;
import java.util.Scanner;

// [문제]
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A,B < 10¹⁰⁰⁰⁰)
// 출력 : 첫째 줄에 A+B를 출력한다.
// 예제 입력 : 9223372036854775807 9223372036854775808
// 예제 출력 : 18446744073709551615

public class BOJ10757 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();  // long보다 큰 경우 BigInteger를 사용
        BigInteger B = sc.nextBigInteger();
        System.out.println(A.add(B));  // A + B가 아닌 A.add(B)를 사용
    }
}