package bronze5.day20;

import java.util.Scanner;

// [문제]
// 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
// 입력 :
// 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다.
// 단어의 길이는 최대 100이다.
// 출력 : 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
// 예제 입력 : WrongAnswer
// 예제 출력 : wRONGaNSWER

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char[] charArr = sc.nextLine().toCharArray();  // charArray 사용도 가능하다.
        String charArr = sc.nextLine();
        for(int i = 0 ; i < charArr.length() ; i++) {
            if(charArr.charAt(i) >= 'a' &&  charArr.charAt(i) <= 'z') {  // char 타입은 문자끼리 서로 크기 비교가 가능하다.
                System.out.print((char)(charArr.charAt(i) - 32));  // char 타입은 숫자와 연산도 가능하다. (아스키코드)
            } else {
                System.out.print((char)(charArr.charAt(i) + 32));
            }
        }
    }
}