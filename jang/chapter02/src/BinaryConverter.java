// Programming Exercise 5
// 정수(최대 3자리)를 2진수로 변환하여 출력하는 프로그램을 작성해보자
/*
출력 결과
정수: 127
127: 1111111
 */

import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, num1, num2, num3, num4, num5, num6, num7, temp;

        System.out.print("정수: ");
        input = sc.nextInt();
        temp = input;

        num1 = input % 2;
        input = input / 2;

        num2 = input % 2;
        input = input / 2;

        num3 = input % 2;
        input = input / 2;

        num4 = input % 2;
        input = input / 2;

        num5 = input % 2;
        input = input / 2;

        num6 = input % 2;
        input = input / 2;

        num7 = input % 2;
        input = input / 2;

        System.out.println(temp + ": " + num1 + num2 + num3 + num4 + num5 + num6 + num7);
    }
}
