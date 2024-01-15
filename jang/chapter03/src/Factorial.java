import java.util.Scanner;

// 예제 3-11
// 팩토리얼 값을 계산해 보자 n! = 1 x 2 x 3 x ... x n
/*
실행 결과
정수를 입력하시요:20
20!은 2432902008176640000입니다.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc는 오브젝트, new Scanner는 생성자
        long fact = 1;
        int num = 1;

        System.out.print("정수를 입력하시요:");
        num = sc.nextInt(); // sc는 오브젝트 이므로 nextInt()는 인스턴스 메소드(클래스 뒤는 정적 메소드)

        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(num + "!은 " + fact + "입니다.\n\n");

        // 오버플로우 보기
        for(int i = num; true; i++) {
            fact = fact * i;
            System.out.println(num + "!은 " + fact + "입니다.");
            num++;
            if (fact == 0) {
                break;
            }
        }
    }
}
