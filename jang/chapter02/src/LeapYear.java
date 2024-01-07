import java.util.Scanner;

// 예제 2-8
// 윤년을 검사하는 프로그램을 작성해 보자
// 윤년은 연도를 4로 나누어서 나머지가 0이면 일단 윤년의 후보가 된다
// 윤년은 2가지의 추가 조건을 더 고려해야 하지만 일단 이것을 무시하고 사용해 보자
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        boolean isLeapYear;

        System.out.print("윤년 검사기 입니다.\n년도를 입력하세요: ");
        year = sc.nextInt();

        isLeapYear = year % 4 == 0;
        System.out.println(isLeapYear);
    }
}
