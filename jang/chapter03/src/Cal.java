import java.util.Objects;
import java.util.Scanner;

// Programming Exercise 8
// 간단한 계산기 프로그램. 먼저 사용자로 부터 하나의 문자 입력받고 2개의 숫자를 입력 받음 + - * / 을 수행, if else문 사용, 나눗셈의 경우 분모가 0 판별해야함
/*
연산을 입력하세요: *
숫자 2개를 입력하세요: 10 20
10.0 * 20.0 = 200.0
 */
public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc는 오브젝트, new Scanner는 생성자
        String calc;
        double num1, num2, result = 0;

        System.out.print("연산을 입력하세요: ");
        calc = sc.nextLine();

        System.out.print("숫자 2개를 입력하세요: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        
        if (Objects.equals(calc, "+")) {
            result = num1 + num2;
        } else if (Objects.equals(calc, "-")) {
            result = num1 - num2;
        } else if (Objects.equals(calc, "*")) {
            result = num1 * num2;
        } else if (Objects.equals(calc, "/")) {
            if (num2 != 0.0) {
                result = num1 / num2;
            } else {
                System.out.println("계산이 불가능 합니다.");
            }
        }
        System.out.println(num1 + calc + num2 + " = " + result);
    }
}
