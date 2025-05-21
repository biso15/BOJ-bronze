package bronze5.day18;

import java.text.SimpleDateFormat;
import java.util.Date;

// [문제]
// 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
// 출력 : 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
// 예제 출력 : 2015-01-24

public class BOJ10699 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(new Date()));
    }
}