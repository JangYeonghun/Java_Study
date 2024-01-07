import java.util.Scanner;

// 예제 3-5
// 1월부터 3월까지의 이름을 영어로 받아서 몇 월인지를 반환하는 프로그램 작성
/*
실행 결과
달의 이름을 입력하시오: january
1
 */
public class StringSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc는 오브젝트, new Scanner는 생성자
        String input;
        int month;

        System.out.print("달의 이름을 입력하시오: ");
        input = sc.nextLine(); // sc라는 오브젝트 뒤에 왔으니 인스턴스 메쏘드(클래스 뒤에 오면 정적 메쏘드)

        switch (input) {
            case "january":
                month = 1;
                break;
            case "february":
                month = 2;
            case "march":
                month = 3;
            default:
                month = 0;
                break;
        }
        System.out.println(month);
    }
}
