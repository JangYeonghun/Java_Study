import java.util.Scanner;

// Programming Exercise 1
// MyMetric 이라는 클래스를 작성하고 여기에 킬로미터를 마일로 변환하는 정적 메소드인 kiloToMile()을 작성하라
// 또 반대로 마일을 킬로미터로 변환하는 정적 메소드 mileToKilo()로 작성하라
// MyMetricTest 클래스에서 이들 정적 메소드를 호출해서 테스트해서 보자
/*
실행 결과
1km를 마일로 바꾸면 0.621388181167936
 */
class MyMetric {
    // 정적 메소드(얘들은 인스턴스에 의존하지 않는다), 매개변수
    static void kiloToMile(double kilo) {
        System.out.println(kilo + "km를 마일로 바꾸면 " + kilo * 0.62137);
    }

    static void mileToKilo(double mile) {
        System.out.println(mile + "마일을 km로 바꾸면 " + mile * 1.60934);
    }
}

public class MyMetricTest {
    public static void main(String[] args) {
        // Scanner는 클래스, sc는 오브젝트 ,new Scanner는 생성자
        Scanner sc = new Scanner(System.in);

        System.out.print("1. km to mile\n" +
                         "2. mile to km\n" +
                         "숫자를 입력하시오: ");
        // sc는 오브젝트 사용됐으니 인스턴스, .nextInt는 인스턴스 메소드
        int inputNum = sc.nextInt();

        switch (inputNum) {
            case 1:
                System.out.print("mile로 변환할 km를 입력하시오: ");
                double kilo = sc.nextDouble();
                MyMetric.kiloToMile(kilo);
                break;
            case 2:
                System.out.print("km로 변환할 mile을 입력하시오: ");
                double mile = sc.nextDouble();
                MyMetric.mileToKilo(mile);
                break;
            default:
                System.out.println("다시 입력하시오");
                break;
        }

    }
}
