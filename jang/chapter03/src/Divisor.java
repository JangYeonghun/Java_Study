import java.util.Scanner;

// 예제 3-12
// 약수 출력하는 프로그램
/*
실행 결과
양의 정수를 입력하시오: 100
100의 약수는 다음과 같습니다.
1 2 3 4 10 20 25 50 100
 */
public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc는 오브젝트, new Scanner는 생성자
        int num;

        System.out.print("양의 정수를 입력하시오: ");
        num = sc.nextInt(); // sc는 오브젝트인데 사용되니 클래스의 인스턴스라 부른다. 그래서 nextInt는 인스턴스 메소드(클래스 뒤에는 정적메소드)

        for(int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
