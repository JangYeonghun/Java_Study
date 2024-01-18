import java.util.Scanner;

// 예제 3-8
// 사용자로부터 월의 번호를 입력받는 프로그램을 적성하여 보자. 사용자가 올바른 월 번호를 입력할 때까지 반복한다.
/*
실행 결과
올바른 월을 입력하시오 [1-12]: 13
올바른 월을 입력하시오 [1-12]: 14
올바른 월을 입력하시오 [1-12]: 0
올바른 월을 입력하시오 [1-12]: 1
사용자가 입력한 월은 1
 */
public class CheckInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc는 오브젝트, new Scanner 는 생성자
        int month;

        do {
            System.out.print("올바른 월을 입력하시오 [1-12]: ");
            month = sc.nextInt(); // sc 오브젝트 뒤에 왔으니 인스턴스 메소드(클래스 뒤에 오면 정적메소드)
        } while (month < 1 || month >12); // while 조건일때 끝내라
        System.out.println("사용자가 입력한 월은 " + month);
    }
}
