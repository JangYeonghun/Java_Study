import java.util.Scanner;

// Programming Exercise 2
// 마일을 킬로미터로 변환하는 프로그램을 작성하라. 1마일은 1.609킬로미터와 같다.
/*
실행 결과
마일을 입력하시오: 10
10.0마일은 16.09킬로미터 입니다.
*/
public class Mile2Km {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mile, kilo;

        System.out.print("마일을 입력하시오: ");
        mile = sc.nextDouble();

        kilo = mile * 1.609;

        System.out.println(mile + "마일은 " + kilo + "킬로미터 입니다.");
    }
}
