package bronze3.day36;

import java.util.Scanner;

// [문제]
// 문장을 읽은 뒤, 줄의 첫 글자를 대문자로 바꾸는 프로그램을 작성하시오.
// 입력 :
// 첫째 줄에 줄의 수 N이 주어진다.
// 다음 N개의 줄에는 문장이 주어진다.
// 각 문장에 들어있는 글자의 수는 30을 넘지 않는다.
// 모든 줄의 첫 번째 글자는 알파벳이다.
// 출력 : 각 줄의 첫글자를 대문자로 바꾼뒤 출력한다.
// 예제 입력 :
// 5
// powdered Toast Man
// skeletor
// Electra Woman and Dyna Girl
// she-Ra Princess of Power
// darth Vader
// 예제 출력 :
// Powdered Toast Man
// Skeletor
// Electra Woman and Dyna Girl
// She-Ra Princess of Power
// Darth Vader

public class BOJ4458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 방법 1
        int N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < N; i++) {
            String str = sc.nextLine();
            String result;
            if(str.charAt(0) >= 97) {
                char upper = (char)(str.charAt(0) - 32);
                result = upper + str.substring(1);
            } else {
                result = str;
            }
            System.out.println(result);
        }

        // 방법 2
        N = Integer.parseInt(sc.nextLine());
        sc.nextLine();
        for(int i = 0; i < N; i++) {
            String str = sc.nextLine();
            String result;
            String upper = String.valueOf(str.charAt(0)).toUpperCase();
            result = upper + str.substring(1);
            System.out.println(result);
        }
    }
}