import java.util.Scanner;

// 예제 3-7
// 10! 계산하는 프로그램 작성
/*
실행 결과
합계 = 55
 */
public class CalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc 오브젝트, new Scanner 생성자
        int num;
        int sum = 0;

        System.out.print("숫자를 입력하시오: ");
        num = sc.nextInt(); // sc 오브젝트 뒤에 인스턴스 메소드(클래스 뒤는 정적 메소드)

        while (num >= 1) { // while은 ~동안 인걸 잊지 말자
            sum += num;
            num--;
        }
        System.out.println("합계 = " + sum);
    }
}
