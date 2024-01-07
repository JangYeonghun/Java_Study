import java.util.Scanner;

// 예제 2-13
// 직사각형 넓이와 둘레를 구하여라
// 가로 세로를 각각 w와 h
/*
실행 결과:
사각형의 가로를 입력하시오: 10
사각형의 세로를 입력하시오: 5
사각형의 넓이는 50.0
사각형의 둘레는 30.0
*/
public class Box {
    public static void main(String[] args) {
        int w, h;
        double area, perimeter;
        Scanner sc = new Scanner(System.in);

        System.out.print("사각형의 가로를 입력하시오: ");
        w = sc.nextInt();

        System.out.print("사각형의 세로를 입력하시오: ");
        h = sc.nextInt();

        area = w * h;
        System.out.println("사각형의 넓이는 " + area);

        perimeter = 2 * (w + h);
        System.out.println("사각형의 둘레는 " + perimeter);
    }
}
