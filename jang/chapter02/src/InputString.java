import java.util.Scanner;

// 예제 2-7
// 사용자로부터 이름과 나이를 입력받아 화면에 출력하는 프로그램을 작성하여 보자
/*
실행 결과:
이름을 입력하시오: 홍길동
나이를 입력하시오: 24
홍길동님 안녕하세요! 24살이시네요.
*/
public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;

        System.out.print("이름을 입력하시오: ");
        name = sc.nextLine();

        System.out.print("나이를 입력하시오: ");
        age = sc.nextInt();

        System.out.println(name + "님 안녕하세요! " + age + "살이시네요.");
    }
}
