import java.util.Scanner;

// Programming Exercise 4
// 사용자로부터 키를 받아 과체중 여부 알려주기
// 표준 체중 = (키 - 100) x 0.9
/*
실행 결과
키를 입력하세요: 180
몸무게를 입력하세요: 80
과제중입니다.
 */
public class Weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc는 오브젝트, new Scanner는 생성자

        int tall, weight;

        System.out.print("키를 입력하세요: ");
        tall = sc.nextInt();

        System.out.print("몸무게를 입력하세요: ");
        weight = sc.nextInt();

        if (weight > (tall - 100) * 0.9) {
            System.out.println("과체중입니다.");
        } else {
            System.out.println("정상입니다.");
        }
    }
}
