import java.util.Scanner;

// Programming Exercise 4
// 구의 반지름을 입력받아 부피를 계산하여 출력하는 프로그램을 작성하라. 입력, 출력 모두 실수
// 부피 계산하는 수식 C = 4/3(r^3)
/*
출력 결과
구의 반지름: 5.0
구의 부피: 166.66666666663
 */
public class Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, volume;

        System.out.print("구의 반지름: ");
        radius = sc.nextDouble();

        volume = 4.0 / 3 * (radius * radius * radius);
        System.out.println("구의 부피: " + volume);
    }
}
