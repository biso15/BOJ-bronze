package bronze4.day20;

import java.util.Scanner;

// [문제]
// 이 사진을 기억하는가?
// 이 사진은 오래전부터 인터넷에 돌아다니는 사진으로, 작년 전대프연 예선 A번에서는 수학을 정말 못 하는 고등학생인 성원이의 시험지로 소개되었다.
// 저작권이 있는 사진일 수 있어 알아보기 어렵게 가공했음을 양해 바란다.
// 예선 날짜가 다가오는데도 적당한 A번 문제를 생각하지 못한 출제진은 작년 전대프연 예선 A번을 응용해서 문제를 만들기로 했다.
// 이를 위해 사진 속 문제를 찾아본 출제진은 해당 문제가 2007학년도 6월 고등학교 1학년 전국연합학력평가 수리 영역 26번임을 알게 되었다.
// 시험지를 내려받고 문제들을 살펴보던 출제진은 아래와 같은 문제를 발견했다.
// https://upload.acmicpc.net/0e0c60fe-2bec-4f1e-85f2-57b5ba88fdb1/-/preview/
// 예상했겠지만, 여러분은 이제 위의 19번 문제 세 번째 줄에 등장하는 수 '1000'을 임의의 자연수로 바꾸었을 때 그에 해당하는 답을 출력하는 프로그램을 작성해야 한다.
// 입력 : 첫 번째 줄에 자연수 n (1 ≤ n ≤ 10⁹)이 주어진다.
// 출력 :
// 첫 번째 줄에 19번 문제 세 번째 줄에 등장하는 수 '1000'을 자연수 n으로 바꾸었을 때 그에 해당하는 답의 번호를 출력한다.
// 즉, 1 이상 5 이하의 자연수 중 하나를 출력해야 한다.
// 예제 입력 : 3
// 예제 출력 : 2

public class BOJ17362 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() % 8;
        if(n == 1) {
            System.out.println(1);
        } else if(n == 2 || n == 0) {
            System.out.println(2);
        } else if(n == 3 || n == 7) {
            System.out.println(3);
        } else if(n == 4 || n == 6) {
            System.out.println(4);
        } else {
            System.out.println(5);
        }
    }
}