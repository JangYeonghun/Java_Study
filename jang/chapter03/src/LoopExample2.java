import java.util.Scanner;

// 예제 3-6
// 반복문을 사용하여 다음과 같이 구구단을 출력하여 보자
/*
실행 결과
구구단 중에서 출력하고 싶은 단을 입력하시오: 9
9*1 = 9
9*2 = 18
...
 */
public class LoopExample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // sc 오브젝트, new Scanner 생성자
        int num;
        int i = 1;

        System.out.print("구구단 중에서 출력하고 싶은 단을 입력하시오: ");
        num = sc.nextInt(); // sc 라는 오브젝트 뒤에 왔으니 인스턴스 메쏘드(클래스 뒤에 오면 정적 메쏘드)

        /*
        객체와 인스턴스는 기본적으로 동일한 의미를 가지며, 클래스로부터 생성된 구체적인 데이터를 나타냅니다.
        "인스턴스"는 주로 특정 문맥에서 객체를 강조하거나 명확히 구분할 때 사용되는 용어 중 하나입니다.
        객체 지향 프로그래밍에서 클래스는 객체를 정의하고, 실제로 사용될 때 이 객체는 그 클래스의 "인스턴스"로 간주됩니다.

        객체 지향 프로그래밍에서 메소드는 클래스나 객체에 속하는 함수 또는 동작을 나타냅니다.
        메소드는 특정 객체의 상태를 조작하거나, 객체에 특화된 작업을 수행하도록 정의됩니다.
         */

        while (i < 10) {
            System.out.println(num + "*" + i + " = " + (num * i));
            i++;
        }
    }
}
