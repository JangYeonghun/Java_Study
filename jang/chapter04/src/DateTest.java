import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

// Programming Exercise 3
// 날짜를 나타내는 클래스 Date를 만들어 보자
// Date는 연도, 월, 일 등의 속성을 가지며,
// 날짜를 "2017.7.12"과 같이 출력하는 메소드 print1(),
// 날짜를 "July 12, 2012"와 같이 출력하는 print2() 등의 메소드를 가진다
// Date 클래스를 작성하고 객체를 생성하여서 테스트하라
/*
실행 결과
2012.9.5
 */
public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(2024, 1, 28);
        date.print1();
        date.print2();
    }
}

class Date {
    // 접근 지정자 private(동일클래스), 필드(멤버 변수), 인스턴스 변수
    private int year;
    private int month;
    private int day;

    // 접근 지정자 public(동일클래스, 동일패키지, 자식클래스, 전체세계), 생성자, 매개변수 year month day, 접근지정자(생성자와 필드 참조)
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // void는 반환타입 없음
    public void print1() {
        System.out.println(year + "." +
                           month + "." +
                           day);
    }

    public void print2() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);

        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd, yyyy", Locale.ENGLISH);
        String formattedDate = sdf.format(calendar.getTime());

        System.out.println(formattedDate);
    }
}