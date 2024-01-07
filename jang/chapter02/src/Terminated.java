import java.util.Scanner;

// Mini Project
// 사용자로부터 화씨 온도를 받아서 섭씨온도로 환산하여 출력하는 프로그램을 작성하시오
// 수식: C = 5/9(F-32)
/*
출력 결과
화씨온도를 입력하시오: 100.0
섭씨온도는 37.7777777777778
*/
public class Terminated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c_temp, f_temp;

        System.out.print("화씨온도를 입력하시오: ");
        f_temp = sc.nextDouble();

        c_temp = 5.0 / 9 * (f_temp - 32);

        System.out.println("섭씨온도는 " + c_temp);
    }
}
