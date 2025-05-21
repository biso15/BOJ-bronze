package bronze5.day4;

// [문제]
// 아래 예제와 같이 고양이를 출력하시오.
// 출력 : 고양이를 출력한다.
// 예제 출력 :
// \    /\
//  )  ( ')
// (  /  )
//  \(__)|

public class BOJ10171 {
    public static void main(String[] args) {
        // \    /\ 그대로 사용하면 컴파일 오류 발생
        // "\"를 추가해서 이스케이프 처리를 해야함
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }
}
