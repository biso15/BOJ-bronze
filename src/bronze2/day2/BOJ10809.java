package bronze2.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// [문제]
// 알파벳 소문자로만 이루어진 단어 S가 주어진다.
// 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
// 입력 :
// 첫째 줄에 단어 S가 주어진다.
// 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
// 출력 :
// 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
// 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다.
// 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
// 예제 입력 : baekjoon
// 예제 출력 : 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1

public class BOJ10809 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        String S = sc.nextLine();
        int asciiCode = 97;
        while(true) {
            if (asciiCode > 122) break;
            System.out.print(S.indexOf((char) asciiCode) + " ");
            asciiCode++;
        }

        // 방법 2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toCharArray();
        for(int i = 0; i < 26; i++) {  // 0이 아스키코드 a
            int idx = -1;
            for(int j = 0; j < charArr.length; j++) {
                if(charArr[j] - 'a' == i) {  // 알파벳과 현재 char 자리가 매핑됨
                    idx = j;
                    break;
                }
            }
            System.out.print(idx + " ");
        }
    }
}