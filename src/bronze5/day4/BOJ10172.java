package bronze5.day4;

// [문제]
// 아래 예제와 같이 개를 출력하시오.
// 출력 : 개를 출력한다.
// 예제 출력 :
// |\_/|
// |q p|   /}
// ( 0 )"""\
// |"^"`    |
// ||_/=\\__|

public class BOJ10172 {
    public static void main(String[] args) {
        // ( 0 )"""\ 그대로 사용하면 컴파일 오류 발생
        // "\"를 추가해서 이스케이프 처리를 해야함
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }
}
